package com.frostycityman.sqlannotator.portfolio_web.service.impl;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProfileSummaryDto;
import com.frostycityman.sqlannotator.portfolio_web.repository.ProfileRepository;
import com.frostycityman.sqlannotator.portfolio_web.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public ProfileSummaryDto getProfileSummary() {
        return profileRepository.findProfileSummary();
    }
}
