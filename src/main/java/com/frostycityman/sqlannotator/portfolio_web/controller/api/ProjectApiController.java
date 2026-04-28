package com.frostycityman.sqlannotator.portfolio_web.controller.api;

import com.frostycityman.sqlannotator.portfolio_web.common.response.ApiResponse;
import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProjectDto;
import com.frostycityman.sqlannotator.portfolio_web.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/v1/projects")
@Tag(name = "Projects", description = "포트폴리오 프로젝트 조회 API")
public class ProjectApiController {

    private final ProjectService projectService;

    public ProjectApiController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    @Operation(summary = "프로젝트 목록 조회", description = "포트폴리오 프로젝트 목록을 조회합니다.")
    public ApiResponse<List<ProjectDto>> getProjects(@RequestParam(required = false) @Min(value = 0, message = "limit은 0 이상이어야 합니다.") Integer limit) {
        return ApiResponse.ok(projectService.getProjects(limit));
    }
}
