package com.theironyard.services;

import com.theironyard.entities.Lecturers;
import com.theironyard.entities.Reviews;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dlocke on 1/9/17.
 */
public interface ReviewsRepository extends CrudRepository<Reviews, Integer> {

    List<Reviews> findByAuthor (Lecturers author);
}
