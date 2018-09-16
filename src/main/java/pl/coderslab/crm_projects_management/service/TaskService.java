package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Task;


public interface TaskService {

    Task save(Task task);
    void delete(Task task);

}
