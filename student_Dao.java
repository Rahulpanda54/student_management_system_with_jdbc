package student_Management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class student_Dao {
    public static boolean insert(student st){

        boolean flag = false;

        try {

            Connection con = connection.create();
            String query = "insert into student(name,s_phone,scity) values(?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1,st.getName());
            preparedStatement.setString(2, st.getPhone());
            preparedStatement.setString(3,st.getCity());

            preparedStatement.executeUpdate();

            flag = true;


        } catch (Exception e) {

            e.printStackTrace();

        }

        return flag;
    }


    public static boolean deleteStudent(int id) {

        boolean flag = false;

        try {

            Connection con = connection.create();

            String query = "delete from student where id=?";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

            flag = true;

        }
        catch (Exception e) {

            e.printStackTrace();

        }

        return flag;

    }

    public static void showStudent() {


        try {

            Connection con = connection.create();

            String query = "select * from student";

            Statement statement = con.createStatement();

            ResultSet st = statement.executeQuery(query);

            while(st.next()) {


                int id = st.getInt(1);
                String name = st.getString(2);
                String phone = st.getString(3);
                String city = st.getString("scity");


                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("phone: " + phone);
                System.out.println("city: " + city);
                System.out.println("________________________________________________________________________");

            }


        } catch (Exception e) {

            e.printStackTrace();

        }
    }


    public static boolean updateStudent(int id, String name, String phone, String city) {

        boolean flag = false;


        try {

            Connection con = connection.create();
            String query = "UPDATE student SET name=?, s_phone=?, scity=? WHERE id=?";
            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phone);
            preparedStatement.setString(3, city);
            preparedStatement.setInt(4, id);

            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                flag = true;
            }

            con.close();
            // Close connection
        }

        catch (Exception e) {
            e.printStackTrace();
        }


        return flag;
    }
}
