package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by dlocke on 1/9/17.
 */
@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    String lecturerId;

    @Column(nullable = false)
    Boolean isGood;

    public Reviews() {
    }

    public Reviews(int id, String author, String text, String lecturerId, Boolean isGood) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.lecturerId = lecturerId;
        this.isGood = isGood;
    }

    public Reviews(String author, String text, String lecturerId, Boolean isGood) {
        this.author = author;
        this.text = text;
        this.lecturerId = lecturerId;
        this.isGood = isGood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

}//end class Reviews
