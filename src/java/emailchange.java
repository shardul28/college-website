/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.cj.xdevapi.PreparableStatement;
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
import javax.servlet.http.HttpSession;


public class emailchange extends HttpServlet {
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
         HttpSession session=request.getSession();
          
String p=request.getParameter("id");  
int id=Integer.parseInt(p);
 String newemail=request.getParameter("emailnew");
String email=request.getParameter("email");
String pass=request.getParameter("pword");  
String emailv = null ,passv= null;


 try{

      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
     // System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
     // out.println("Connected database successfully...");
 stmt=conn.createStatement();
 //out.println("details id="+id+",email="+email+"username="+username+pass);
 //validation
 stmt = conn.createStatement();

      String sql = "SELECT username,email,pass FROM stuniv where id="+id;
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
        // int idv  = rs.getInt("id");
          emailv = rs.getString("email");
          passv = rs.getString("pass");

          
        

         //Display values
       //   out.println("details for validation email="+emailv+"username="+usernamev);   
}
      
               if(email.equals(emailv)==false){
                   out.println("ERROR:");
                   out.println("Invalid previous Email Id !");
                    // out.println("<br><br><a href= 'index.jsp'>Home</a>");


               }
               if (passv.equals(pass)==false){
                 out.println("ERROR:");
                 out.println("Invalid Password");
               // out.println("<br><br><a href= 'index.jsp'>Home</a>");


               }conn.close();
  }catch (SQLException ex) {
         Logger.getLogger(forgotpass.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(forgotpass.class.getName()).log(Level.SEVERE, null, ex);
     } 


 //UPDATE
 if(email.equals(emailv)==true && pass.equals(passv)==true){
try{ 
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
     // System.out.println("Connecting to a selected database...2");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
     // out.println("Connected database successfully... 2");
 stmt=conn.createStatement();
 //out.println("details id="+id+",email="+email+"username="+username+pass);
 //validation
 stmt = conn.createStatement();
 String sql2="Update stuniv set email=? where id="+id;//+" AND email="+email+" AND username="+username;
ps =  conn.prepareStatement(sql2);
ps.setString(1,newemail);
int i=ps.executeUpdate();

if(i>0){

out.println("email updated successfully !");
 session.setAttribute("email",email); 
   response.sendRedirect("./profile.jsp"); 
                      
      

}
else{
out.println("Invalid Details!");
  //out.println("<br><br><a href= 'index.jsp'>Home</a>");
}}
catch(SQLException ex){
    out.println(""+ex);

}    catch (ClassNotFoundException ex) {
         Logger.getLogger(forgotpass.class.getName()).log(Level.SEVERE, null, ex);
     }
}else{
         out.println("ERROR Please enter appropraite Details");
          //  response.sendRedirect("./error.html"); 


 };
 
   
 
 
 
 
 
 
 
 
 
 
 
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
