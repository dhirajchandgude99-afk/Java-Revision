interface Animal5 {
    void sound();
}
class Dog3 implements Animal5 {
    @Override
    public void sound() {
        System.out.println("The dog is barking.");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
      Dog3 d = new Dog3();
      d.sound(); // Output: The dog barks.
        
    }
}
