package control.school.com;

public class Administrator extends User {
    private int adminLevel;

    public Administrator(String username, String password, int adminLevel) {
        super(username, password, "Administrator");
        this.adminLevel = adminLevel;
    }

    public int getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public void showDashboard() {
        System.out.println("Welcome Admin: " + getUsername() + " | Level: " + adminLevel);
    }
}