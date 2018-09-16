package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Priority;

import java.util.List;

public interface PriorityService {

    List<Priority> findAll();

    List<Priority> findAllActive();

    Priority save(Priority priority);
}
