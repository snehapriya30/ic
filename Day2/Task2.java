class Printer{
    void print(String text){
        System.out.println("Text:"+text);
    }
    void print(int number){
        System.out.println("Integer:"+number);
    }
    void print(double decimal){
        System.out.println("Decimal:"+decimal);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print("welcome");
        p.print(17);
        p.print(3.0);

    }
    
}
