package myPackage.Inheritance;

public class InheritanceMain {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		// TRANSACTIONS
		employeeManager.add();
		employeeManager.list();
		employeeManager.bestEmployee();
		// ----------->>>>>>>>>>
		customerManager.add();
		customerManager.list();

	}

}
