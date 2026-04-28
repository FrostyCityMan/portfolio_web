package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProjectDto;

import java.util.List;

public interface ProjectRepository {

    List<ProjectDto> findAll();
}
