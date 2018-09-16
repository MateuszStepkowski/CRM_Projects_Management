package pl.coderslab.crm_projects_management.service;

import pl.coderslab.crm_projects_management.entity.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> find25Latest();

    Activity save(Activity activity);
}
