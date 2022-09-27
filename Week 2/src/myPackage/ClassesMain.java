package myPackage;

public class ClassesMain {

	public static void main(String[] args) {
		// Customer ----->>>>>>
		/*
		 * CustomerManager customerManager = new CustomerManager();
		 * customerManager.add(); customerManager.delete(); customerManager.update();
		 */

		// New Product With Empty Constructor and getter setter. ----->>>>>>
		Product product = new Product();
		product.setId(1);
		product.setName("Playstation");
		product.setDescription("Sony");
		product.setPrice(7985);
		product.setStockAmount(7);

		// New Product With Parameters Constructor. ----->>>>>>
		Product product2 = new Product(2, "Fan", "Everest", 1750, 7, "Black");

		// Product Manager ------>>>>>>
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add(product2);

		System.out.println(product.getCode());
		System.out.println(product2.getCode());

	}

}
