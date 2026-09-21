// Header file
// package


    // Connection with SQL and Make QUERY
    
import java.net.URI;
import javax.sql.*;
import java.sql.*;
import java.sql.SQLData;
import java.sql.SQLException;


public class jdbc1 {
    public static void main(String[] args) {
            // CONNECTION
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "sophal123";
        String password = "sophal123";



            // try with resource off connetion automatically
            try (Connection conn = DriverManager.getConnection(url,user,password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT id,name,age FROM students")){
                
                        // using to While loop
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int age = rs.getInt("age");
                        
                            // displaying
                            System.out.println(id+"-"+name+"-"+age);



                    }


                      } catch (SQLException e) {
                        e.printStackTrace();
            }




    }
}
