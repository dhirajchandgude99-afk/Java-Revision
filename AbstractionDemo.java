abstract class Animal4 {
    abstract void sound();
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog4 extends Animal4 {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
public class AbstractionDemo {
 public static void main(String[] args) {
    Dog4 d = new Dog4();
    d.sound(); // Output: The dog barks.
    d.eat(); // Output: This animal eats food.
 }   
}
