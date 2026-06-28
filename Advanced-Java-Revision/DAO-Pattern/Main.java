public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s = dao.getStudentById(502);
        if (s != null) {
            System.out.println("Student ID: " + s.getId());
            System.out.println("Student Name: " + s.getName());
        } else {
            System.out.println("Student not found.");
        }
    }
}
