package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //Find all courses by category select * from course where category = ...
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //check i f a course with the supplied name exist. return true if exists, false otherwise
    boolean existsByName(String name);

    //Returns the count of courses for the given category
    int countByCategory(String category);

    //Find all the course that start with the given course name string
    List<Course> findByNameStartsWith(String ch);

    //Find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);

}
