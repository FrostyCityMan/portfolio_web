package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ExperienceDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DummyExperienceRepository implements ExperienceRepository {

    @Override
    public List<ExperienceDto> findAll() {
        return List.of(
                new ExperienceDto(
                        "주식회사 퓨처플랫폼",
                        "정규직 / 과장",
                        "2025.07 ~ 2026.03",
                        "식약처 디지털의료제품 전주기 관리시스템 구축",
                        "공공 업무 시스템의 백엔드 개발과 개발 서버 인프라 구성 및 운영 지원을 함께 수행했습니다.",
                        List.of(
                                "Java 기반 업무 시스템 백엔드 개발 수행",
                                "Swagger 기반 API 문서화 및 인터페이스 명세 정비",
                                "Oracle 기반 데이터 처리 및 업무 로직 개발",
                                "폐쇄망 환경의 개발서버 구축 및 운영 지원",
                                "Linux 서버 계정, 권한, sudo 정책 구성 및 운영 환경 표준화",
                                "Docker 기반 Oracle 19c 운영 환경 구성 및 SID/PDB 구조 관리",
                                "Tomcat 멀티 인스턴스 운영 구조 구성 및 서비스 관리 지원",
                                "WAR 배포 절차 정리 및 배포 자동화 스크립트 적용",
                                "GitLab 폐쇄망 구축 및 연계 운영 지원",
                                "Nexus Repository 설치 및 권한 이슈 분석 지원",
                                "보안 모듈 연동 및 운영 이슈 대응 수행"
                        ),
                        List.of("Java", "Spring Boot", "Oracle", "Docker", "Linux", "Tomcat", "Swagger", "Nexacro", "GitLab", "Nexus")
                ),
                new ExperienceDto(
                        "엔에이치엔인재아이엔씨 주식회사",
                        "계약직 / 대리",
                        "2025.04 ~ 2025.07",
                        "건강보험심사평가원 공급 관련 포털 구축",
                        "백엔드 기능 개발과 화면 연계 기능 구현을 담당했습니다.",
                        List.of(
                                "공급 관련 포털 시스템의 백엔드 기능 개발 수행",
                                "Oracle 기반 데이터 처리 및 화면 연계 로직 구현",
                                "Swagger 기반 API 문서화 및 협업 지원",
                                "exBuilder 기반 화면과 연계되는 업무 기능 개발",
                                "운영 이슈 대응 및 기능 수정 반영"
                        ),
                        List.of("Java", "Oracle", "Swagger", "exBuilder")
                ),
                new ExperienceDto(
                        "주식회사 케어비즈",
                        "정규직 / 주임",
                        "2023.01 ~ 2025.04",
                        "부산도시공사 임대주택전자청약시스템 유지보수",
                        "통합공공임대 인트라넷 및 포털 시스템 유지보수를 수행했습니다.",
                        List.of(
                                "통합공공임대 인트라넷 및 포털 시스템 유지보수 수행",
                                "기존 기능 개선 및 운영 이슈 대응",
                                "사용자 요구사항 반영에 따른 화면 및 백엔드 로직 수정",
                                "Oracle 기반 데이터 처리 로직 점검 및 보완",
                                "안정적인 서비스 운영을 위한 결함 수정 및 기능 보강 수행"
                        ),
                        List.of("Java", "JSP", "Nexacro", "Oracle")
                ),
                new ExperienceDto(
                        "주식회사 케어비즈",
                        "정규직 / 주임",
                        "2023.01 ~ 2025.04",
                        "서울도시공사 임대주택전자청약시스템 구축",
                        "계약업무 인트라넷 시스템 구축 프로젝트를 수행했습니다.",
                        List.of(
                                "WebSquare 기반 사용자 화면 개발 및 Java 기반 업무 로직 구현",
                                "Oracle DB 연계 및 계약 관련 데이터 처리 기능 개발",
                                "사용자 업무 흐름에 맞춘 입력·조회·처리 기능 구현",
                                "업무 시스템 구축 과정에서 화면-백엔드 간 연계 로직 개발 수행"
                        ),
                        List.of("Java", "WebSquare", "Oracle")
                ),
                new ExperienceDto(
                        "주식회사 케어비즈",
                        "정규직 / 주임",
                        "2023.01 ~ 2025.04",
                        "부산도시공사 임대주택전자청약시스템 구축",
                        "매입임대 인트라넷 및 포털 사이트 구축 프로젝트를 수행했습니다.",
                        List.of(
                                "JSP / Nexacro 기반 화면 및 Java 백엔드 개발",
                                "청약 업무 프로세스에 필요한 조회·등록·처리 기능 개발",
                                "Oracle DB 연동 및 데이터 처리 로직 구현",
                                "업무 기능 안정화 및 사용자 요구사항 반영 지원"
                        ),
                        List.of("Java", "JSP", "Nexacro", "Oracle")
                )
        );
    }
}
