package spring013_ex_board;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your_db?serverTimezone=UTC",
                "your_username", "your_password"
            );
            System.out.println("?œ… DB ?—°ê²? ?„±ê³?!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

