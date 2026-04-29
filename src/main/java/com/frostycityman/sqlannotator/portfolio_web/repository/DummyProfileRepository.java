package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ContactInfoDto;
import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProfileSummaryDto;
import com.frostycityman.sqlannotator.portfolio_web.domain.dto.TechStackGroupDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DummyProfileRepository implements ProfileRepository {

    @Override
    public ProfileSummaryDto findProfileSummary() {
        return new ProfileSummaryDto(
                "김도훈",
                "백엔드·인프라 통합 엔지니어",
                "Spring Boot 기반 엔터프라이즈 백엔드 개발과 AWS·Linux 기반 인프라 운영을 함께 수행해온 엔지니어입니다. 공공 및 기업 프로젝트에서 Java/Spring Boot, Oracle/PostgreSQL 기반 업무 시스템 개발, 인증 및 권한 구조 설계, API 문서화, Docker 및 GitLab 기반 운영 환경 구성 경험을 보유하고 있습니다.",
                List.of("Java", "Spring Boot", "Oracle", "PostgreSQL", "AWS", "Docker", "Linux", "OAuth2/OIDC", "GitLab CI/CD", "Swagger / OpenAPI"),
                "기능 구현에 머무르지 않고 인증, 권한, 배포, 운영 이슈 대응까지 함께 다루며 서비스 전체 구조를 안정적으로 운영하는 데 강점을 가진 엔지니어입니다.",
                "/image/profile.jpg",
                "김도훈 프로필 사진",
                List.of(
                        "폐쇄망 및 운영 제약 환경에서 서버 구성, Oracle 컨테이너 운영, 배포 자동화, 인증 연동, 운영 이슈 대응까지 수행하며 백엔드와 인프라를 통합적으로 다뤄왔습니다. 단순 기능 개발보다 실제로 안정적으로 운영되는 구조를 만드는 데 무게를 두고 일해왔습니다.",
                        "Hybe 개인 외주 프로젝트에서는 Google Maps 및 Places API를 기반으로 위치·장소 정보를 조회하는 서비스를 개발하며 Spring Boot 백엔드, PostgreSQL/Aurora 연동, Google OAuth2/OIDC 인증, AWS SSM Parameter Store 및 AssumeRole 기반 설정 구조까지 함께 다뤘습니다. 다중 인스턴스 환경에서 발생한 인증과 세션 이슈를 로그 기반으로 분석하며 운영 안정성 관점을 확장했습니다.",
                        "또한 반복적인 SQL 작성 비효율을 줄이기 위해 SQL 자동 주석 생성 도구와 IntelliJ 플러그인 개발을 직접 구상하고 진행했습니다. 기능 구현을 넘어 운영 표준화, 자동화, 개발 생산성 향상까지 함께 다루는 엔지니어로 성장하는 것을 목표로 하고 있습니다."
                ),
                List.of(
                        "Spring Boot 기반 백엔드 설계 및 개발",
                        "Oracle / PostgreSQL 기반 데이터 처리 및 업무 로직 구현",
                        "AWS / Linux / Docker / Tomcat 기반 인프라 구축 및 운영",
                        "OAuth2 / OIDC 기반 인증 및 권한 구조 설계",
                        "GitHub /GitLab / CI/CD / 배포 자동화 운영 경험",
                        "Swagger / OpenAPI 기반 API 문서화",
                        "운영 로그 분석 및 장애 원인 추적",
                        "개발 생산성 향상을 위한 도구 및 플러그인 개발"
                ),
                "개발자의 역할은 단순 구현이 아니라 서비스가 안정적으로 운영되도록 전체 구조를 책임지는 일이라고 생각합니다. 앞으로도 백엔드 개발 역량을 기반으로 인프라, 배포 자동화, 운영 안정화까지 함께 다루는 엔지니어로 성장하며 조직에 실질적인 기여를 하고자 합니다.",
                List.of(
                        new TechStackGroupDto(
                                "Backend",
                                List.of("Java", "Spring Boot", "Spring Security", "REST API", "Swagger / OpenAPI", "MyBatis")
                        ),
                        new TechStackGroupDto(
                                "Database",
                                List.of("Oracle", "PostgreSQL", "SQL", "관계형 데이터베이스 설계 및 운영")
                        ),
                        new TechStackGroupDto(
                                "Infra / DevOps",
                                List.of("AWS", "EC2", "SSM Parameter Store", "Docker", "Linux", "Tomcat", "GitLab", "Nexus", "CI/CD")
                        ),
                        new TechStackGroupDto(
                                "Frontend / UI",
                                List.of("JSP", "JavaScript", "jQuery", "Thymeleaf", "Nexacro", "WebSquare", "exBuilder")
                        ),
                        new TechStackGroupDto(
                                "Tools",
                                List.of("IntelliJ IDEA", "Git", "GitLab")
                        )
                ),
                List.of(
                        "주식회사더블유스피치커뮤니케이션 · 2020.12 ~ 2022.04 · 비IT 직군 경력 (상세 내용은 별도 요청 시 제공)",
                        "주식회사키컴즈 · 2019.07 ~ 2020.03 · 비IT 직군 경력 (상세 내용은 별도 요청 시 제공)"
                ),
                "동양미래대학교 경영정보학과 졸업",
                new ContactInfoDto(
                        "010-9143-7173",
                        "valentine9143@gmail.com",
                        "https://github.com/FrostyCityMan",
                        "https://github.com/FrostyCityMan",
                        "백엔드 개발과 인프라 운영을 함께 고민하는 포지션, 협업 제안, 프로젝트 문의를 언제든지 환영합니다."
                )
        );
    }
}
