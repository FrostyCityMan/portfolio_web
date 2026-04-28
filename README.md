# Portfolio Web Skeleton

Spring Boot 기반 개인 포트폴리오 웹 서비스의 초기 골격 프로젝트입니다.  
현재 단계는 **기능 완성보다 구조 설계와 실행 기반 확보**에 초점을 두고 있습니다.

## 기술 스택

- Java 21
- Spring Boot 3.5.x
- Gradle
- Thymeleaf
- H2 / PostgreSQL 전환 고려
- springdoc-openapi (Swagger UI)

## 실행 방법

### 1. 애플리케이션 실행

```bash
./gradlew bootRun
```

Windows PowerShell에서는 아래 명령을 사용합니다.

```powershell
.\gradlew bootRun
```

### 2. 접속 경로

- 메인 페이지: `http://localhost:8080/`
- 소개 페이지: `http://localhost:8080/about`
- 프로젝트 페이지: `http://localhost:8080/projects`
- 경력 페이지: `http://localhost:8080/experience`
- 연락처 페이지: `http://localhost:8080/contact`
- Swagger UI: `http://localhost:8080/swagger-ui/index.html`
- OpenAPI Docs: `http://localhost:8080/v3/api-docs`
- H2 Console: `http://localhost:8080/h2-console`

## 테스트 실행

```powershell
.\gradlew test
```

## 프로젝트 구조

```text
src/main/java/com/frostycityman/sqlannotator/portfolio_web
├─ common
│  ├─ exception
│  └─ response
├─ config
├─ controller
│  ├─ api
│  └─ page
├─ domain
│  └─ dto
├─ repository
├─ service
│  └─ impl
└─ PortfolioWebApplication.java

src/main/resources
├─ static
│  ├─ css
│  └─ js
├─ templates
│  ├─ fragments
│  ├─ layout
│  └─ page
└─ application.yml
```

## 핵심 구성 설명

### 페이지 라우팅

- `PortfolioPageController`
  - `/`
  - `/about`
  - `/projects`
  - `/experience`
  - `/contact`

### 샘플 API

- `GET /api/v1/projects`
- `GET /api/v1/experiences`

공통 응답 포맷 예시:

```json
{
  "success": true,
  "data": [],
  "message": "정상 처리되었습니다."
}
```

### 공통 예외 처리

- `ApiResponse`로 성공/실패 응답 형식 통일
- `GlobalExceptionHandler`로 검증 오류 및 공통 예외 처리

### 더미 데이터 구조

- `repository` 계층에서 현재는 더미 데이터를 제공
- `service` 계층을 통해 화면/API에 전달
- 추후 DB 연동 시 repository 구현체 교체 중심으로 확장 가능

## 확장 포인트

### 1. 관리자 페이지

- 관리자 로그인
- 프로젝트 등록/수정/삭제
- 경력 등록/수정/삭제
- 문의 내역 조회

### 2. 데이터 영속화

- H2 기반 로컬 개발
- PostgreSQL 기반 운영 전환
- JPA 엔티티 또는 MyBatis/QueryDSL 등으로 확장 가능

### 3. 문의 기능

- 연락처 페이지 폼 추가
- 문의 저장 API 추가
- 이메일/Slack 알림 연동

### 4. 보안 확장

- 향후 Spring Security 추가
- 관리자 영역 접근 제어
- Swagger 접근 정책 분리
