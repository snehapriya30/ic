interface PaymentGateway {
    abstract void makePayment(); 
}
class GooglePay implements PaymentGateway{
    public void makePayment(){
        System.out.println("Payment completed using googlepay");
    }
}
class PhonePe implements PaymentGateway{
    public void makePayment(){
        System.out.println("Payment completed using phonepe");
    }
}
public class Task25 {
    public static void main(String[] args) {
        PaymentGateway p1=new GooglePay();
        PaymentGateway p2=new PhonePe();
        p1.makePayment();
        p2.makePayment();
            
        
    }
    
}
