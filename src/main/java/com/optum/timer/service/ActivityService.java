package com.optum.timer.service;

import com.optum.timer.model.Activity;

import java.util.List;

import com.optum.timer.model.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> listAll();

    void save(Activity activity);

    Activity getId(long id);

    void delete(long id);

//    Activity getActivityById(long activityId);

//    void delete(long activityId);
}
