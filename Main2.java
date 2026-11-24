class Vehicle {
    String Brand = "x";

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car extends Vehicle {
    String modelName = "y";

    void displayDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + modelName);
        honk();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car ob = new Car();

        ob.displayDetails();
    }
}