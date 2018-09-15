package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Priority;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {
}
