package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.User;

import java.util.List;
import java.util.Set;

public interface ProjectService {


    List<Project> findAll();

    Project findByID(int id);

    List<Project> find5Latest();

    Project save(Project project);

    void addUsers(Project project, Set<User> users);


    void removeUser(int projectID, int userID);
}
