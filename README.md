# 📽️ 프로젝트 개요

## 📝 아이디어 배경

### **기획 배경**  
1. 초기 팀원들의 다양한 관심사에서 출발한 여러 아이디어 :
  - 개인 상태에 맞춘 건강 식품 추천 플랫폼
  - 비건 단계별 대체 육류 소개 플랫폼
  - 퍼스널 컬러에 따른 맞춤 상품 추천 플랫폼
  - 반려동물 소개팅 플랫폼
  - 칵테일 레시피 및 알고리즘 기반 추천 플랫폼

2. **칵테일 서비스 플랫폼 선정 이유**  
  - 접근이 용이한 데이터
  - AWS를 활용한 이미지 기반 서비스와의 연계 가능성
  - 강의에서 배운 기술 활용 기회
  - 유사 서비스 부족으로 차별화 가능
  - 다양한 API와의 결합 가능성

### **제한사항**  
- 개인 의학 정보 활용 불가
- 추천 상품의 범위가 지나치게 광범위함
- 기존 서비스 아이디어의 흥미 유발 한계
- 문화적 제한점 고려 필요

<br>

## 📄 아이디어 설명

### **서비스 개요**  
건전한 음주 문화를 조성하고, 개인의 취향에 맞춘 칵테일 정보를 제공하며 음주 경험을 개선하는 플랫폼.  
추가적으로 주류 및 음료 업계 종사자들에게 유용한 정보와 마케팅 플랫폼 제공.

### **주요 기능**  
1. **칵테일 레시피 조회 및 입력**  
   - 기존 칵테일 레시피 상세 조회  
   - 사용자 창작 레시피 입력 및 공유  

2. **맞춤형 칵테일 추천**  
   - 위치, 날씨, 계절 등을 기반으로 개인화된 추천 제공  
   - 향후 MBTI, 퍼스널컬러 활용 추천 기능 도입 계획  

3. **커뮤니티 기능**  
   - 좋아요, 팔로우 기능으로 사용자 간 상호작용 촉진  
   - 레시피 공유 및 평가 플랫폼  

4. **상세 검색 기능**  
   - 재료, 술잔 종류, 칵테일 타입 등 카테고리 검색  

5. **사용자 친화적 인터페이스**  
   - 직관적인 UI/UX 제공  

6. **기술적 특징**  
   - Amazon S3를 활용한 이미지 저장  
   - MongoDB와 MySQL 데이터 관리  
   - 네이버 데이터랩 API를 통한 인기 칵테일 분석  
   - 위치 및 날씨 API 활용  

<br>

## 🚀 기대 효과

1. **사용자 편의성 증대**  
   - 다양한 레시피를 간편하게 조회 및 검색  
   - 커스텀 레시피 입력 및 관리 가능  
   - 좋아요와 팔로우를 통해 선호 콘텐츠 추적  

2. **커뮤니티 활성화**  
   - 사용자 간 커스텀 레시피 공유 및 소통 강화  
   - 관심 분야가 유사한 사용자 네트워킹  

3. **개인화된 경험 제공**  
   - 좋아요 데이터를 활용한 맞춤형 추천  
   - 개인화된 레시피 피드로 높은 만족도 유도  

4. **콘텐츠 품질 향상**  
   - 좋아요 및 팔로워 수 기반 레시피 품질 평가  
   - 인기 콘텐츠 우선 노출  

<br>

## 🛠️ 기술 스택 
- **Spring Security** : 인증 및 데이터 보호  
- **Spring Boot** : 확장성과 유지보수성 고려  
- **JPA** : 객체지향 데이터 접근  
- **Redis** : 키-값 저장으로 사용자 인증 처리  
- **MySQL & MongoDB** : 대량 데이터 처리 및 유연성  
- **JWT**: Spring Security와 통합된 인증  
- **OAuth 2.0** : 소셜 로그인 및 보안 강화  
- **Docker** : 경량 가상화로 환경 설정 단순화  
- **Gradle** : 유연한 의존성 관리  

<br>

## 📲 CI/CD 및 배포

