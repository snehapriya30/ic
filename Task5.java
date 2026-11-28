import java.sql.*;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/clgs";
        String username = "root";
        String password = "sneha955";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully!");
            System.out.println("Enter Mark ID:");
            int markId = sc.nextInt();
            System.out.println("Enter Student ID:");
            int studentId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Subject:");
            String subject = sc.nextLine();
            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();
            String result;
            if (marks >= 35) {
                result = "Pass";
            } else {
                result = "Fail";
            }
            String insertQuery = "INSERT INTO student_marks VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, markId);
            ps.setInt(2, studentId);
            ps.setString(3, subject);
            ps.setInt(4, marks);
            ps.setString(5, result);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student marks inserted successfully!");
            }
            String selectQuery = "SELECT * FROM student_marks";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);
            System.out.println("\n--- All Student Marks ---");
            while (rs.next()) {
                System.out.println("Mark ID: " + rs.getInt("mark_id"));
                System.out.println("Student ID: " + rs.getInt("student_id"));
                System.out.println("Subject: " + rs.getString("subject"));
                System.out.println("Marks: " + rs.getInt("marks"));
                System.out.println("Result: " + rs.getString("result"));
                System.out.println("----------------------");
            }
            System.out.println("\nEnter Student ID to Search:");
            int searchId = sc.nextInt();
            String searchQuery = "SELECT * FROM student_marks WHERE student_id = ?";
            PreparedStatement ps1 = con.prepareStatement(searchQuery);
            ps1.setInt(1, searchId);
            ResultSet rs1 = ps1.executeQuery();
            boolean found = false;
            while (rs1.next()) {
                found = true;
                System.out.println("\nStudent Marks Found!");
                System.out.println("Student ID: " + rs1.getInt("student_id"));
                System.out.println("Subject: " + rs1.getString("subject"));
                System.out.println("Marks: " + rs1.getInt("marks"));
                System.out.println("Result: " + rs1.getString("result"));
            }
            if (!found) {
                System.out.println("Student marks not found!");
            }
            String aboveQuery = "SELECT * FROM student_marks WHERE marks > ?";
            PreparedStatement ps2 = con.prepareStatement(aboveQuery);
            ps2.setInt(1, 80);
            ResultSet rs2 = ps2.executeQuery();
            System.out.println("\n--- Students Scored Above 80 ---");
            while (rs2.next()) {
                System.out.println("Student ID: " + rs2.getInt("student_id"));
                System.out.println("Subject: " + rs2.getString("subject"));
                System.out.println("Marks: " + rs2.getInt("marks"));
                System.out.println("Result: " + rs2.getString("result"));
                System.out.println("----------------------");
            }
            String failQuery = "SELECT * FROM student_marks WHERE marks < ?";
            PreparedStatement ps3 = con.prepareStatement(failQuery);
            ps3.setInt(1, 35);
            ResultSet rs3 = ps3.executeQuery();
            System.out.println("\n--- Failed Students ---");
            while (rs3.next()) {
                System.out.println("Student ID: " + rs3.getInt("student_id"));
                System.out.println("Subject: " + rs3.getString("subject"));
                System.out.println("Marks: " + rs3.getInt("marks"));
                System.out.println("Result: " + rs3.getString("result"));
                System.out.println("----------------------");
            }
            System.out.println("\nEnter Mark ID to Update:");
            int updateId = sc.nextInt();
            System.out.println("Enter New Marks:");
            int newMarks = sc.nextInt();
            String newResult;
            if (newMarks >= 35) {
                newResult = "Pass";
            } else {
                newResult = "Fail";
            }
            String updateQuery = "UPDATE student_marks SET marks = ?, result = ? WHERE mark_id = ?";
            PreparedStatement ps4 = con.prepareStatement(updateQuery);
            ps4.setInt(1, newMarks);
            ps4.setString(2, newResult);
            ps4.setInt(3, updateId);
            int updatedRows = ps4.executeUpdate();
            if (updatedRows > 0) {
                System.out.println("Student marks updated successfully!");
            } else {
                System.out.println("Mark record not found!");
            }
            String maxQuery = "SELECT MAX(marks) FROM student_marks";
            Statement st1 = con.createStatement();
            ResultSet rs4 = st1.executeQuery(maxQuery);
            if (rs4.next()) {
                System.out.println("\nHighest Marks: " + rs4.getInt(1));
            }
            rs.close();
            rs1.close();
            rs2.close();
            rs3.close();
            rs4.close();
            ps.close();
            ps1.close();
            ps2.close();
            ps3.close();
            ps4.close();
            st.close();
            st1.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        sc.close();
    }
}