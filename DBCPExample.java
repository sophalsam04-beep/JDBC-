// ============================
//         Apache DBCP2
// ===========================

import java.sql.*;
import java.sql.SQLException;
import java.sql.Connection;
import javax.sql.DataSource;


public class DBCPExample {
    private static DataSource ds;
        static {
            BasicDataSource bds = new BasicDataSource();
            bds.setUrl("dbc:mysql://localhost:3306/mydb");
            bds.setUsername("root");
            bds.setPassword("sophal123");
            bds.setMinIdle(5);
            bds.setMaxIdle(10);
            bds.setMaxOpenPrepareStatements(100);
            ds = bds;
        }

        public static Connection getConnection() throws SQLException{
            return getConnection();
        }



    public static void main(String[] args) {
            try (Connection conn = getConnection()){
                    System.out.println("Connected succesfully...!");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
