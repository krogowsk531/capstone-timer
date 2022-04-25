package com.optum.timer.service;

import com.optum.timer.model.Activity;
import com.optum.timer.model.User;
import com.optum.timer.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ActivityServiceImpl implements ActivityService {


    private ActivityRepository activityRepository;

    private UserService userService;


    @Autowired
    public ActivityServiceImpl(ActivityRepository activityRepository, UserService userService) {
        this.activityRepository = activityRepository;
        this.userService = userService;
    }

    @Override
    public List<Activity> listAll() {
        return activityRepository.findAll();
    }

//    @Override
//    public List<Activity> listAll() {
//        return null;
//    }

    @Override
    public void save(Activity activity) {
        System.out.println("here");
        activityRepository.save(activity);
    }

    @Override
    public Activity getId(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Set<Activity> getActivitiesById(long id) {
        return userService.getUserById(id).getActivities();
    }

//    @Override
//    public Activity get(Integer activityId) {
//        return null;
//    }

//    @Override
//    public void delete(Integer activityId) {
//
//    }

//    @Override
//    public Activity getActivityById(long activityId) {
//        return activityRepository.getById(activityId);
//    }

//    @Override
//    public void delete(long activityId) {
//        activityRepository.deleteById(activityId);
//    }
}
