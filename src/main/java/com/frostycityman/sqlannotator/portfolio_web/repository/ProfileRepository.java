package com.frostycityman.sqlannotator.portfolio_web.repository;

import com.frostycityman.sqlannotator.portfolio_web.domain.dto.ProfileSummaryDto;

public interface ProfileRepository {

    ProfileSummaryDto findProfileSummary();
}
