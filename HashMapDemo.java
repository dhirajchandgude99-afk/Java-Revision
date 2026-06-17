import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer , String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        System.out.println(students);
        System.out.println("students with ID 101: " + students.get(101));
        students.remove(102);
        System.out.println("After removing student with ID 102: " + students);
        System.out.println("Contains student with ID 103? " + students.containsKey(103));
        System.out.println("Size of HashMap: " + students.size());
    }
}
