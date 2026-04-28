package com.frostycityman.sqlannotator.portfolio_web.service.impl;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProjectDto;
import com.frostycityman.sqlannotator.portfolio_web.repository.ProjectRepository;
import com.frostycityman.sqlannotator.portfolio_web.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectDto> getProjects(Integer limit) {
        return applyLimit(projectRepository.findAll(), limit);
    }

    @Override
    public List<ProjectDto> getFeaturedProjects(int limit) {
        List<ProjectDto> featuredProjects = projectRepository.findAll().stream()
                .filter(ProjectDto::featured)
                .toList();
        return applyLimit(featuredProjects, limit);
    }

    private List<ProjectDto> applyLimit(List<ProjectDto> projects, Integer limit) {
        if (limit == null || limit <= 0 || limit >= projects.size()) {
            return projects;
        }
        return projects.subList(0, limit);
    }
}
