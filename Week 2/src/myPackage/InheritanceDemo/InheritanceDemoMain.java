package myPackage.InheritanceDemo;

public class InheritanceDemoMain {

	public static void main(String[] args) {
		CreditUI creditUI = new CreditUI();
		creditUI.creditCalculate(new SoliderCreditManager());
		creditUI.creditCalculate(new TeacherCreditManager());
		creditUI.creditCalculate(new FarmerCreditManager());
	}

}
