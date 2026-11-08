package control.school.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // رابط الاتصال بقاعدة بيانات SQL Server (تأكد من تعديل اسم السيرفر إذا لزم الأمر مثل localhost)
	private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=SchoolControlDB;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa"; // اسم المستخدم الخاص بـ SQL Server
    private static final String PASSWORD = "123"; // كلمة المرور الخاصة بك

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to SQL Server Successfully!");
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}