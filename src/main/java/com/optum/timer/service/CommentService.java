package com.optum.timer.service;

import com.optum.timer.model.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();

    void saveComment(Comment comment);

    Comment getCommentById(long id);

    Comment getCommentByFutureIntention(String futureIntention);

    void deleteCommentById(long id);
}
