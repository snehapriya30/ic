import java.util.*;
public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> employees = new TreeMap<>();
        int choice;
        do {
            System.out.println("\n------- Employee Department Management -------");
            System.out.println("1. Add Employee Record");
            System.out.println("2. Update Employee Department");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Display Employees in Ascending Order");
            System.out.println("6. Display Employees in Descending Order");
            System.out.println("7. Display First Employee ID");
            System.out.println("8. Display Last Employee ID");
            System.out.println("9. Display Employees Within ID Range");
            System.out.println("10. Close");
            System.out.print("Enter yr choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (!employees.containsKey(id)) {
                    System.out.print("Enter Department Name: ");
                    String dept = sc.nextLine();
                    employees.put(id, dept);
                    System.out.println("Employee Record Added Successfully!");
                } else {
                    System.out.println("Employee ID Already Exists");
                }
            } else if (choice == 2) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (employees.containsKey(id)) {
                    System.out.print("Enter New Department Name: ");
                    String dept = sc.nextLine();
                    employees.put(id, dept);
                    System.out.println("Employee Department Updated Successfully!");
                } else {
                    System.out.println("Employee Not Found");
                }
            } else if (choice == 3) {
                System.out.print("Enter Employee ID to Search: ");
                int id = sc.nextInt();
                if (employees.containsKey(id)) {
                    System.out.println("Employee Found!");
                    System.out.println("Employee ID: " + id);
                    System.out.println("Department: " + employees.get(id));
                } else {
                    System.out.println("Employee Not Found");
                }
            } else if (choice == 4) {
                System.out.print("Enter Employee ID to Remove: ");
                int id = sc.nextInt();
                if (employees.containsKey(id)) {
                    employees.remove(id);
                    System.out.println("Employee Record Removed Successfully!");
                } else {
                    System.out.println("Employee Not Found");
                }
            } else if (choice == 5) {
                System.out.println("\nEmployees in Ascending Order:");
                if (employees.isEmpty()) {
                    System.out.println("No Employee Records Available");
                } else {
                    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
                        System.out.println("Employee ID: " + entry.getKey()
                                + " - Department: " + entry.getValue());
                    }
                }
            } else if (choice == 6) {
                System.out.println("\nEmployees in Descending Order:");
                if (employees.isEmpty()) {
                    System.out.println("No Employee Records Available");
                } else {
                    for (Map.Entry<Integer, String> entry :
                            employees.descendingMap().entrySet()) {

                        System.out.println("Employee ID: " + entry.getKey()
                                + " - Department: " + entry.getValue());
                    }
                }
            } else if (choice == 7) {
                if (!employees.isEmpty()) {
                    System.out.println("First Employee ID: "
                            + employees.firstKey());
                } else {
                    System.out.println("No Employee Records Available");
                }
            } else if (choice == 8) {
                if (!employees.isEmpty()) {
                    System.out.println("Last Employee ID: "
                            + employees.lastKey());
                } else {
                    System.out.println("No Employee Records Available");
                }
            } else if (choice == 9) {
                System.out.print("Enter Starting Employee ID: ");
                int start = sc.nextInt();
                System.out.print("Enter Ending Employee ID: ");
                int end = sc.nextInt();
                if (start > end) {
                    System.out.println("Invalid Range");
                } else {
                    System.out.println("\nEmployees Within ID Range:");
                    if (employees.subMap(start, true, end, true).isEmpty()) {
                        System.out.println("No Employees Found in This Range");
                    } else {
                        for (Map.Entry<Integer, String> entry :
                                employees.subMap(start, true, end, true).entrySet()) {
                            System.out.println("Employee ID: " + entry.getKey()
                                    + " - Department: " + entry.getValue());
                        }
                    }
                }
            } else if (choice == 10) {
                System.out.println("Employee Department Management Closed!");
            } else {
                System.out.println("Invalid Choice");
            }
        } while (choice != 10);
        sc.close();
    }
}
