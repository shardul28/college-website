/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffusrmngmtupdate;

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
  
public class updatestud {

 ResultSet resultSet = null;
     Connection conn = null;
   Statement stmt = null;
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
   static final String PASS = "root";
   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
    PrintWriter out = response.getWriter();
     
 
    //out.print("dasdsaasdsad"+"username:"+n+"id"+p+"email"+e+"pword"+c+"epwd"+c1);
    
String p=request.getParameter("id");  
 int id=Integer.parseInt(p);
String n=request.getParameter("username"); 
String e=request.getParameter("email");  
String c=request.getParameter("pword");  
String s=request.getParameter("mySelect"); 
  
Class.forName("com.mysql.jdbc.Driver");
stmt=conn.createStatement();
String sql ="select * from stuniv";
resultSet = stmt.executeQuery(sql);
while(resultSet.next()){
String email=request.getParameter("email");
String role=request.getParameter("mySelect");

Connection con = null;
PreparedStatement ps = null;
try
{
String sql2="Update stuniv set id=?,email=?,role=? where id="+id;
ps = conn.prepareStatement(sql2);
ps.setInt(1,id);
ps.setString(2, email);
ps.setString(3, role);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else

out.println("Connected database successfully...");


if(i>0){
     response.sendRedirect("./login.html"); 
} else{
   response.sendRedirect("./regfailure.html"); 
}
  
conn.close();  
}catch(IOException | SQLException e2){
    out.print(e2);
}}    
}
}

