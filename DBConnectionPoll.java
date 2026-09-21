import java.sql.*;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

    // HIKARI Configuration


public class DBConnectionPoll {

        private static HikariDatasource datasource;
            static {
                HikariConfig config = new HikariDatasource();
                config.setjdbcurl("192.0.0.0.1");  // set Link database IPV4 Address
                config.setusername("root");
                config.setpassword("sophal123");
                config.setMaximumPoolSize(10);
                config.setMinimumIdle(5);
                config.setIdleTimeout(3000);
                config.setConnectionTimeout(10000);


                    datasource = new HikariDatasource(config);

                    
            }

            public static Connection getConnection() throws SQLException{
                  return datasource.getConnection();
                  
            }




    public static void main(String[] args) {




    }
}
