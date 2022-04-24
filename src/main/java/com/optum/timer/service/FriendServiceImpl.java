package com.optum.timer.service;

import com.optum.timer.model.Friend;
import com.optum.timer.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class FriendServiceImpl implements FriendService{

    private FriendRepository friendRepository;
    private Friend friend;

    @Autowired
    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @Override
    public List<Friend> getAllFriends() {
        return friendRepository.findAll();
    }

    @Override
    public void saveFriend(Friend friend) {
        friendRepository.save(friend);
    }

    @Override
    public Friend getFriendById(long id) {

        Optional<Friend> optionalFriend = friendRepository.findById(id);
        if (optionalFriend.isPresent()) {
            Friend friend = optionalFriend.get();
            return friend;
        }
        throw new FriendNotFoundException();
    }

    @Override
    public Friend getFriendByName(String name) {
        Friend friend = friendRepository.findFirstByLastName(name);
        if (friend == null) {
            throw new FriendNotFoundException();
        }
        return friend;
    }

    @Override
    public void deleteFriendById(long id) {
        friendRepository.deleteById(id);
    }
}
