class Student2 {
    int id;
    String name;

    // Default constructor
    Student2() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2(101, "Dhiraj");
        

        s1.display();
        System.out.println();
        s2.display();
        
    }
}
