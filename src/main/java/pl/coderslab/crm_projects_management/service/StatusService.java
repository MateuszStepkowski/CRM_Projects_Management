package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Status;

import java.util.List;

public interface StatusService {

    List<Status> findAll();

    List<Status> findAllActive();

    Status save(Status status);

}
