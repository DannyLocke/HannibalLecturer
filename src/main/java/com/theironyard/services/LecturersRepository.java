package com.theironyard.services;

import com.theironyard.entities.Lecturers;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dlocke on 1/9/17.
 */
public interface LecturersRepository extends CrudRepository<Lecturers, Integer> {

    Lecturers findFirstByName(String name);
}
