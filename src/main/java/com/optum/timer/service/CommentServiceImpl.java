package com.optum.timer.service;

import com.optum.timer.model.Comment;
import com.optum.timer.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;
    private Comment comment;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public Comment getCommentById(long id) {

        Optional<Comment> optionalComment = commentRepository.findById(id);
        if (optionalComment.isPresent()) {
            Comment comment = optionalComment.get();
            return comment;
        }
        throw new CommentNotFoundException();
    }


    @Override
    public Comment getCommentByFutureIntention(String futureIntention) {
        Comment comment = commentRepository.findFirstByFutureIntention(futureIntention);
        if (comment == null) {
            throw new CommentNotFoundException();
        }
        return comment;
    }

    @Override
    public void deleteCommentById(long id) {
        commentRepository.deleteById(id);
    }
}
