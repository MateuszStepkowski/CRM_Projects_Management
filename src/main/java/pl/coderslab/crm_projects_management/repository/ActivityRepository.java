package pl.coderslab.crm_projects_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.crm_projects_management.entity.Activity;

import java.util.List;

public interface ActivityRepository extends JpaRepository <Activity, Integer> {


    List<Activity> findFirst25ByOrderByCreateDateDesc();

}
