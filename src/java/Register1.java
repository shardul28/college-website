import java.io.*;  
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register1 extends HttpServlet {  
     Connection conn = null;
   Statement stmt = null;
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
   static final String PASS = "root";
   
   @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
     
 
    //out.print("dasdsaasdsad"+"username:"+n+"id"+p+"email"+e+"pword"+c+"epwd"+c1);
    
String p=request.getParameter("id");  
int id=Integer.parseInt(p);
String n=request.getParameter("username"); 
String e=request.getParameter("email");  
String c=request.getParameter("pword");  
String s=request.getParameter("mySelect"); 
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
     // response.sendRedirect("./login.html"); 
     PreparedStatement stmt=conn.prepareStatement("insert into stuniv values(?,?,?,?,?)");  
stmt.setInt(1,id);
stmt.setString(2,n);
stmt.setString(3,e);
stmt.setString(4,c);
stmt.setString(5,s);


  
int i=stmt.executeUpdate();  
if(i>0){
     response.sendRedirect("./login.jsp"); 
} else{
   response.sendRedirect("./regfailure.jsp"); 
}
  
conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
      response.sendRedirect("./regfailure.jsp"); 
   }
    }
}
/*
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("username");  
String p=request.getParameter("id");  
String e=request.getParameter("email");  
String c=request.getParameter("pword");  
String c1=request.getParameter("pword2");  
out.print("username:"+n+"id"+p+"email"+e+"pword"+c+"epwd"+c1);
         

   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");}
   catch(ClassNotFoundException | SQLException e2){
       out.print(e2);
   }
}
}  */