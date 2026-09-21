import java.sql.Connection;
import java.sql.SQLException;

public class jdbc5 {

        private static HikariDatasource datasource;
        static {
            HikariConfig config = new HikariConfig();
                config.setjdbcUrl("jdbc:oracledatabase2222://localhost:5432/db");
                config.setUsername("root");
                config.setPassword("sophal123");
                config.setDriverClassName("org.oracledatabase.Driver");


                    // Pool size
                    config.setMaximumPoolSize(30000);
                    config.setMinimumIdle(1000);


                    // Timeout
                config.setConnectionTimeout(3000);
                config.setIdleTimeout(6000);
                config.setMaxLifetime(1800000);

                    // connection testing / pool name

            config.setPoolName("MyHikariPool");


               datasource = new HikariDatasource(config);
            

        }

        public static Connection getConnection() throws SQLException{
                return getConnection();
        }

        public static void shutdown(){
            datasource.close();
        }



    public static void main(String[] args) {






    }
    
}
