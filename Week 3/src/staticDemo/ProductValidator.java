package staticDemo;

public class ProductValidator {

    public static boolean isValid(Product product){

        if (product.getPrice() > 0 && !product.getName().isEmpty()){
            return true;
        }else {
            return false;
        }
    }

}
