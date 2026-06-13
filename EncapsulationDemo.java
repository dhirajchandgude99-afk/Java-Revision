class Student3 {
    private int id;
    private String name;
   

    // Setter methods for id and name
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter methods for id and name
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.setId(101);
        s1.setName("Dhiraj");

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
    }
}
