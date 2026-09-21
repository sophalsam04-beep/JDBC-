
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    // ==============================
    //     JDBC Batch Processing
    // ==============================


public class jdbc7 {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysqldriver//:sql.com";
        String user = "sophal";
        String password = "1234";
            Connection conn = DriverManager.getConnection(url,user,password);
            conn.setAutoCommit(false); // important

                String query = "INSERT INTO employees(name,salary) VALUES(?,?)";

            PreparedStatement pstmt = conn.prepareStatement(query);


            Object employees;

        // for loop
        for (int i = 0; i < employees.size(); i++) {
                pstmt.setString(1, employees.get(i).getName());
                pstmt.setDouble(2, employees.get(i).getSalary());
                pstmt.addBatch();

                    if(i % 1000 ==0 ){
                        // Execute when 1000 record
                            pstmt.executeBatch();
                    }
                
        }

            pstmt.executeBatch();
            conn.commit();
            



    }
    
}
