import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> courses=new TreeSet<>();
        courses.add("Java");
        courses.add("Py");
        courses.add("React");
        courses.add("Java");
        System.out.println(courses);
        System.out.println("conatins java:"+courses.contains("Java"));
        courses.remove("Py");
        System.out.println("Atfer Removal:"+courses);
    }
    
}