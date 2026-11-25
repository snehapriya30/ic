import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> h = new LinkedHashMap<>();

        h.put(103, "keerthi");
        h.put(101, "hema");
        h.put(102, "sneha");

        System.out.println(h);

        System.out.println("Key 101: " + h.get(101));

        h.put(102, "priya");

        h.remove(103);

        System.out.println("Update: " + h);
    }
}