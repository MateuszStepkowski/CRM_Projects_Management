package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.User;
import pl.coderslab.crm_projects_management.repository.ProjectRepository;
import pl.coderslab.crm_projects_management.repository.UserRepository;
import pl.coderslab.crm_projects_management.service.ProjectService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findByID(int id) {
        return projectRepository.findFirstById(id) ;
    }

    @Override
    public List<Project> find5Latest() {
        return projectRepository.findFirst5ByOrderByCreateDateDesc();
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void addUsers(Project project, Set<User> users) {

        Set<User> newUsers = project.getUsers();
        for (User user: users){
            newUsers.add(user);
        }
        project.setUsers(newUsers);
        projectRepository.save(project);
    }

    @Override
    public void removeUser(int projectID, int userID) {
        Project project = projectRepository.findFirstById(projectID);
        project.setUsers(
                project.getUsers().stream()
                        .filter(user -> user.getId()!=userID)
                        .collect(Collectors.toSet()));

        projectRepository.save(project);
    }
}
