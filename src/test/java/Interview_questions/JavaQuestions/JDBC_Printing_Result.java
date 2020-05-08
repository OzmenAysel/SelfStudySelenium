package Interview_questions.JavaQuestions;

import java.sql.*;

public class JDBC_Printing_Result {
    //Printing Result
    public static void main(String[] args) throws SQLException {

        String username = "hr";
        String password = "hr";
        String url = "jdbc:oracle:thin:@3.87.141.2:1521:xe";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select*from employees");

        while(resultSet.next()){
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            int salary = resultSet.getInt("salary");

            System.out.println(firstName+" "+lastName+" "+salary);
        }

    }


}
