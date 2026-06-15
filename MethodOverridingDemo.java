class Animals1 {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog1 extends Animals1 {
    @Override
    void sound() {
        System.out.println("The dogs barks.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        
        Dog1 d = new Dog1();
        d.sound(); // Output: The dog barks.
    }
}
