package com.frostycityman.sqlannotator.portfolio_web.domain.dto;

import java.util.List;

public record ProjectDto(
        String name,
        String category,
        String period,
        String summary,
        String role,
        List<String> responsibilities,
        List<String> techStacks,
        List<String> keyExperiences,
        boolean featured
) {
}
