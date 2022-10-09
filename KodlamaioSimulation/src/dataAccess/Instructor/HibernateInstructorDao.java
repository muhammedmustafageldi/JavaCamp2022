package dataAccess.Instructor;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor[] instructors) {
        for (Instructor instructor : instructors){
            System.out.println(instructor.getName()+" Hibernate ile eklendi.");
        }
    }
}
