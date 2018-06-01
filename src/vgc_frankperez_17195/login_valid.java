
package vgc_frankperez_17195;
import java.sql.Connection;
import java.sql.DriverManager;



public class login_valid {
  static Connection con;
  
  public static Connection getConnection() {
      try{
    Class.forName("com.mysql.jdbc.Driver");      
    con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/17195_frank_perez_vgc", "root", "Frank@1234" );    
      }catch(Exception ex){
       System.out.println(""+ex);
      }
      return con;
  }



/*
    public boolean verify(String user, String pwr) {
    int sw =0;
    query = "select * from security where UserName='" +user+"'and Password='"+pwr+"'";
        
        try {  
        connect = con.conexion();
        st = connect.createStatement();
        rs = st.executeQuery(query);
        while(rs.next()){           
        if (rs.getString(1)== null)
            sw = 0;
        else
            sw = 1;
        }
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error SQL" + ex);
        }
        
        if (sw ==1) return true;
        else return false;
        
    } 
    */

}
