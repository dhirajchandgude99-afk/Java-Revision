class Animals2{
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog2 extends Animals2 {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animals2 a = new Dog2();
        a.sound(); // Output: The dog barks.
    }
}
