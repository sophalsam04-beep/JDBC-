    // Learning JDBC -> Java database connectivity
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

        // SELECT QUERY
    private static Object DatabaseConnection;


    public static void main() {
        // Learning SQL Query in Java

            // create sql query
        String sql = "SELECT * FROM students";


        // create connection
        try (Connection conn = DatabaseConnection.getConnection(); 
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ){

            // while looping
            while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String className = rs.getString("class_name");

                
                        System.err.println(id + "|"+name+"|"+age+"|"+className);

            }
            
            
        } catch (SQLException e) {
                e.printStackTrace();


        }







    }



}