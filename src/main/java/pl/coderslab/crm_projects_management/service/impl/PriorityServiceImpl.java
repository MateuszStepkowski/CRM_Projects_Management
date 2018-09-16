package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.crm_projects_management.entity.Priority;
import pl.coderslab.crm_projects_management.repository.PriorityRepository;
import pl.coderslab.crm_projects_management.service.PriorityService;

import java.util.List;

public class PriorityServiceImpl implements PriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<Priority> findAll() {
        return null;
    }

    @Override
    public List<Priority> findAllActive() {
        return priorityRepository.findAllByActive(true);
    }



    @Override
    public Priority save(Priority priority) {
        return priorityRepository.save(priority);
    }
}
