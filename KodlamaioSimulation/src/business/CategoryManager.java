package business;

import core.Logger;
import dataAccess.Category.CategoryDao;
import entities.Category;
import validators.ValidatorOfCategory;
import java.util.ArrayList;
import java.util.Arrays;

public class CategoryManager {

    private final CategoryDao categoryDao;
    private final Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        //Shadowing.
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category[] categories){
        //List convert to Array.
        ArrayList<Category> categoryArrayList = new ArrayList<>(Arrays.asList(categories));

        try {
            ValidatorOfCategory.isValid(categoryArrayList);
            categoryDao.add(categories);

            System.out.println("---------Logging---------");
            for (Logger logger : loggers){
                logger.log("Loglama basarılı.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
