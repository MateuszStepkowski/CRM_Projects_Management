package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Project;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findFirst5ByOrderByCreateDateDesc();

    Project findFirstById(int id);

}
