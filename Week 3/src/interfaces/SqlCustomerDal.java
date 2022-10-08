package interfaces;

public class SqlCustomerDal implements  ICustomerDal{
    @Override
    public void add() {
        System.out.println("Added to Sql");
    }
}
