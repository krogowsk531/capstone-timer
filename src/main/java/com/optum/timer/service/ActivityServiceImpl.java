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
//
//
//    private ActivityRepository activityRepository;
//
//    @Autowired
//    public ActivityServiceImpl(ActivityRepository activityRepository) {
//        this.activityRepository = activityRepository;
//    }
//
//    @Override
//    public List<Activity> listAll() {
//        return activityRepository.findAll();
//    }
//
//    @Override
//    public void save(Activity activity) {
//        activityRepository.save(activity);
//    }
//
//    @Override
//    public Activity get(Integer activityId) {
//        return null;
//    }
//
//    @Override
//    public void delete(Integer activityId) {
//
//    }
//
//    @Override
//    public Activity getActivityById(long activityId) {
//        return activityRepository.getById(activityId);
//    }
//
////    @Override
////    public void delete(long activityId) {
////        activityRepository.deleteById(activityId);
////    }
//}
