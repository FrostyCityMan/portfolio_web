package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ExperienceDto;

import java.util.List;

public interface ExperienceRepository {

    List<ExperienceDto> findAll();
}
