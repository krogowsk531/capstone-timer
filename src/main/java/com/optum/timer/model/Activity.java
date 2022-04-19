package com.optum.timer.model;


import javax.persistence.*;

@Entity
@Table(name="Activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long activityId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "category")
    private String category;

    @Column(name = "intention")
    private String intention;

    @Column(name = "minutes")
    private int minutes;

    @Column(name = "seconds")
    private int seconds;

    @Column(name = "color")
    private String color;

    public Activity() {}

    public Activity(long userId, String category, String intention, int minutes, int seconds, String color) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
