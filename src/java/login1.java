
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

  
public class login1 extends HttpServlet {  
     Connection conn = null;
   Statement stmt = null;
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
   static final String PASS = "root";
   
   @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();
          
String id=request.getParameter("id");  
String role,email,encryptedpass;

String pass=request.getParameter("pword");  
  out.println(""+id+pass);
Statement st=null;
ResultSet rs=null;
 try{
     
      
      Class.forName("com.mysql.jdbc.Driver");

      
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
      st = conn.createStatement();
      String QueryString = "select id,pass,role,email from stuniv where id='"+id+"' and pass = '"+pass+"'";
	rs = st.executeQuery(QueryString);
      
	if(rs.next()){
     role = rs.getString("role");
     email=rs.getString("email");
	out.print("Login Successfully."); 
       session.setAttribute("id",id);
       session.setAttribute("role",role);
       session.setAttribute("email",email); 
       
        
   
       session.setAttribute("pass",pass); 

       
        response.sendRedirect("index.jsp");
	}
	else
	out.print("User Name and password are not Valid..");
	}catch(ClassNotFoundException | SQLException  e2){
            out.print(e2);
            e2.getStackTrace();
   }

}

}
