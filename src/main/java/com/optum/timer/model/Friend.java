//package com.optum.timer.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "friends")
//public class Friend {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(name = "createdDate")
//    private Date createdDate;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "firstUserId" , referencedColumnName = "id")
//    User firstUser;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "secondUserId", referencedColumnName = "id")
//    User secondUser;
//
//    public Friend() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public User getFirstUser() {
//        return firstUser;
//    }
//
//    public void setFirstUser(User firstUser) {
//        this.firstUser = firstUser;
//    }
//
//    public User getSecondUser() {
//        return secondUser;
//    }
//
//    public void setSecondUser(User secondUser) {
//        this.secondUser = secondUser;
//    }
//}
//
