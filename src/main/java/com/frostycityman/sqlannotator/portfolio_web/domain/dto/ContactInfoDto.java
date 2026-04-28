package com.frostycityman.sqlannotator.portfolio_web.domain.dto;

public record ContactInfoDto(
        String phone,
        String email,
        String githubLabel,
        String githubUrl,
        String message
) {
}
