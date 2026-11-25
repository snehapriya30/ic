import java.util.HashMap;
import java.util.HashSet;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> students=new HashMap<>();
        students.put(1,"sneha");
        
        students.put(2,"snep");
        
        students.put(3,"priya");
        System.out.println(students);
        System.out.println("students 1:"+students.get(1));
        students.put(2,"nani");
        students.remove(3);
        System.out.println("updated map:"+students);
    }
}