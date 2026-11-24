class Student {
    private String name;
    private int rollNumber;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Main1 {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Sneha");
        s.setRollNumber(517);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
    }
}
