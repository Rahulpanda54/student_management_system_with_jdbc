package student_Management_system;
import java.sql.*;

public class connection {

  static Connection connection;

    public static Connection create(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "College@123#";
            String url = "jdbc:mysql://localhost:3306/students";

            connection = DriverManager.getConnection(url,user,pass);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
