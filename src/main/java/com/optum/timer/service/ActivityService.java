package com.optum.timer.service;

import com.optum.timer.model.Activity;
import java.util.List;
import java.util.Set;

public interface ActivityService {

    List<Activity> listAll();

    void save(Activity activity);

    Activity getId(long id);

    void delete(long id);

    Set<Activity> getActivitiesById(long id);
}
