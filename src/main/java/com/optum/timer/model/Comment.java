package com.optum.timer.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_comments",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "comment_id")}
    )
    private Collection<Comment> comment;

    @Column(name="future_intention")
    private String futureIntention;

    @Column(name  = "description")
    private String description;

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFutureIntention() {
        return futureIntention;
    }

    public void setFutureIntention(String futureIntention) {
        this.futureIntention = futureIntention;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id && Objects.equals(futureIntention, comment.futureIntention) && Objects.equals(description, comment.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, futureIntention, description);
    }
}
