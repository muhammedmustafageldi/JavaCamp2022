package business;

import dataAccess.Course.CourseDao;
import entities.Course;
import validators.ValidatorOfCourse;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseManager {
    private final CourseDao courseDao;

    public CourseManager(CourseDao courseDao){
        //Shadowing.
        this.courseDao = courseDao;
    }

    public void add(Course[] courses){
        //List convert to Array.
        ArrayList<Course> courseArrayList = new ArrayList<>(Arrays.asList(courses));

        try {
            ValidatorOfCourse.isValid(courseArrayList);
            courseDao.add(courses);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
