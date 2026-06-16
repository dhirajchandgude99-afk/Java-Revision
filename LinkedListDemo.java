import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
        list.addFirst("Mango");
        list.addLast("Grapes");
        System.out.println("After adding elements : " + list);
        list.remove("Banana");
        System.out.println("After removing an element : " + list);
        System.out.println("First Element : " + list.getFirst());
        System.out.println("Last Element : " + list.getLast());
    }
}
