package control.school.com;

public class Student extends User {
    private String studentId;

    public Student(String username, String password, String studentId) {
        super(username, password, "Student");
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void showDashboard() {
        System.out.println("Welcome Student: " + getUsername() + " | ID: " + studentId);
    }
}