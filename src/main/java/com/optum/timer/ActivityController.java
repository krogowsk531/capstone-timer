package com.optum.timer;

import com.optum.timer.model.Activity;
import com.optum.timer.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActivityController {
    @Autowired
    ActivityService service;

    public List<Activity> list() {
        return service.listAll();
    }
}
