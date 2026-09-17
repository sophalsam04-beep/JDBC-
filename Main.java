    // Learning JDBC -> Java database connectivity
import java.sql.*;

public class Main {


    public static void main() {
        // Learning SQL Query in Java

            // create sql query
        String sql = """
                    SELECT * FROM students s
                    WHERE score>=90 AND score<=100
                        AND score >=80 AND score<=90
                        AND score >=70 AND score<=80
                        AND score >=60 AND score<=70
                        AND score >=50 AND score<=60
                        AND score >=0 AND score<=50
                    ORDER BY score ASC
                    GROUP BY id
                    JOIN teacher t ON t.student_id = s.student_id;
                      
                """;


        // create connection
        try (Connection conn = DatabaseConnection.getConnection(); 
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ){
            
        } catch (Exception e) {
        }







    }



}