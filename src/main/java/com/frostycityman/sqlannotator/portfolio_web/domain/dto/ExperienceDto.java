package com.frostycityman.sqlannotator.portfolio_web.domain.dto;

import java.util.List;

public record ExperienceDto(
        String companyName,
        String position,
        String period,
        String projectName,
        String summary,
        List<String> responsibilities,
        List<String> techStacks
) {
}
