public class Main {
    public static void main(String[] args) {
        Student s = new Student(502, "Dhiraj");
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(s);
    }
}
