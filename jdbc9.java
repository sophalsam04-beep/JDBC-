
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class jdbc9 {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql3206://employees.com";
        String user = "sophal";
        String password = "123";
        
        try (Connection conn = DriverManager.getConnection(url,user,password);
            CallableStatement cstmt = conn.prepareCall("{call GetEmployeeSalary(?,?)}")
    ){

            // IN PARAMETER
        cstmt.setInt(1, 101);

            // OUT PARAMETER
            cstmt.registerOutParameter(2, Types.DECIMAL);

            // execute
            cstmt.execute();


                // OUT PARAMETER
            double salary = cstmt.getDouble(2);
                System.out.println("Salary : "+salary);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
