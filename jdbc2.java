import java.sql.*;
import javax.sql.*;
import java.awt.*;
    // Create Prepared Statement in Java Programing

public class jdbc2 {
    public static void main(String[] args) {
            // connection
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
           String sql = "SELECT INTO students (name,age) VALUES (?,?)";

            String user = "sophal123";
            int password = 123;

            // using to try with resource
            try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(sql)


        ){

                stmt.setString(1, "sophal");
                stmt.setInt(2, 22);
                stmt.executeUpdate();


                System.out.println("Data input succesfully...!");

                
            } catch (SQLException e) {
                    e.printStackTrace();
            }




    }

    
}
