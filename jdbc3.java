import java.net.URL;
import java.security.PublicKey;
import java.sql.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.jar.Attributes;


    // CRUD WITH Database QUERY

public class jdbc3 {
        private String url = "jdbc:oracle:thin:@localhost:1521:XE";
        private  String user = "sophal";
        private String password = "123";



        public void addStudents(String name, int age) throws SQLException{
            String sql = "SELECT INTO students(name,age) VALUES (?,?)";

            try (Connection conn = DriverManager.getConnection(url,user,password);
                    PreparedStatement stmt = conn.prepareStatement(sql)
        ){

                    // setINT
                    stmt.setString(2, "sopheak");
                    stmt.setInt(2, 22);
                    stmt.executeUpdate();
        
            } catch (Exception e) {


            }
        }














    public static void main(String[] args) {
            // CRUD OPERATION
                
        
        



    }





}
