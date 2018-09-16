package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Project;

import java.util.List;

public interface ProjectService {


    List<Project> findAll();

    Project findByID(int id);

    List<Project> find5Latest();

    Project save(Project project);


}
