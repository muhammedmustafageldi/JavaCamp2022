package validators;

import entities.Category;

import java.util.ArrayList;

public class ValidatorOfCategory {

    public static void isValid(ArrayList<Category> categories) throws Exception {

        for (int i = 0 ; i< categories.size() ; i++){

            Category category = categories.get(i);
            String categoryName = category.getName();

            for (int j = 0 ; j< (categories.size() - 1) ; j++){
                //Temporary array copy for comparison.
                ArrayList<Category> temporaryArray = new ArrayList<>(categories);
                temporaryArray.remove(i);

                //Comparison
                if (categoryName.equals(temporaryArray.get(j).getName())){
                    throw new Exception("OOPS CATEGORY ERROR : Tekrar eden kategori isimleri bulundu. --->>> "+categoryName);
                }
            }

        }
    }


}
