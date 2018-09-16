package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
