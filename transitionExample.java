import java.net.ConnectException;
import java.sql.*;

public class transitionExample {
    public static void main(String[] args) throws SQLException {
            // Transition in Java Programing
                String url = "jdbc:mysql://localhost:3306/users";
                String user = "sophal";
                String password = "123";

        // Create connection
        Connection conn = null;

                // using to try for execute
            try {
                conn = DriverManager.getConnection(url,user,password);

                    // off auto commit
                conn.setAutoCommit(false);


                // ===============================================
                    // 1 - Transaction : Withdrawing money to acc A
                    // ===========================================


            PreparedStatement pstmt1 = conn.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE id = ?"
            );

            PreparedStatement pstmt2 = conn.prepareStatement(
                "UPDATE users SET salary - ? WHERE id = ?"
            );



                //2 - Transaction : Top up salary to acc B
            PreparedStatement pstmt3 = conn.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE id = ?"
            );

            PreparedStatement pstmt4 = conn.prepareStatement(
                "UPDATE users SET salary = salary + ? WHERE id = ?"
            );

            pstmt3.setDouble(1, 100.0);
            pstmt3.setInt(2, 2);
            pstmt3.executeUpdate();


                // if acc 2 succesfully is commit
            conn.commit();
                System.out.println("Transaction is succesfully...!");


                
            } catch (SQLException e) {
                    // if having problem -> rollback
                    try {
                           if(conn != null) conn.rollback(); 
                            System.out.println("Transaction rollback due to error...!");

                    } catch (SQLException ex) {
                            e.printStackTrace();
                    }

                e.printStackTrace();

            }finally{
                try {
                    if(conn != null){
                        conn.setAutoCommit(true);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


    }
}
