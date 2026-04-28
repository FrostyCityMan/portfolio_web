package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProjectDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DummyProjectRepository implements ProjectRepository {

    @Override
    public List<ProjectDto> findAll() {
        return List.of(
                new ProjectDto(
                        "Hybe Casting Map / Web 프로젝트",
                        "개인 외주 프로젝트",
                        "2026.02 ~ 2026.04",
                        "Google Maps 및 Places API를 기반으로 위치·장소 정보를 조회하고, Spring Boot 백엔드와 AWS 환경을 연계해 서비스 기능과 운영 환경을 함께 구성한 지도 기반 캐스팅 지원 웹 서비스입니다.",
                        "백엔드·인프라 엔지니어",
                        List.of(
                                "Spring Boot 기반 웹 서비스 백엔드 개발 및 운영 지원",
                                "Google Maps JavaScript API 및 Places API 연동 기능 개발",
                                "Google OAuth2 / OIDC 로그인 연동 및 인증 이슈 분석 수행",
                                "PostgreSQL / Aurora 기반 데이터 연동 구조 적용",
                                "AWS SSM Parameter Store 및 AssumeRole 기반 환경설정·비밀정보 조회 구조 구성",
                                "다중 인스턴스 환경에서 세션 및 인증 관련 이슈 분석"
                        ),
                        List.of("Java", "Spring Boot", "Spring Security", "PostgreSQL", "AWS", "SSM Parameter Store", "Docker", "GitLab CI/CD", "Google Maps API", "Google Places API", "OAuth2", "OIDC"),
                        List.of(
                                "민간 서비스형 프로젝트에서 백엔드 개발과 클라우드 환경 연계를 함께 수행",
                                "Google OAuth/OIDC 인증 흐름에서 발생하는 운영 이슈 분석 경험",
                                "AWS Parameter Store 및 AssumeRole 기반 설정 관리 구조 적용 경험",
                                "다중 인스턴스 환경에서 인증·세션 이슈를 분석하며 운영 안정성 관점 확보"
                        ),
                        true
                ),
                new ProjectDto(
                        "식약처 디지털의료제품 전주기 관리시스템 구축",
                        "주식회사 퓨처플랫폼 · 공공 프로젝트",
                        "2025.07 ~ 2026.03",
                        "공공 업무 시스템의 백엔드 개발과 개발 서버 인프라 구성 및 운영 지원을 함께 수행한 구축 프로젝트입니다.",
                        "백엔드 개발 및 인프라 운영 지원",
                        List.of(
                                "Java 기반 업무 시스템 백엔드 개발 수행",
                                "Swagger 기반 API 문서화 및 인터페이스 명세 정비",
                                "Oracle 기반 데이터 처리 및 업무 로직 개발",
                                "폐쇄망 환경의 개발서버 구축 및 운영 지원",
                                "Docker 기반 Oracle 19c 운영 환경 구성 및 Tomcat 멀티 인스턴스 운영",
                                "WAR 배포 절차 정리 및 배포 자동화 스크립트 적용"
                        ),
                        List.of("Java", "Spring Boot", "Oracle", "Docker", "Linux", "Tomcat", "Swagger", "Nexacro", "GitLab", "Nexus"),
                        List.of(
                                "폐쇄망 환경의 인프라 표준화와 운영 지원 경험",
                                "Oracle 컨테이너와 Tomcat 멀티 인스턴스를 함께 운영한 경험",
                                "배포 자동화와 보안 모듈 연동 이슈 대응 경험"
                        ),
                        true
                ),
                new ProjectDto(
                        "SQL 자동 주석 생성 도구 / IntelliJ 플러그인 개발",
                        "개인 개발",
                        "개인 진행 프로젝트",
                        "SQL 작성 시 컬럼 및 테이블 메타정보를 기반으로 주석을 자동 생성하는 개발 생산성 도구와 IntelliJ 플러그인 기능을 구상하고 개발한 프로젝트입니다.",
                        "도구 설계 및 플러그인 개발",
                        List.of(
                                "SQLite 기반 메타데이터 조회 구조 설계",
                                "GUI 기반 SQL 입력 및 자동 주석 생성 기능 구상",
                                "IntelliJ 플러그인 형태의 인라인 SQL 주석 삽입 기능 개발 진행",
                                "정규식 기반 방식에서 PSI 기반 구조로의 전환 검토",
                                "INSERT / UPDATE / DELETE 구문 지원 및 주석 형식 커스터마이징 확장 계획 수립"
                        ),
                        List.of("Kotlin", "IntelliJ Platform Plugin", "SQL Parser", "SQLite", "PSI", "ANTLR"),
                        List.of(
                                "반복 업무를 줄이는 생산성 도구를 직접 설계·개발한 경험",
                                "도메인 문제를 IDE 플러그인 형태로 확장해본 경험",
                                "정규식에서 PSI 기반 구조로 개선 방향을 검토한 경험"
                        ),
                        true
                ),
                new ProjectDto(
                        "건강보험심사평가원 공급 관련 포털 구축",
                        "엔에이치엔인재아이엔씨 주식회사 · 공공 프로젝트",
                        "2025.04 ~ 2025.07",
                        "공급 관련 포털 시스템에서 백엔드 기능 개발과 화면 연계 기능 구현을 수행한 프로젝트입니다.",
                        "백엔드 기능 개발",
                        List.of(
                                "공급 관련 포털 시스템의 백엔드 기능 개발 수행",
                                "Oracle 기반 데이터 처리 및 화면 연계 로직 구현",
                                "Swagger 기반 API 문서화 및 협업 지원",
                                "exBuilder 기반 화면과 연계되는 업무 기능 개발",
                                "운영 이슈 대응 및 기능 수정 반영"
                        ),
                        List.of("Java", "Oracle", "Swagger", "exBuilder"),
                        List.of(
                                "공공 포털 시스템의 화면-백엔드 연계 경험",
                                "Swagger 문서화 기반 협업 지원 경험"
                        ),
                        false
                )
        );
    }
}
