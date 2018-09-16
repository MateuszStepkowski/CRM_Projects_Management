package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.repository.ProjectRepository;
import pl.coderslab.crm_projects_management.service.ProjectService;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;


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
}
