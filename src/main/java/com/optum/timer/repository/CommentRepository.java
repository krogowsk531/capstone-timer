package com.optum.timer.repository;

import com.optum.timer.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findFirstByFutureIntention(String futureIntention);
    Comment findFirstByDescription(String description);
}
