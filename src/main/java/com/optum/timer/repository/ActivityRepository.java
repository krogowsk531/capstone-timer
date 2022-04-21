package com.optum.timer.repository;

import com.optum.timer.model.Activity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Qualifier("activities")
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
