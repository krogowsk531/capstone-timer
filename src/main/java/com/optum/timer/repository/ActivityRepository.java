package com.optum.timer.repository;

import com.optum.timer.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
     Activity findFirstByIntention(String intention);
     Activity findFirstByMinutes(int minutes);
}