- **GitHub**: 버전 관리 및 협업  
- **GitHub Actions**: 빌드 및 테스트 자동화  
- **AWS**: 서버 배포 및 클라우드 서비스 활용  

<br>

## ⌨️ 개발 도구  

- **IntelliJ IDEA**: 프로젝트 개발 및 관리  
- **Visual Studio Code**: 문서 및 환경 설정 파일 관리  
- **Python IDLE**: 데이터 전처리  

<br>

## 📮 협업 도구  

- **Slack**: 실시간 기록 및 협업  
- **Discord**: 음성 대화 및 파일 공유  
- **Notion**: 비즈니스 로직 및 설계 공유  

<br>

## 👥 업무 분담

- **신효승 (PM)**: JWT 인증, 초기 설정, CI/CD  
- **손여산 (PS)**: 사용자 레시피, 공통 응답 처리  
- **강신웅 (CR)**: 회원 정보 관리, 이미지 처리  
- **김영훈 (CM)**: 데이터 분석, 기본 레시피  

<br>

## 📏 그라운드 룰  

- **네이밍 규칙**:  
   - Class: PascalCase  
   - Variable: camelCase  
   - Constant: UPPER_CASE  
- **Git 전략**: GitHub-Flow
- **들여쓰기**: 4 Space  

<br>

## 📚 문서 관리  

1. **기술 문서**: 노션에 기록  
2. **보고서 작성**:  
   - Slack, GitHub 기록 정리 후 노션에 작성  
   - 최종 보고서 제출 및 기록 보관  

<br>

# 📊 Grafana 모니터링 가이드

이 가이드는 Grafana를 사용한 JVM 모니터링의 주요 지표와 해석 방법을 설명합니다.

## 1. ⚡ Quick Facts (시스템 기본 상태 지표)

- Heap 영역: 70% 이하 유지 권장
- Non-Heap 영역: 20% 이하 유지 권장

성능 이슈 발생 시 개선 방안:
- JVM 최대 힙 크기 증가 검토
- 메모리 누수 여부 확인
- GC 로그 분석을 통한 메모리 사용 패턴 파악
- 힙 덤프 분석을 통한 문제 객체 식별

## 2. 💾 JVM 메모리 모니터링

### 2.1 기본 메모리 지표
- Used/Committed 비율: 70% 이하 유지 권장
- 급격한 증가/감소 패턴이 없는 안정적인 그래프 형태가 이상적

메모리 모니터링 시 주의점:
- 일시적인 피크는 정상일 수 있으나, 지속적인 증가 패턴은 주의 필요
- 주기적인 메모리 덤프 분석으로 추이 관찰 권장
- 업무 시간대별 패턴 분석 필요

### 2.2 Heap 영역 상세
1. Eden Space
   - 새로운 객체 할당 영역
   - 빈번한 GC는 정상적인 현상
   - 일시적인 높은 사용률 허용
   - 모니터링 포인트:
     - 객체 생성 속도
     - Minor GC 빈도
     - GC 후 회수되는 메모리 비율

2. Survivor Space
   - Minor GC 후 생존 객체 보관
   - Eden Space의 10-20% 수준이 정상
   - 비정상 패턴:
     - Survivor 영역의 급격한 증가
     - 과도한 객체 이동

3. Tenured Generation (Old Generation)
   - 장기 생존 객체 보관
   - 사용률 70-75% 이하 유지 권장
   - Full GC 후 정상적인 메모리 회수와 완만한 증가 패턴이 이상적
   - 모니터링 포인트:
     - Full GC 빈도
     - GC 후 메모리 회수율
     - 메모리 증가 속도

### 2.3 Non-Heap 영역 상세
1. Metaspace
   - 클래스 메타데이터 저장
   - 초기 로딩 후 안정화되어야 함
   - 급격한 증가 패턴은 비정상
   - 주의사항:
     - 동적 클래스 로딩이 많은 경우 증가할 수 있음
     - 메모리 릭 가능성 주시

