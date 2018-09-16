package pl.coderslab.crm_projects_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.crm_projects_management.entity.Activity;
import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.enums.ActionEnum;
import pl.coderslab.crm_projects_management.model.CurrentUser;
import pl.coderslab.crm_projects_management.service.ActivityService;
import pl.coderslab.crm_projects_management.service.ProjectService;
import pl.coderslab.crm_projects_management.service.UserService;

import javax.validation.Valid;

import java.util.List;
import java.util.Set;

import static pl.coderslab.crm_projects_management.entity.enums.ActionEnum.Project_Created;

@Controller
@RequestMapping("/project")
public class ProjectController {


    @Autowired
    ProjectService projectService;

    @Autowired
    UserService userService;


    @Autowired
    ActivityService activityService;

    @GetMapping("/all")
    public String displayAll(Model model) {

        model.addAttribute("projects", projectService.findAll());
        return "/project/allProjects";
    }

    
}
