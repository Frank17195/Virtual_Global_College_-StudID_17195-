
package vgc_frankperez_17195;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class login_valid {
vgc_students con = new vgc_students();    

// Connection Variables
Connection connect = null; 
Statement st = null;
ResultSet rs = null;
String query;

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

}
