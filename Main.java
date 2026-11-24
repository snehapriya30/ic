class car{
    private int speed=300;
    public void getter(){
        System.out.println(speed);
    }
    public void setter(int s){
        speed=s;
    }
}
public class Main {
    public static void main(String[] args) {
        car c=new car();
        c.getter();
        c.setter(1000);
        c.getter();

    }
    
}
