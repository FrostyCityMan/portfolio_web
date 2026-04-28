package com.frostycityman.sqlannotator.portfolio_web.service;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> getProjects(Integer limit);

    List<ProjectDto> getFeaturedProjects(int limit);
}
