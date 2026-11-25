import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> courses=new HashSet<>();
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