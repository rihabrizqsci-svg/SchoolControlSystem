package control.school.com;

public class Main {
    public static void main(String[] args) {
        try {
            User admin = new Administrator("admin_user", "admin123", 1);
            User teacher = new Teacher("teacher_user", "teach123", "Computer Science");
            User student = new Student("student_user", "stud123", "ST-2026-001");

            admin.showDashboard();
            teacher.showDashboard();
            student.showDashboard();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}