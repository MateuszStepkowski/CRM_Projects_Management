package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm_projects_management.entity.Status;
import pl.coderslab.crm_projects_management.repository.StatusRepository;
import pl.coderslab.crm_projects_management.service.StatusService;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public List<Status> findAllActive() {
        return statusRepository.findAllByActive(true);
    }

    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }
}
