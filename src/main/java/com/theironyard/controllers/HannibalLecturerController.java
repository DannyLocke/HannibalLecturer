package com.theironyard.controllers;

import com.theironyard.entities.Lecturers;
import com.theironyard.entities.Reviews;
import com.theironyard.services.LecturersRepository;
import com.theironyard.services.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.h2.tools.Server;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by dlocke on 1/9/17.
 */
@RestController
public class HannibalLecturerController {

    @Autowired
    LecturersRepository lecturers;

    @Autowired
    ReviewsRepository reviews;

    Server uidb = null;

    @PostConstruct
    public void init() throws SQLException {
        uidb = Server.createWebServer().start();
    }

    @PreDestroy
    public void destroy(){
        uidb.stop();
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public Iterable<Lecturers>getLecturers() {
        return lecturers.findAll();
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public void createLecturers (String name, String topic, String image, HttpServletResponse response) {
        Lecturers lecturer = new Lecturers(name, topic, image);
        lecturers.save(lecturer);
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public Iterable<Reviews> getReviews (int lecturerId)  {
        Lecturers lecturer = lecturers.findOne(lecturerId);
        return reviews.findByAuthor(lecturer);
    }

    //    saving a new review to the database
    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void createReviews (String author, String text, int lecturerId, Boolean isGood, HttpServletResponse response) {
        Lecturers lecturer = lecturers.findOne(lecturerId);
        Reviews review = new Reviews(author, text, lecturerId, isGood);
        reviews.save(review);
    }
}
