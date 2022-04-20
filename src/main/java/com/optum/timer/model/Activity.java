package com.optum.timer.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.List;

//@entity
@Table(name="activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long activityId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "category")
    private List<User> category;

    @Column(name = "intention")
    private String intention;

    @Column(name = "minutes")
    private int minutes;

    @Column(name = "seconds")
    private int seconds;

    @Column(name = "color")
    private List<User> color;

    public Activity() {
    }

    public Activity(long userId, List<User> category, String intention, int minutes, int seconds, List<User> color) {
        this.userId = userId;
        this.category = category;
        this.intention = intention;
        this.minutes = minutes;
        this.seconds = seconds;
        this.color = color;
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

    public List<User> getCategory() {
        return category;
    }

    public void setCategory(List<User> category) {
        this.category = category;
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

    public List<User> getColor() {
        return color;
    }

    public void setColor(List<User> color) {
        this.color = color;
    }

    public Activity getActivityById(long id) {
        return null;
    }
}