package com.optum.timer.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long activityId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "intention")
    private String intention;

    @Column(name = "minutes")
    private int minutes;

    @Column(name = "seconds")
    private int seconds;


    public Activity() {
    }

    public Activity(long userId, String intention, int minutes, int seconds) {
        this.userId = userId;
        this.intention = intention;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Activity getActivityById(long id) {
        return null;
    }
}