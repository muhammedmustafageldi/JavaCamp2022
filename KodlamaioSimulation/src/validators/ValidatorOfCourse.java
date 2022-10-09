package validators;

import entities.Course;
import java.util.ArrayList;

public class ValidatorOfCourse {

    public static void isValid(ArrayList<Course> courses) throws Exception{

        for (int i = 0; i < courses.size() ; i++){

            Course course = courses.get(i);
            String courseName = course.getName();

            // Price Control.
            if (course.getPrice() < 0){
                throw new Exception("OOPS COURSE ERROR : Kurs fiyatı 0'dan küçük olamaz. --->>> " + course.getName());
            }

            for (int j = 0 ; j < (courses.size()-1) ; j++){
                //Temporary array copy for comparison.
                ArrayList<Course> temporaryArray = new ArrayList<>(courses);
                temporaryArray.remove(i);

                // Name Comparison
                if (courseName.equals(temporaryArray.get(j).getName())){
                    throw new Exception("OOPS COURSE ERROR : Tekrar eden kurs isimleri bulundu. --->>> "+course.getName());
                }

            }
        }

    }


}