2. Compressed Class Space
   - Klass 포인터 저장 영역
   - 80% 이하 유지 권장
   - 안정적인 수준 유지 필요
   - 저장 정보:
     - 클래스 이름
     - 상속 관계
     - 메서드 테이블
     - 필드 정보
     - 접근 제어자
     - 인터페이스 정보

3. Code Cache
   - 세 가지 영역으로 구분:
     - non-nmethods: JVM 운영용 내부 코드
     - profiled nmethods: 자주 사용되는 메서드의 최적화 코드 (Level 1-3)
     - non-profiled nmethods: 덜 사용되는 메서드의 컴파일 코드 (Level 4)
   - ReservedCodeCacheSize의 80% 이하 유지 권장
   - 모니터링 포인트:
     - JIT 컴파일 빈도
     - 코드 캐시 사용량 증가 패턴
     - 최적화 레벨별 분포

## 3. 🧹 Garbage Collection

### 3.1 Collection 지표
- Minor GC (Young GC)
  - 주기적 발생 정상
  - 급격한 증가 패턴은 주의 필요
  - 모니터링 포인트:
    - 발생 빈도
    - 수행 시간
    - 회수된 메모리양

- Major GC (Full GC)
  - 드물게 발생해야 정상
  - 평탄한 그래프 유지 필요
  - 주의사항:
    - 빈번한 Full GC는 메모리 부족 의심
    - 장시간 Full GC는 성능 저하 유발

### 3.2 Pause Duration
- Minor GC: 10-50ms 정상 범위
- Major GC: 100ms-1s 정상 범위
- 초과 시 어플리케이션 일시 중지 발생 가능
- 최적화 방안:
  - GC 알고리즘 튜닝
  - 힙 사이즈 조정
  - GC 로그 상세 분석

### 3.3 메모리 할당/승격
- Allocated: Eden 영역 신규 할당량
- Promoted: Old 영역 승격량
- Promoted는 Allocated보다 현저히 낮아야 정상
- 모니터링 포인트:
  - 객체 생성 속도
  - 승격 비율
  - 메모리 사용 패턴

## 4. 📚 클래스 로딩

### 4.1 Classes Loaded
- 초기 급증 후 안정화가 정상
- 간헐적 소폭 증가는 허용
- 지속적 증가나 급격한 변동은 비정상
- 주의사항:
  - 동적 클래스 로딩 패턴 확인
  - 메모리 릭 가능성 점검
  - 클래스로더 계층 구조 검토

### 4.2 Classes Unloaded
- Major GC와 연계하여 발생
- 간헐적 발생, 낮은 수준 유지가 정상
- 빈번하거나 대량 처리는 비정상
- 모니터링 포인트:
  - 언로드 빈도
  - 한 번에 언로드되는 클래스 수
  - GC 발생과의 연관성

## 5. 🔄 Buffer Pools

### 5.1 Direct Buffer
- I/O 작업용 네이티브 메모리 영역
- 초기 할당 후 안정적 유지 필요
- 급격한 변동은 비정상
- 최적화 고려사항:
  - 버퍼 크기 설정
  - 재사용 정책
  - 메모리 파편화 관리

### 5.2 Mapped Buffer
- 파일 메모리 직접 매핑 영역
- 필요 시 할당/해제
- 파일 처리량에 따른 변동은 정상
- 사용 시나리오:
  - 대용량 파일 처리
  - 빈번한 파일 I/O
  - 메모리 매핑 필요 상황

## 6. 🎯 모니터링 권장 사항

### 6.1 일반적인 모니터링 원칙
- 베이스라인 측정 및 문서화
- 정기적인 트렌드 분석
- 경보 임계값 설정
- 로그 연계 분석

### 6.2 주요 경보 설정 권장사항
- Heap 사용률: 85% 이상
- Full GC 빈도: 시간당 2회 이상
- GC Pause Time: Major GC 1초 이상
- CPU 사용률: 지속적 80% 이상
- 클래스 로딩: 급격한 증가

### 6.3 문제 해결 접근 방법
1. 증상 식별
2. 메트릭 수집 및 분석
3. 로그 분석
4. 힙 덤프 분석 (필요시)
5. 원인 파악 및 조치
6. 모니터링 강화

<br>
