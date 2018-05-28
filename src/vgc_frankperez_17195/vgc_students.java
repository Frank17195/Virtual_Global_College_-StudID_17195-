package vgc_frankperez_17195;

import java.sql.*;
import javax.swing.*;

public class vgc_students {
   private Connection connect;
   private Statement st;
   private ResultSet rs;
   
   public Connection conexion(){
       try {
       Class.forName("com.mysql.jdbc.Driver");
       connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/17195_frank_perez_vgc", "root", "Frank@1234" );
       st = connect.createStatement();
       //JOptionPane.showMessageDialog(null, "Connected");
       
       } catch (Exception e){
               JOptionPane.showMessageDialog(null,"Error"+e);
       } 
   return connect;
   }
 
}
