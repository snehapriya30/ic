class Rectangle {
    private int length = 2;
    private int width = 3;

    
    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void getWidth() {
        System.out.println("Width: " + width);
    }

   
    public void setLength(int l) {
        if (l > 0) {
            length = l;
        } else {
            System.out.println("Invalid length");
        }
    }

    
    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        } else {
            System.out.println("Invalid width");
        }
    }

   
    public void calculatePerimeter() {
        int p = 2 * (length + width);
        System.out.println("Perimeter: " + p);
    }

   
    public void calculateArea() {
        int a = length * width;
        System.out.println("Area: " + a);
    }
}

public class Rect {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.getLength();
        r.getWidth();

        r.calculateArea();
        r.calculatePerimeter();

        r.setLength(5);
        r.setWidth(4);

        System.out.println("After updating:");

        r.getLength();
        r.getWidth();

        r.calculateArea();
        r.calculatePerimeter();
    }
}