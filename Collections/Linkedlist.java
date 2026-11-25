import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("learn java");
        tasks.add("learn sql");
        tasks.add("learn React");
        tasks.addFirst("Start Training");
        tasks.addLast("Build project");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After Removal:"+tasks);
    }
    
}