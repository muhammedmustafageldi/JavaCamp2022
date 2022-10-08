package interfaces;

public class Main {
    public static void main(String args[]){
        /*ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();

        IRepository iRepository = new MySqlCustomerDal();
        iRepository.delete();*/

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

        ICustomerDal[] iCustomerDals = new ICustomerDal[]{new MySqlCustomerDal(),new OracleCustomerDal(), new SqlCustomerDal()};

        for (ICustomerDal customerDal : iCustomerDals){
            //For
            customerDal.add();
        }
    }
}
