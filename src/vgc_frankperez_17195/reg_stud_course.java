
package vgc_frankperez_17195;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reg_stud_course extends javax.swing.JFrame {
DefaultTableModel model;

    public reg_stud_course() {
        initComponents();
        Rerase();
        Rshow_data("");
        Rdeactivate();
    }

     void Rshow_data(String value){
    String [] heads = {"reg_numb","Student ID","Course code"};
    String [] registers = new String [3];
    String sql = "select * from reg_stud_course where CONCAT (idstudent,' ',CourseNumb) LIKE '%" + value +"%'"  ;
    
    model = new DefaultTableModel(null,heads);
    
    vgc_students cc = new vgc_students();
    Connection cn = cc.conexion();
    
    Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
            registers[0]=rs.getString("reg_numb");
            registers[1]=rs.getString("idstudent");
            registers[2]=rs.getString("CourseNumb");

            model.addRow(registers);
            }
            table_reg_stud.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
    void Rerase(){
    text_Rstud.setText("");
    text_Rcourse.setText("");
    }
    
     void Rdeactivate(){
    text_Rstud.setEnabled(false);
    text_Rcourse.setEnabled(false);
    Rnew_button.setEnabled(true);
    Rsave_button.setEnabled(false);
    Rcancel_button.setEnabled(false);
    }
     
    void Ractivate(){
    text_Rstud.setEnabled(true);
    text_Rcourse.setEnabled(true); 
    Rnew_button.setEnabled(true);
    Rsave_button.setEnabled(true);
    Rcancel_button.setEnabled(true);
    } 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_Rstud = new javax.swing.JTextField();
        text_Rcourse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Rexit_button = new javax.swing.JButton();
        Rnew_button = new javax.swing.JButton();
        Rcancel_button = new javax.swing.JButton();
        Rsave_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reg_stud = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Register of Student by Course");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Course Code");

        Rexit_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rexit_button.setForeground(new java.awt.Color(204, 0, 0));
        Rexit_button.setText("Exit");
        Rexit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rexit_buttonActionPerformed(evt);
            }
        });

        Rnew_button.setText("New");
        Rnew_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rnew_buttonActionPerformed(evt);
            }
        });

        Rcancel_button.setText("Cancel");
        Rcancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rcancel_buttonActionPerformed(evt);
            }
        });

        Rsave_button.setText("Save");
        Rsave_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rsave_buttonActionPerformed(evt);
            }
        });

        table_reg_stud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_reg_stud);

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_Rcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_Rstud, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Rnew_button)
                .addGap(18, 18, 18)
                .addComponent(Rsave_button)
                .addGap(18, 18, 18)
                .addComponent(Rcancel_button)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rexit_button)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_Rstud))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Rcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rexit_button)
                    .addComponent(Rcancel_button)
                    .addComponent(Rsave_button)
                    .addComponent(Rnew_button)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rsave_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rsave_buttonActionPerformed
   vgc_students cc = new vgc_students();
   Connection cn = cc.conexion();  
   
      String stud_numb, course_numb;
   String sql="";
   stud_numb = text_Rstud.getText();
   course_numb = text_Rcourse.getText();
 
sql = "INSERT INTO reg_stud_course (idstudent, CourseNumb) VALUES (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, stud_numb);
            pst.setString(2, course_numb);

           int n= pst.executeUpdate();
   if(n>0){
           JOptionPane.showMessageDialog(null, "Data Saved");
           Ractivate();
           Rshow_data("");
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_Rsave_buttonActionPerformed

    private void Rnew_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rnew_buttonActionPerformed
    Rerase();
    Ractivate();
    }//GEN-LAST:event_Rnew_buttonActionPerformed

    private void Rcancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rcancel_buttonActionPerformed
    Rerase();
    Rdeactivate();
    }//GEN-LAST:event_Rcancel_buttonActionPerformed

    private void Rexit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rexit_buttonActionPerformed
   System.exit(0);
    }//GEN-LAST:event_Rexit_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Level_Admin().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reg_stud_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg_stud_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg_stud_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg_stud_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reg_stud_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rcancel_button;
    private javax.swing.JButton Rexit_button;
    private javax.swing.JButton Rnew_button;
    private javax.swing.JButton Rsave_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_reg_stud;
    private javax.swing.JTextField text_Rcourse;
    private javax.swing.JTextField text_Rstud;
    // End of variables declaration//GEN-END:variables
}
