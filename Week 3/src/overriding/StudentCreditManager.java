package overriding;

public class StudentCreditManager extends BaseCreditManager{
    public double calculate(double amount){
        return amount * 1.10;
    }
}
