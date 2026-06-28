import java.util.List;
public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println("Student ID: " + s.getId());
            System.out.println("Student Name: " + s.getName());
            System.out.println("------------------------");
        }
    }
}

            
