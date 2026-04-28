package com.frostycityman.sqlannotator.portfolio_web.controller.api;

import com.frostycityman.sqlannotator.portfolio_web.common.response.ApiResponse;
import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ExperienceDto;
import com.frostycityman.sqlannotator.portfolio_web.service.ExperienceService;
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
@RequestMapping("/api/v1/experiences")
@Tag(name = "Experiences", description = "포트폴리오 경력 조회 API")
public class ExperienceApiController {

    private final ExperienceService experienceService;

    public ExperienceApiController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    @Operation(summary = "경력 목록 조회", description = "포트폴리오 경력 목록을 조회합니다.")
    public ApiResponse<List<ExperienceDto>> getExperiences(@RequestParam(required = false) @Min(value = 0, message = "limit은 0 이상이어야 합니다.") Integer limit) {
        return ApiResponse.ok(experienceService.getExperiences(limit));
    }
}
