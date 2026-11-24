abstract class Payment{
    double amount;
    Payment (double amount){
        this.amount=amount;
    }
    void showAmount(){
        System.out.println("payment Amount: ~"+amount);
    }
    abstract void processpayment();
}
class UPIPayment extends Payment{
    UPIPayment(double amount){
        super(amount);
    }
    @Override 
    void processpayment(){
        System.out.println("payment processed successfully using UPI");
    }
}
public class Task23 {
    public static void main(String[] args) {
        UPIPayment u=new UPIPayment(5000);
        u.showAmount();
        u.processpayment();
    }
    
}
