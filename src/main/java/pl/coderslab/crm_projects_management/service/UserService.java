package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByID(int id);

    User findByLogin(String login);

    User saveUserPasswordEncode(User user);

    List<User> findAllWhoInProject(Project project);

    List<User> findAllWhoNotInProject(Project project);



    }
