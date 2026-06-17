import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element, will not be added
        System.out.println(hashSet);
        hashSet.remove("Banana");
        System.out.println("After removing Banana: " + hashSet);
        System.out.println("Contains Orange? " + hashSet.contains("Orange"));
        System.out.println("Size of HashSet: " + hashSet.size());
    }
}
