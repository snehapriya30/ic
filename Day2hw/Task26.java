interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Email Alert:"+message);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert:"+message);
    }
}
public class Task26 {
    public static void main(String[] args) {
        Alert a=new EmailAlert();
        Alert a1=new MobileAlert();
        a.sendAlert("yr oreder has been placed");
        a1.sendAlert("u have a new notification");

    }
    
}
