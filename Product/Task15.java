
import java.util.*;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> products = new HashMap<>();

        int choice;

        do {
            System.out.println("\n********* Product Inventory Management *********");
            System.out.println("1. Add New Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3. Sell Product");
            System.out.println("4. Search Product");
            System.out.println("5. Display Low Stock Products");
            System.out.println("6. Remove Out of Stock Products");
            System.out.println("7. Display All Products");
            System.out.println("8. Close");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter product ID: ");
                int id = sc.nextInt();

                if (id > 0 && !products.containsKey(id)) {

                    System.out.print("Enter product quantity: ");
                    int qty = sc.nextInt();

                    if (qty >= 0) {
                        products.put(id, qty);
                        System.out.println("Product added successfully");
                    } else {
                        System.out.println("Invalid quantity");
                    }

                } else {
                    System.out.println("Invalid or duplicate Product ID");
                }

            } else if (choice == 2) {

                System.out.print("Enter product ID: ");
                int id = sc.nextInt();

                if (products.containsKey(id)) {

                    System.out.print("Enter new quantity: ");
                    int qty = sc.nextInt();

                    if (qty >= 0) {
                        products.put(id, qty);
                        System.out.println("Product quantity updated successfully");
                    } else {
                        System.out.println("Invalid quantity");
                    }

                } else {
                    System.out.println("Product not found");
                }

            } else if (choice == 3) {

                System.out.print("Enter product ID: ");
                int id = sc.nextInt();

                if (products.containsKey(id)) {

                    System.out.print("Enter quantity sold: ");
                    int sold = sc.nextInt();

                    int available = products.getOrDefault(id, 0);

                    if (sold > 0 && sold <= available) {

                        products.put(id, available - sold);

                        System.out.println("Product sold successfully");
                        System.out.println("Remaining quantity: "
                                + products.get(id));

                    } else {
                        System.out.println("Invalid sale quantity or insufficient stock");
                    }

                } else {
                    System.out.println("Product not found");
                }

            } else if (choice == 4) {

                System.out.print("Enter product ID to search: ");
                int id = sc.nextInt();

                if (products.containsKey(id)) {
                    System.out.println("Product ID: " + id);
                    System.out.println("Available Quantity: "
                            + products.get(id));
                } else {
                    System.out.println("Product not found");
                }

            } else if (choice == 5) {

                System.out.println("\nLow Stock Products (Quantity below 5):");

                boolean found = false;

                for (Map.Entry<Integer, Integer> entry : products.entrySet()) {

                    if (entry.getValue() < 5) {

                        System.out.println("Product ID: " + entry.getKey()
                                + " - Quantity: " + entry.getValue());

                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("No low stock products");
                }

            } else if (choice == 6) {

                Iterator<Map.Entry<Integer, Integer>> iterator =
                        products.entrySet().iterator();

                boolean removed = false;

                while (iterator.hasNext()) {

                    Map.Entry<Integer, Integer> entry = iterator.next();

                    if (entry.getValue() == 0) {

                        System.out.println("Removed Product ID: "
                                + entry.getKey());

                        iterator.remove();
                        removed = true;
                    }
                }

                if (!removed) {
                    System.out.println("No out of stock products found");
                }

            } else if (choice == 7) {

                System.out.println("\nProduct Inventory:");

                if (products.isEmpty()) {
                    System.out.println("Inventory is empty");
                } else {

                    for (Map.Entry<Integer, Integer> entry : products.entrySet()) {

                        System.out.println("Product ID: " + entry.getKey()
                                + " - Quantity: " + entry.getValue());
                    }
                }

            } else if (choice == 8) {

                System.out.println("Product Inventory Management Closed!");

            } else {

                System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}
