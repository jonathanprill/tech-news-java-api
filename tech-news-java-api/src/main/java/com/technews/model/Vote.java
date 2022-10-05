package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

//Class level annotaions
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")

public class Vote implements Serializable {
//    instance variables:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer postId;

//    Constructor
    public Vote() {
    }

    public Vote(Integer id, Integer userId, Integer postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Vote(Integer userId, Integer postId) {
        this.userId = userId;
        this.postId = postId;
    }

//    Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

//    Equals and Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(id, vote.id) && Objects.equals(userId, vote.userId) && Objects.equals(postId, vote.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, postId);
    }

//    toString

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
