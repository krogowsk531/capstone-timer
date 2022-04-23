package com.optum.timer;

import com.optum.timer.model.Comment;
import com.optum.timer.repository.CommentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void findFirstByFutureIntention_should_return_Comment_given_valid_FutureIntention() {

        Comment future = commentRepository.findFirstByFutureIntention("Run more");
        Assertions.assertThat(future.getFutureIntention()).isEqualTo("Run more");
    }

    @Test
    void findFirstByDescription_should_return_Comment_given_valid_Description() {

        Comment future = commentRepository.findFirstByDescription("Run 10 miles per week for the purpose of better heart health.  Bring friends!");
        Assertions.assertThat(future.getDescription()).isEqualTo("Run 10 miles per week for the purpose of better heart health.  Bring friends!");
    }
}
