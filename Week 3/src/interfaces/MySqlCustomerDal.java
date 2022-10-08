package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Added to MySql");
    }

    @Override
    public void delete() {
        System.out.println("Deleted from MySql");
    }
}
