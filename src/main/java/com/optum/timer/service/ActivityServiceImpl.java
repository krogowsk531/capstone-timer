//package com.optum.timer.service;
//
//import com.optum.timer.model.Activity;
//import com.optum.timer.repository.ActivityRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ActivityServiceImpl implements ActivityService {
//    private ActivityRepository activityRepository;
//
//    @Autowired
//    public ActivityServiceImpl(ActivityRepository activityRepository) {
//        this.activityRepository = activityRepository;
//    }
//
//    public Activity getActivityById(long id) {
//        return activityRepository.getActivityById(id);
//    }
//
//    @Override
//    public List<Activity> getAllActivities() {
//        return null;
//    }
//
//    @Override
//    public Activity getActivitiesById(long userId) {
//        return null;
//    }
//}
