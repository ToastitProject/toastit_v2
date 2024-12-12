package org.toastit_v2.feature.basecocktail.infrastructure.persistence.mongodb.custom;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.toastit_v2.feature.basecocktail.domain.CocktailSearch;
import org.toastit_v2.feature.basecocktail.domain.SearchType; // SearchType import 추가
import org.toastit_v2.feature.basecocktail.domain.AlcoholType; // AlcoholType import 추가
import org.toastit_v2.feature.basecocktail.infrastructure.persistence.mongodb.CocktailDocument;

import java.util.List;

@RequiredArgsConstructor
public class CustomCocktailRepositoryImpl implements CustomCocktailRepository {

    private final MongoTemplate mongoTemplate;

    @Override
    public Page<CocktailDocument> search(CocktailSearch searchCondition, Pageable pageable) {
        Criteria criteria = new Criteria();

        if (searchCondition.getSearchType() != null) {
            switch (searchCondition.getSearchType()) {
                case ALCOHOL_ONLY:
                    // 알코올 유무만 검색
                    if (searchCondition.getAlcoholType() != null) {
                        criteria = Criteria.where("strAlcoholic").regex(searchCondition.getAlcoholType().toString(), "i");
                    }
                    break;

                case MULTIPLE_INGREDIENTS:
                    // 복합 재료 검색
                    if (searchCondition.getIngredients() != null && !searchCondition.getIngredients().isEmpty()) {
                        criteria = createIngredientsSearchCriteria(searchCondition.getIngredients());
                    }
                    break;

                case SINGLE_KEYWORD:
                    // 단일 키워드 검색 (칵테일 이름 또는 단일 재료)
                    if (searchCondition.getKeyword() != null) {
                        criteria = new Criteria().orOperator(
                                Criteria.where("strDrink").regex(searchCondition.getKeyword(), "i"),
                                createSingleIngredientCriteria(searchCondition.getKeyword())
                        );
                    }
                    break;
            }

            // 알코올 타입 조건 추가
            if (searchCondition.getAlcoholType() != null &&
                    searchCondition.getSearchType() != SearchType.ALCOHOL_ONLY) {
                criteria = new Criteria().andOperator(
                        criteria,
                        Criteria.where("strAlcoholic").regex(searchCondition.getAlcoholType().toString(), "i")
                );
            }
        }

        Query query = new Query(criteria).with(pageable);
        List<CocktailDocument> cocktails = mongoTemplate.find(query, CocktailDocument.class);
        long total = mongoTemplate.count(Query.of(query).limit(-1).skip(-1), CocktailDocument.class);

        return new PageImpl<>(cocktails, pageable, total);
    }

    private Criteria createIngredientsSearchCriteria(List<String> ingredients) {
        List<Criteria> ingredientsCriteria = ingredients.stream()
                .map(this::createSingleIngredientCriteria)
                .toList();

        return new Criteria().andOperator(ingredientsCriteria.toArray(new Criteria[0]));
    }

    private Criteria createSingleIngredientCriteria(String ingredient) {
        return new Criteria().orOperator(
                Criteria.where("strIngredient1").regex(ingredient, "i"),
                Criteria.where("strIngredient2").regex(ingredient, "i"),
                Criteria.where("strIngredient3").regex(ingredient, "i"),
                Criteria.where("strIngredient4").regex(ingredient, "i"),
                Criteria.where("strIngredient5").regex(ingredient, "i"),
                Criteria.where("strIngredient6").regex(ingredient, "i"),
                Criteria.where("strIngredient7").regex(ingredient, "i"),
                Criteria.where("strIngredient8").regex(ingredient, "i"),
                Criteria.where("strIngredient9").regex(ingredient, "i"),
                Criteria.where("strIngredient10").regex(ingredient, "i"),
                Criteria.where("strIngredient11").regex(ingredient, "i")
        );
    }

    @Override
    public List<CocktailDocument> findRandom(int count) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.sample(count)
        );

        AggregationResults<CocktailDocument> results = mongoTemplate.aggregate(
                aggregation, "test", CocktailDocument.class
        );

        return results.getMappedResults();
    }
}