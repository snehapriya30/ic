package Day2;
class Shape{
    void draw(){
        System.out.println("Drawing a Shape");

    }
}
class Circle extends Shape{
    @Override 
    void draw(){
        System.out.println("Drawing a Cricle");
    }
}
class Square extends Shape{
    @Override 
    void draw(){
        System.out.println("Drawing a Square");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();
        s=new Square();
        s.draw();

    }
    
}
