package com.frostycityman.sqlannotator.portfolio_web.service.impl;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ExperienceDto;
import com.frostycityman.sqlannotator.portfolio_web.repository.ExperienceRepository;
import com.frostycityman.sqlannotator.portfolio_web.service.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<ExperienceDto> getExperiences(Integer limit) {
        List<ExperienceDto> experiences = experienceRepository.findAll();
        if (limit == null || limit <= 0 || limit >= experiences.size()) {
            return experiences;
        }
        return experiences.subList(0, limit);
    }
}
