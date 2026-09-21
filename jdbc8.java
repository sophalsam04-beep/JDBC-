
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;


    // ====================================
    //           CallableStatement         
    // ====================================

public class jdbc8 {
    public static void main(String[] args) throws SQLException{
            // store data
            String url = "jdbc:mysql3206://user.com";
            String user = "sophal";
            String password = "123";

            Connection conn = DriverManager.getConnection(url,user,password);
            String query = "INSERT INTO employees(name,salary,address) VALUES (?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(query);

                // using to CallableStatement
            CallableStatement cstmt = conn.prepareCall("{call procedure_name(?,?,?)}");

                //1. IN PARAMETER
        CallableStatement cstmt1 = conn.prepareCall("{call getEmployee(?)}");
        cstmt.setInt(1, 1000);  // IN PARAMETER
        ResultSet rs = cstmt.executeQuery();



            //2. OUT PARAMETER
            CallableStatement cstmt2 = conn.prepareCall("{call getEmployeeCount(?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
                cstmt.execute();

        int count = cstmt.getInt(1);


            // 3. INOUT PARAMETER
        CallableStatement cstmt3 = conn.prepareCall("{adjustSalary(?)}");
            cstmt3.setDouble(1, 5000.0);   // set value
                cstmt3.registerOutParameter(1, Types.INTEGER);
                    cstmt.execute();
        double newSalary = cstmt3.getDouble(1);   // new value can procedure caculating
    


    }
}
