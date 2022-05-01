/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import static Register1.DB_URL;
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
public class teachersend extends HttpServlet {
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

String p=request.getParameter("id");  
int id=Integer.parseInt(p);
String subject=request.getParameter("subject"); 
String year=request.getParameter("year");  
String link=request.getParameter("link");  
String stream=request.getParameter("mySelect"); 
String method=request.getParameter("mySelect2");

    

if(method.equals("insert")){
    out.print("ascas123"+method+subject+year+link+p+stream);
   try{
       out.print("ascas123"+method);
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      
      out.println("Connected database successfully...");
     // response.sendRedirect("./login.html"); 
     
     PreparedStatement stmt=conn.prepareStatement("insert into notes values(?,?,?,?,?)");  
stmt.setInt(1,id);
stmt.setString(2,subject);
stmt.setString(3,link);
stmt.setString(4,year);
stmt.setString(5,stream);

out.print("ascas123"+method);
  
int i=stmt.executeUpdate();  
if(i>0){
     response.sendRedirect("./notes_stud.jsp"); 
} else{
   response.sendRedirect("./failure.html"); 
}
  
conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
       out.println("error"+e2);
      response.sendRedirect("./failure.html"); 
   }
    }else if(method.equals("update")){//UPDATE -------------------------------
        out.print("ascas123"+method+subject+year+link+p+stream);
     try{

   
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
String sql2="Update notes set id=?,subject=?,year=?,link=?,stream=? where id="+id;
ps = conn.prepareStatement(sql2);
ps.setInt(1,id);
ps.setString(2, subject);
ps.setString(3, year);
ps.setString(4, link);
ps.setString(4, stream);
int i = ps.executeUpdate();
   
 if(i>0){
     response.sendRedirect("./notes_stud.jsp"); 
} else{
   response.sendRedirect("./failure.html"); 
}

  
conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
      out.print(e2);
   }    
       
    }else if(method.equals("delete")){
            out.print("ascas123"+method+subject+year+link+p+stream);

     try{

      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      out.println("Connected database successfully...");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM notes WHERE id="+id);
out.println("Data Deleted Successfully!");
response.sendRedirect("./notes_stud.jsp"); 

conn.close();  
   
   }
   catch(ClassNotFoundException | SQLException e2){
      out.print(e2);
   }      
    }

    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
