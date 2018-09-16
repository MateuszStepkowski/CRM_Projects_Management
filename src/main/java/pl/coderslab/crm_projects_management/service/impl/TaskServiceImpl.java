package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.crm_projects_management.entity.Task;
import pl.coderslab.crm_projects_management.repository.TaskRepository;
import pl.coderslab.crm_projects_management.service.TaskService;

public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;



    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void delete(Task task) {
        taskRepository.delete(task);
    }
}
