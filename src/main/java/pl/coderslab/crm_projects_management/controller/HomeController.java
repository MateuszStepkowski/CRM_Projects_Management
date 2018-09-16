package pl.coderslab.crm_projects_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.crm_projects_management.service.ActivityService;
import pl.coderslab.crm_projects_management.service.ProjectService;

@Controller
public class HomeController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ActivityService activityService;

    @GetMapping({"/home", ""})
    public String home(Model model) {

        model.addAttribute("projects", projectService.find5Latest());
        model.addAttribute("activities", activityService.find25Latest());

        return "homePage";
    }
}
