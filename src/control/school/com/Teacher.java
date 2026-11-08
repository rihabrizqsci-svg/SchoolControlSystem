package control.school.com;

public class Teacher extends User {
    private String department;

    public Teacher(String username, String password, String department) {
        super(username, password, "Teacher");
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void showDashboard() {
        System.out.println("Welcome Teacher: " + getUsername() + " | Dept: " + department);
    }
}