package com.optum.timer.service;

import com.optum.timer.model.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> getAllFriends();

    void saveFriend(Friend friend);

    Friend getFriendById(long id);

    Friend getFriendByName(String name);

    void deleteFriendById(long id);
}
