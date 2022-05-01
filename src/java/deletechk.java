
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class deletechk extends HttpServlet{
    Connection conn = null;
    PreparedStatement ps=null;
   Statement stmt = null;
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
   static final String PASS = "root";
 @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
     
 
    //out.print("dasdsaasdsad"+"username:"+n+"id"+p+"email"+e+"pword"+c+"epwd"+c1);
    try{
String p=request.getParameter("id");  
int id=Integer.parseInt(p);
String n=request.getParameter("username"); 
String e=request.getParameter("email");   
String s=request.getParameter("mySelect"); 
   
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM stuniv WHERE id="+id);
out.println("Data Deleted Successfully!");
response.sendRedirect("./staffusrmngmt.jsp"); 

conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
      out.print(e2);
   }    

    }
}
