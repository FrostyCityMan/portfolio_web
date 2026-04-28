package com.frostycityman.sqlannotator.portfolio_web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI portfolioOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Portfolio Web API")
                        .description("개인 포트폴리오 웹 프로젝트의 공개 API 문서입니다.")
                        .version("v1")
                        .contact(new Contact()
                                .name("Portfolio Owner")
                                .email("hello@portfolio.dev")));
    }
}
