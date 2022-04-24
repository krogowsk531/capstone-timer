package com.optum.timer.repository;

import com.optum.timer.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {
    Friend findFirstByLastName(String lastName);
}
