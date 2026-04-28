package com.frostycityman.sqlannotator.portfolio_web.controller.page;

import com.frostycityman.sqlannotator.portfolio_web.service.ExperienceService;
import com.frostycityman.sqlannotator.portfolio_web.service.ProfileService;
import com.frostycityman.sqlannotator.portfolio_web.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioPageController {

    private final ProfileService profileService;
    private final ProjectService projectService;
    private final ExperienceService experienceService;

    public PortfolioPageController(
            ProfileService profileService,
            ProjectService projectService,
            ExperienceService experienceService
    ) {
        this.profileService = profileService;
        this.projectService = projectService;
        this.experienceService = experienceService;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("profileSummary", profileService.getProfileSummary());
        model.addAttribute("featuredProjects", projectService.getFeaturedProjects(3));
        model.addAttribute("experienceHighlights", experienceService.getExperiences(2));
        return "page/main";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("profileSummary", profileService.getProfileSummary());
        return "page/about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", projectService.getProjects(null));
        return "page/projects";
    }

    @GetMapping("/experience")
    public String experience(Model model) {
        model.addAttribute("experiences", experienceService.getExperiences(null));
        model.addAttribute("profileSummary", profileService.getProfileSummary());
        return "page/experience";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        var profileSummary = profileService.getProfileSummary();
        model.addAttribute("profileSummary", profileSummary);
        model.addAttribute("contactInfo", profileSummary.contactInfo());
        return "page/contact";
    }
}
