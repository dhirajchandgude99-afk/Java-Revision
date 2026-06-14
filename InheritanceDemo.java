class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat(); // Inherited method from Animal class
        d1.bark(); // Dog's own method
    }
}
