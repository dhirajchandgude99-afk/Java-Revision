class Student{
    int id;
    String name;

 void display(){
    System.out.println("Student id: " + id);
    System.out.println("Student name: " + name);
   }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Dhiraj";
        s1.display();
    }
}
