import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
  


@WebServlet("/InsertData") 
public class InsertData extends HttpServlet { 
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
    private static final long serialVersionUID = 1L; 
      

    protected void doPost(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
        try { 
            InsertData.connection();
            Connection con = InsertData.connection(); 
  
            PreparedStatement st = con.prepareStatement("insert into demo values(?, ?)"); 
  
           
            st.setInt(1, Integer.valueOf(request.getParameter("id"))); 
  
            
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the successful result 
            PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 