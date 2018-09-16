package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Status;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Integer> {

    List<Status> findAllByActive(boolean active);
}
