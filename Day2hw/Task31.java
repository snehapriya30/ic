class Product {

    String productName;
    int quantity;
    double price;
    Product() {
        productName = "Unknown";
        quantity = 1;
        price = 100;
    }
    Product(String productName) {
        this.productName = productName;
        quantity = 1;
        price = 100;
    }
    Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculateTotal() {
        System.out.println("Total Price: ₹" + (quantity * price));
    }
}
public class Task31 {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.calculateTotal();
        Product p2 = new Product("Laptop");
        p2.calculateTotal();
        Product p3 = new Product("Mobile", 2, 25000);
        p3.calculateTotal();
    }
}
