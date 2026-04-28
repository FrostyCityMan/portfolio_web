package com.frostycityman.sqlannotator.portfolio_web.domain.dto;

import java.util.List;

public record ProfileSummaryDto(
        String name,
        String headline,
        String introduction,
        List<String> coreTechnologies,
        String careerSummary,
        String profileImageUrl,
        String profileImageAlt,
        List<String> introductionDetails,
        List<String> strengthHighlights,
        String growthGoal,
        List<TechStackGroupDto> techStackGroups,
        List<String> additionalCareerNotes,
        String education,
        ContactInfoDto contactInfo
) {
}
