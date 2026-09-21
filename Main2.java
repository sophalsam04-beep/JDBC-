import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main2 {
        public static void main(String[] args) {
                String sql = "SELECT * FROM students";
                String sqlserver = "SELECT * FROM students WHERE salary = 300";
                String mysql = "SELECT * FROM students WHERE id = ?";

                    // INSERT INTO DATA INTO QUERY
            String query = """
                    INSERT INTO students(id,name,salary) VALUES(?,?,?)
                    """;


                    try(Connection conn = DatabaseConnection.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql)
                ) {

                            pstmt.setString(1, "sophal");
                            pstmt.setInt(2, 23);
                            pstmt.setString(3, "Java Programing");

                                int row = pstmt.executeUpdate();

                                System.out.println(" Student inserted...!");
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }






        }    
}
