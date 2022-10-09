package dataAccess.Course;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course[] courses) {
        for (Course course : courses){
            System.out.println(course.getName()+ " ("+ course.getDescription()+ ")" + " JDBC ile eklendi.");
        }
    }
}
