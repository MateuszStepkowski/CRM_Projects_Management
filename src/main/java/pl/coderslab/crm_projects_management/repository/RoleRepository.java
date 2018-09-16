package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
