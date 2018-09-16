package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.crm_projects_management.entity.Activity;
import pl.coderslab.crm_projects_management.repository.ActivityRepository;
import pl.coderslab.crm_projects_management.service.ActivityService;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    @Override
    public List<Activity> find25Latest() {
        return activityRepository.findFirst25ByOrderByCreateDateDesc();
    }

    @Override
    public Activity save(Activity activity) {
        return activityRepository.save(activity);
    }
}
