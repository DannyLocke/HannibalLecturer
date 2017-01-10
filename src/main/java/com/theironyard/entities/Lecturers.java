package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by dlocke on 1/9/17.
 */
@Entity
@Table(name = "lecturers")
public class Lecturers {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String topic;

    @Column(nullable = false)
    String image;

    public Lecturers() {
    }

    public Lecturers(int id, String name, String topic, String image) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.image = image;
    }

    public Lecturers(String name, String topic, String image) {
        this.name = name;
        this.topic = topic;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}//end class Lecturers
