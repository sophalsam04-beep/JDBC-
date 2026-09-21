import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main1 {
    public static void main(String[] args) {
            // SELECT WITH WHERE
        String sql = "SELECT * FROM employees WHERE id = 101";
        String sqlserver = "SELECT * FROM sale WHERE salary = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();

               // Prepared Statement
               PreparedStatement pstmt = conn.prepareStatement(sql);


    ){


           pstmt.setInt(1, 2);

           // ResultSet 
           ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                System.out.println("Name"+rs.getString("name"));
                System.out.println("Age"+rs.getString("age"));

            }
            
        } catch (SQLException e) {
                e.printStackTrace();

        }
        




    }
    
}
