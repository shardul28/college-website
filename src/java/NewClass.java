
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewClass {
    
public static Connection connection()
    {
        Connection con=null;


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
        }
        catch(SQLException|ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return con;

    }
public static void main(String args[]){  
NewClass.connection();
}
}