package com.optum.timer;

import com.optum.timer.model.Activity;
import com.optum.timer.repository.ActivityRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
;

@SpringBootTest
public class ActivityRepositoryTest {

    @Autowired
    private ActivityRepository activityRepository;

    @Test
    void findFirstByIntention_should_return_Activity_given_valid_Intention() {

        Activity future = activityRepository.findFirstByIntention("Dream");
        Assertions.assertThat(future.getIntention()).isEqualTo("Dream");
    }

    @Test
    void findFirstByMinutes_should_return_Activity_given_valid_Minutes() {

        Activity future = activityRepository.findFirstByMinutes(0);
        Assertions.assertThat(future.getMinutes()).isEqualTo(0);
    }
}


