class Shape {
    String color = "blue";

    void displayColor() {
        System.out.println(color);
    }
}

class Circle extends Shape {
    int radius = 2;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}

class Rectangle extends Shape {
    int length = 2;
    int width = 3;

    void calculateRectangle() {
        int rect = length * width;
        System.out.println(rect);
    }
}

public class Inher {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.displayColor();
        c.calculateArea();

        r.displayColor();
        r.calculateRectangle();
    }
}