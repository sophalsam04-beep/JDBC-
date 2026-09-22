import java.util.List;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Model_class {
    
    public class Student {
            private int id;
            private String name;
            private String email;


            // constructor with Default value
                public Student(){}

            // constructor with parameter
            public Student(int id, String name, String email){
                    this.id = id;
                    this.name=name;
                    this.email = email;
            }

                    // Getter and Setter
            public int getId(){
                return id;
            }
            public void setId(int id){
                this.id=id;
            }
            public String getName(){
                return name;
            }
            public void setName(String name){
                this.name=name;
            }

            public void setEmail(String email){
                this.email=email;
            }
            public String getEmail(){
                return email;
            }


    }


    // =================
    // DAO Interface
    // =================

public interface StudentDAO{
        // void function 
            void insert(Student student);
            Student getByID(int id);

            List<Student> getAll();

                void update(Student student);
            void delete(int id);


}



    private static final String url = "jdbc:mysql://localhost:3306/school_db";
    private static final String user = "root";
    private static final String password = "1234";


    public static Connection getConnection() throws SQLException{
                        try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                        } catch (ClassNotFoundException e) {
                                throw new SQLException("JDBC not found ...!", e);

                        }

                    return DriverManager.getConnection(url,user,password);
            }

            

    public static void main(String[] args) {
        
        
    }
}
