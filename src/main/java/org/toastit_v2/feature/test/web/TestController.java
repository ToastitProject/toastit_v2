package org.toastit_v2.feature.test.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.toastit_v2.core.common.application.code.CommonExceptionCode;
import org.toastit_v2.core.common.application.config.swagger.ExceptionCodeAnnotations;
import org.toastit_v2.feature.test.domain.TestCreate;
import org.toastit_v2.feature.test.application.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toastit_v2.feature.test.web.request.TestCreateRequest;

@Tag(
        name = "Health Check",
        description = "API 서버 상태 확인"
)
@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @Operation(
            summary = "테스트 코드",
            description = "테스트 코드 생성"
    )
    @ExceptionCodeAnnotations({CommonExceptionCode.FILED_ERROR})
    @PostMapping
    public String create(@RequestBody @Valid TestCreateRequest request) {

        testService.createTest(TestCreate.from(request));

        return "테스트 코드 실행 성공";
    }

}
