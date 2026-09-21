// ======================================
// USING TO HIkariCP IN java Programing
// ======================================

import java.sql.Connection;
import java.sql.SQLException;

public class jdbc6 {

    // store data
        private static HikariDatasource datasource;

            static {
                HikariConfig config = new HikariConfig();
                config.setjdbcUrl("jdbc:mysqldatabase://localhost:3306/mydb");
                config.setUsername("root");
                config.setPassword("sophal123");
                config.setDriverManager("com.mysql.cj.jdbc.Driver");


                    // Define Pool
                    config.setMaxmiumumPoolSize(10);
                    config.setMinimumIdle(2);
                    config.setConnectionTimeout(3000);
                    config.setMaxlifetime(2000);


                    datasource = new HikariDatasource(config);

                
            }


                public static Connection getConnection() throws SQLException{
                    return getConnection();
                }

                public static void closePool() {
                        if(datasource != null){
                            datasource.close();
                        }
                }


        public static void main(String[] args) {
                try (Connection conn = jdbc6.getConnection()){
                        // using to Connection for make Query
                    System.out.println("Connected Succesfully!");

                    
                } catch (SQLException e) {
                        e.printStackTrace();

                }finally{
                    jdbc6.closePool();
                }




        }


}
