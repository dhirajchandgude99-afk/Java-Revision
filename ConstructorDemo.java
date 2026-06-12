class Student1{
    int id;
    String name;

    // Constructor
    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Dhiraj");
        Student1 s2 = new Student1(102, "Rahul");
        s1.display();
        s2.display();
    }
}
