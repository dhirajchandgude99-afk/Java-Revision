public class Main {
    public static void main(String[] args) {
        Student s = new Student(501, "Akanksha");
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(s);
    }
}
