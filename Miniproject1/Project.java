import java.util.*;
public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> studentIds = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();
        LinkedList<String> attendance = new LinkedList<>();
        int choice;
        do {
            System.out.println("\n************************************");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("*****************************************");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Exit");
            System.out.print("\nEnter Yr Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                if (studentIds.contains(id)) {
                    System.out.println("Student ID already exists");
                } else {
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        studentIds.add(id);
                        studentNames.add(name);
                        studentMarks.add(marks);
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Invalid Marks! Enter marks between 0 and 100");
                    }
                }
            } else if (choice == 2) {
                System.out.println("\n--------- STUDENT RECORDS ---------");
                if (studentNames.isEmpty()) {
                    System.out.println("No student records available");
                } else {
                    System.out.println("ID\tName\t\tMarks");
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println(studentIds.get(i) + "\t"
                                + studentNames.get(i) + "\t\t"
                                + studentMarks.get(i));
                    }
                    System.out.println("\nTotal Students: " + studentNames.size());
                }
            } else if (choice == 3) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                if (studentNames.contains(name)) {
                    int index = studentNames.indexOf(name);
                    System.out.println("\nStudent Found!");
                    System.out.println("Student ID: " + studentIds.get(index));
                    System.out.println("Name: " + studentNames.get(index));
                    System.out.println("Marks: " + studentMarks.get(index));
                } else {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 4) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                if (studentNames.contains(name)) {
                    int index = studentNames.indexOf(name);
                    System.out.print("Enter New Marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        studentMarks.set(index, marks);
                        System.out.println("Student Marks Updated Successfully!");
                        System.out.println("Name: " + studentNames.get(index));
                        System.out.println("Updated Marks: " + studentMarks.get(index));
                    } else {
                        System.out.println("Invalid Marks!");
                    }
                } else {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 5) {
                System.out.print("Enter Student Name to Remove: ");
                String name = sc.nextLine();
                if (studentNames.contains(name)) {
                    int index = studentNames.indexOf(name);
                    studentIds.remove(index);
                    studentNames.remove(index);
                    studentMarks.remove(index);
                    attendance.remove(name);
                    System.out.println("Student Removed Successfully!");
                } else {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 6) {
                System.out.println("\n1. Add Attendance at Beginning");
                System.out.println("2. Add Attendance at End");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                if (studentNames.contains(name)) {
                    if (!attendance.contains(name)) {
                        if (ch == 1) {
                            attendance.addFirst(name);
                            System.out.println("Attendance Added at Beginning!");
                        } else if (ch == 2) {
                            attendance.addLast(name);
                            System.out.println("Attendance Added at End!");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Student Already Marked Present!");
                    }
                } else {
                    System.out.println("Student Not Found!");
                }
            } else if (choice == 7) {
                System.out.println("\n--------- ATTENDANCE LIST ---------");
                if (attendance.isEmpty()) {
                    System.out.println("No Students Present");
                } else {
                    for (String name : attendance) {
                        System.out.println(name);
                    }
                    System.out.println("Total Present Students: "
                            + attendance.size());
                }

            } else if (choice == 8) {
                System.out.print("Enter Student Name to Remove from Attendance: ");
                String name = sc.nextLine();
                if (attendance.contains(name)) {
                    attendance.remove(name);
                    System.out.println("Attendance Removed Successfully!");
                } else {
                    System.out.println("Student Not Found in Attendance!");
                }
            } else if (choice == 9) {
                if (studentNames.isEmpty()) {
                    System.out.println("No Student Records Available");
                } else {
                    int highest = Collections.max(studentMarks);
                    int lowest = Collections.min(studentMarks);
                    int total = 0;
                    int above75 = 0;
                    for (int marks : studentMarks) {
                        total = total + marks;
                        if (marks > 75) {
                            above75++;
                        }
                    }
                    double average = (double) total / studentMarks.size();
                    System.out.println("\n--------- STUDENT STATISTICS ---------");
                    System.out.println("Total Students: " + studentNames.size());
                    System.out.println("Highest Marks: " + highest);
                    System.out.println("Lowest Marks: " + lowest);
                    System.out.println("Average Marks: " + average);
                    System.out.println("Students Above 75: " + above75);
                }
            } else if (choice == 10) {
                if (studentNames.isEmpty()) {
                    System.out.println("No Student Records Available");
                } else {
                    ArrayList<String> sortedNames =
                            new ArrayList<>(studentNames);
                    Collections.sort(sortedNames);
                    System.out.println("\nStudent Names in Alphabetical Order:");
                    for (String name : sortedNames) {
                        System.out.println(name);
                    }
                    Collections.reverse(sortedNames);
                    System.out.println("\nStudent Names in Reverse Order:");
                    for (String name : sortedNames) {
                        System.out.println(name);
                    }
                }
            } else if (choice == 11) {
                System.out.println("Student Management System Closed!");
            } else {
                System.out.println("Invalid Choice! Try Again.");
            }
        } while (choice != 11);
        sc.close();
    }
}