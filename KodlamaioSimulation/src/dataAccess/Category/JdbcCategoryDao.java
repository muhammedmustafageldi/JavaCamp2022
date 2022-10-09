package dataAccess.Category;

import dataAccess.Category.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category[] categories) {
        for (Category category : categories){
            System.out.println(category.getName() + " JDBC ile eklendi.");
        }
    }
}
