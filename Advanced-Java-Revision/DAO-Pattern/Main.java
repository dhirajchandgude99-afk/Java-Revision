public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student student = new Student(605, "ganesh");
        dao.updateStudent(student);
    }
}

            
