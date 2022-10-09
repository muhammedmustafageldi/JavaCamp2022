package business;

import dataAccess.Instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao){
        //Shadowing.
        this.instructorDao = instructorDao;
    }

    public void add(Instructor[] instructors){
        instructorDao.add(instructors);
    }

}
