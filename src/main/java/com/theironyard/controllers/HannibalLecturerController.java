package com.theironyard.controllers;

import com.theironyard.entities.Lecturers;
import com.theironyard.services.LecturersRepository;
import com.theironyard.services.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dlocke on 1/9/17.
 */
@Controller
public class HannibalLecturerController {

    @Autowired
    LecturersRepository lecturers;

    @Autowired
    ReviewsRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)



































}
