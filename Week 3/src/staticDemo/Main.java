package staticDemo;

public class Main {
    public static void main(String args[]){

        Product product = new Product();
        product.setId(1);
        product.setPrice(100);
        product.setName("");

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.Connection.createConnection();
    }
}
