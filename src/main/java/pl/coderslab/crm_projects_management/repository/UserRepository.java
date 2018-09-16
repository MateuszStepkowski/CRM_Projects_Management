package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByProjectsContains(Project project);

    User findFirstByLogin(String login);

}
