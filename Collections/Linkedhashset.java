import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Hyderabad");

        System.out.println(cities);

        cities.remove("Bangalore");

        System.out.println("After Removal: " + cities);
    }
}