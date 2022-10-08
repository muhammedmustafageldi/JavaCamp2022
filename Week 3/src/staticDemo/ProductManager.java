package staticDemo;

public class ProductManager {

    static {
        System.out.println("Static block worked.");
    }

    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Product added.");
        }else{
            System.out.println("Product is not valid.");
        }

    }

}
