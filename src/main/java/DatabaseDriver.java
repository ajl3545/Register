import javax.xml.transform.Result;
import java.sql.*;

public class DatabaseDriver {
    public static void main(String[] args) {
        try{
            // 1. Get a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase","root","lamarche");
            // 2. Create a sql statement
            Statement statement = conn.createStatement();
            // 3. Execute Query
            ResultSet myRes = statement.executeQuery("SELECT * FROM inventory");
            // 4. process output
            while(myRes.next()){
                System.out.println(myRes.getString("name") + myRes.getString("price"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
