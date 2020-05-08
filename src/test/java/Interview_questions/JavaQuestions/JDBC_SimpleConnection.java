package Interview_questions.JavaQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_SimpleConnection {

    public static void main(String[] args) throws SQLException {

        String username = "hr";
        String password = "hr";
        String url = "jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connected Successfully");

    }
}
