import java.util.*;
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> results = new TreeMap<>();
        int choice;
        do {
            System.out.println("\n------- Online Examination Result System -------");
            System.out.println("1. Add Student Result");
            System.out.println("2. Update Student Marks");
            System.out.println("3. Display All Student Results");
            System.out.println("4. Find Highest Marks");
            System.out.println("5. Find Lowest Marks");
            System.out.println("6. Display Results Within a Roll Number Range");
            System.out.println("7. Display Results in Reverse Order");
            System.out.println("8. Close");
            System.out.print("Enter yr choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter student roll number: ");
                int roll = sc.nextInt();
                if (!results.containsKey(roll)) {
                    System.out.print("Enter student marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        results.put(roll, marks);
                        System.out.println("Student result added successfully");
                    } else {
                        System.out.println("Enter valid marks (0-100)");
                    }
                } else {
                    System.out.println("Student roll number already exists");
                }
            } else if (choice == 2) {
                System.out.print("Enter student roll number: ");
                int roll = sc.nextInt();
                if (results.containsKey(roll)) {
                    System.out.print("Enter updated marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        results.put(roll, marks);
                        System.out.println("Student marks updated successfully");
                    } else {
                        System.out.println("Enter valid marks (0-100)");
                    }
                } else {
                    System.out.println("Student record not found");
                }
            } else if (choice == 3) {
                System.out.println("\nAll Student Results:");
                if (results.isEmpty()) {
                    System.out.println("No examination results available");
                } else {
                    for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
                        System.out.println("Roll Number: " + entry.getKey()
                                + " - Marks: " + entry.getValue());
                    }
                }
            } else if (choice == 4) {
                if (!results.isEmpty()) {
                    int highest = Collections.max(results.values());
                    System.out.println("Highest Marks: " + highest);
                    System.out.println("Student(s) with Highest Marks:");
                    for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
                        if (entry.getValue() == highest) {
                            System.out.println("Roll Number: " + entry.getKey());
                        }
                    }
                } else {
                    System.out.println("No examination results available");
                }
            } else if (choice == 5) {
                if (!results.isEmpty()) {
                    int lowest = Collections.min(results.values());
                    System.out.println("Lowest Marks: " + lowest);
                    System.out.println("Student(s) with Lowest Marks:");
                    for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
                        if (entry.getValue() == lowest) {
                            System.out.println("Roll Number: " + entry.getKey());
                        }
                    }
                } else {
                    System.out.println("No examination results available");
                }
            } else if (choice == 6) {
                System.out.print("Enter starting roll number: ");
                int start = sc.nextInt();
                System.out.print("Enter ending roll number: ");
                int end = sc.nextInt();
                if (start > end) {
                    System.out.println("Invalid range");
                } else {
                    System.out.println("\nResults Within Given Range:");
                    SortedMap<Integer, Integer> range =
                            results.subMap(start, true, end, true);
                    if (range.isEmpty()) {
                        System.out.println("No student records found in this range");
                    } else {
                        for (Map.Entry<Integer, Integer> entry : range.entrySet()) {
                            System.out.println("Roll Number: " + entry.getKey()
                                    + " - Marks: " + entry.getValue());
                        }
                    }
                }
            } else if (choice == 7) {
                System.out.println("\nResults in Reverse Roll Number Order:");
                if (results.isEmpty()) {
                    System.out.println("No examination results available");
                } else {
                    for (Map.Entry<Integer, Integer> entry :
                            results.descendingMap().entrySet()) {
                        System.out.println("Roll Number: " + entry.getKey()
                                + " - Marks: " + entry.getValue());
                    }
                }
            } else if (choice == 8) {
                System.out.println("Online Examination Result System Closed!");
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 8);
        sc.close();
    }
}
