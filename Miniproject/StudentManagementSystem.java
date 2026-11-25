
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private String department;
    private int m1, m2, m3;
    Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void enterMarks(Scanner sc) {
        System.out.print("Enter Subject 1 Marks: ");
        m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        m2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        m3 = sc.nextInt();
    }
    int calculateTotal() {
        return m1 + m2 + m3;
    }
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "Fail";
    }

    void displayStudent() {
        System.out.println("\n===== STUDENT REPORT =====");

        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Total Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());

        if (calculateAverage() >= 50)
            System.out.println("Result       : PASS");
        else
            System.out.println("Result       : FAIL");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Student s = new Student(id, name, department);

        s.enterMarks(sc);
        s.displayStudent();

        sc.close();
    }
}
