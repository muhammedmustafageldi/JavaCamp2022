import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.Category.HibernateCategoryDao;
import dataAccess.Course.JdbcCourseDao;
import dataAccess.Instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {

        Category category = new Category(1,"Music");
        Category category1 = new Category(2,"Programing");
        Category category2 = new Category(3,"Music");

        Category[] categories = {category, category1,category2};
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(categories);

        System.out.println("------------- Transaction of instructors -------------");

        Instructor instructor = new Instructor(1,"Engin Demirog");
        Instructor instructor1 = new Instructor(1,"Atıl Samancıoglu");

        Instructor[] instructors = {instructor,instructor1};
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
        instructorManager.add(instructors);

        System.out.println("------------- Transaction of courses -------------");

        Course course = new Course(1,"Java","2022 Bootcamp",0);
        Course course1 = new Course(2,"Html","2021 Bootcamp",0);
        Course course2 = new Course(3,"Php","Hedef 2023",0);

        Course[] courses = {course, course1,course2};

        CourseManager courseManager = new CourseManager(new JdbcCourseDao());
        courseManager.add(courses);

    }
}