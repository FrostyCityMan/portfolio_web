package com.frostycityman.sqlannotator.portfolio_web.domain.dto;

import java.util.List;

public record TechStackGroupDto(
        String category,
        List<String> items
) {
}
