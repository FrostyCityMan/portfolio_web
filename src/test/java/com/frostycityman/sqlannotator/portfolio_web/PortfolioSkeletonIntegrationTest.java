package com.frostycityman.sqlannotator.portfolio_web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class PortfolioSkeletonIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("메인 페이지는 hero 섹션을 포함한 화면으로 렌더링되어야 한다")
    void mainPageShouldRender() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/main"))
                .andExpect(model().attributeExists("profileSummary"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("김도훈")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/image/profile.jpg")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("010-9143-7173")));
    }

    @Test
    @DisplayName("소개 페이지는 프로필 정보를 포함해 렌더링되어야 한다")
    void aboutPageShouldRender() throws Exception {
        mockMvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/about"))
                .andExpect(model().attributeExists("profileSummary"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("폐쇄망 및 운영 제약 환경에서 서버 구성, Oracle 컨테이너 운영, 배포 자동화, 인증 연동, 운영 이슈 대응까지 수행하며 백엔드와 인프라를 통합적으로 다뤄왔습니다.")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("성장 목표")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("동양미래대학교 경영정보학과 졸업")));
    }

    @Test
    @DisplayName("프로젝트 페이지는 프로젝트 목록을 모델에 담아 렌더링되어야 한다")
    void projectsPageShouldRender() throws Exception {
        mockMvc.perform(get("/projects"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/projects"))
                .andExpect(model().attributeExists("projects"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Portfolio Web AWS 기반 CI/CD 자동 배포 시스템 구축")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("GitHub Actions")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Hybe Casting Map / Web 프로젝트")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Google Maps JavaScript API 및 Places API 연동 기능 개발")));
    }

    @Test
    @DisplayName("경력 페이지는 경력 목록을 모델에 담아 렌더링되어야 한다")
    void experiencePageShouldRender() throws Exception {
        mockMvc.perform(get("/experience"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/experience"))
                .andExpect(model().attributeExists("experiences"))
                .andExpect(model().attributeExists("profileSummary"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("주식회사 퓨처플랫폼")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("동양미래대학교 경영정보학과 졸업")));
    }

    @Test
    @DisplayName("연락처 페이지는 연락 정보를 포함해 렌더링되어야 한다")
    void contactPageShouldRender() throws Exception {
        mockMvc.perform(get("/contact"))
                .andExpect(status().isOk())
                .andExpect(view().name("page/contact"))
                .andExpect(model().attributeExists("contactInfo"))
                .andExpect(model().attributeExists("profileSummary"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("valentine9143@gmail.com")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("https://github.com/FrostyCityMan")));
    }

    @Test
    @DisplayName("기본 레이아웃은 분리된 head, header, footer 정적 리소스를 로드해야 한다")
    void layoutShouldLoadSeparatedFragmentAssets() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/css/head.css")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/css/header.css")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/css/footer.css")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/js/head.js")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/js/header.js")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/js/footer.js")));
    }

    @Test
    @DisplayName("공통 스타일시트는 주요 UI 호버 액션을 포함해야 한다")
    void siteCssShouldExposeHoverInteractions() throws Exception {
        mockMvc.perform(get("/css/site.css"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/css"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".summary-card:hover")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".info-card:hover")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".timeline-card:hover")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".button:hover")));
    }

    @Test
    @DisplayName("분리된 fragment 전용 CSS와 JS는 각각 정적 리소스로 제공되어야 한다")
    void separatedFragmentAssetsShouldBeServed() throws Exception {
        mockMvc.perform(get("/css/head.css"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/css"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(":root")));

        mockMvc.perform(get("/css/header.css"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/css"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".site-header")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".brand:hover")));

        mockMvc.perform(get("/css/footer.css"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/css"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(".site-footer")));

        mockMvc.perform(get("/js/head.js"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("js-enabled")));

        mockMvc.perform(get("/js/header.js"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("aria-current")));

        mockMvc.perform(get("/js/footer.js"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("footer-year")));
    }

    @Test
    @DisplayName("프로젝트 API는 공통 응답 포맷으로 목록을 반환해야 한다")
    void projectsApiShouldReturnApiResponse() throws Exception {
        mockMvc.perform(get("/api/v1/projects").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.message").value("정상 처리되었습니다."))
                .andExpect(jsonPath("$.data").isArray())
                .andExpect(jsonPath("$.data[0].name").exists());
    }

    @Test
    @DisplayName("음수 limit 요청은 일관된 예외 응답으로 처리되어야 한다")
    void projectsApiShouldValidateNegativeLimit() throws Exception {
        mockMvc.perform(get("/api/v1/projects")
                        .queryParam("limit", "-1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.success").value(false))
                .andExpect(jsonPath("$.message").exists())
                .andExpect(jsonPath("$.data").isEmpty());
    }

    @Test
    @DisplayName("경력 API는 limit 값에 따라 개수를 제한할 수 있어야 한다")
    void experiencesApiShouldSupportLimit() throws Exception {
        mockMvc.perform(get("/api/v1/experiences")
                        .queryParam("limit", "1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data.length()").value(1));
    }

    @Test
    @DisplayName("OpenAPI 문서는 JSON으로 노출되어야 한다")
    void openApiDocsShouldBeAccessible() throws Exception {
        mockMvc.perform(get("/v3/api-docs").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.openapi").exists())
                .andExpect(jsonPath("$.info.title").value("Portfolio Web API"));
    }
}
