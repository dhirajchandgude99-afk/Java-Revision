import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        System.out.println("First Element : " + list.get(0));
        list.remove("Banana");
        System.out.println("List after removal : " + list);
        System.out.println("Size of the list : " + list.size());
    }
}
