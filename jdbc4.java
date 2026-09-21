import java.sql.*;

public class jdbc4 {

    public static void main(String[] args) {


            // ===============================
            //        INSERT DATABASE
            // ===============================

        // store data
            String url = "192.168.7.131";
            String user = "sophal";
            String password = "sophal123";

            // Writing query into java programing
                String query = "SELECT id,name,age , email FROM users WHERE age > ?";


                    try (Connection conn = DriverManager.getConnection(url,user,password);
                    PreparedStatement pstmt = conn.prepareStatement(query)

                ){

            // define value on parameter
        pstmt.setInt(1, 18);

                // using to try for ResultSet
            try (ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int age = rs.getInt("age");
                        String email = rs.getString("email");

                        System.out.println(id+"|"+name+"|"+age+"|"+email);


                }

            }
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }




                // ======================================
                //             UPDATE DATABASE
                // ======================================

            String sqlUpdate = "UPDATE users SET email = ? WHERE id = ?";

                try (Connection conn = DriverManager.getConnection(url,user,password);
                        PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)
            ){
                    pstmt.setString(1, "samsophal@gmail.com");
                    pstmt.setInt(1, 30);
                    pstmt.executeUpdate();


                    
                } catch (Exception e) {
                    e.printStackTrace();

                }


                
            // ===========================================
            //             DELETE DATABASE
            // ===========================================
        
        String sqlDelete = "DELETE FROM users WHERE id = ?";
                try (Connection conn = DriverManager.getConnection(url,user,password);
                    PreparedStatement pstmt = conn.prepareStatement(sqlDelete)
            ){
                    pstmt.setInt(1, 1);
                    pstmt.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }




    }


}
