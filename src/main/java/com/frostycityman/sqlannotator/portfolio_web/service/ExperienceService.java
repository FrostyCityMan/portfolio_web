package com.frostycityman.sqlannotator.portfolio_web.service;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ExperienceDto;

import java.util.List;

public interface ExperienceService {

    List<ExperienceDto> getExperiences(Integer limit);
}
