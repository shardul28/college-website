/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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


/**
 *
 * @author Shubham
 */
public class contactuserend extends HttpServlet {

         Connection conn = null;
   Statement stmt = null;
     PreparedStatement ps=null;

       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
   static final String PASS = "root";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();


String fname=request.getParameter("fname"); 
String lname=request.getParameter("lname");  
String email=request.getParameter("eaddress");  
String tel=request.getParameter("tel"); 
String message=request.getParameter("message");

    
   try{
       out.print(""+fname+lname+email+tel+message);
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      
      out.println("Connected database successfully...");
     // response.sendRedirect("./login.html"); 
     
     PreparedStatement stmt=conn.prepareStatement("INSERT INTO contact(firstName, lastName, tel, email,message) values(?, ?, ?, ?, ?)");  
//stmt.setString(1,null);
stmt.setString(1,fname);
stmt.setString(2,lname);
stmt.setString(3,tel);
stmt.setString(4,email);
stmt.setString(5,message);

//out.print("ascas123"+method);
  
int i=stmt.executeUpdate();  
if(i>0){     out.println("alert('message sent');");

     response.sendRedirect("./contact.jsp"); 
     out.println("alert('message sent');");
} else{
   response.sendRedirect("./failure.html"); 
}
  
conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
       out.println("error"+e2);
      
   }
    

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
