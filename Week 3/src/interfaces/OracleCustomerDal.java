package interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Added to Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Deleted from Oracle");
    }
}
