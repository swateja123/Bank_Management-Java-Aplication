
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bitoo
 */
public class home1 extends javax.swing.JFrame {
    PreparedStatement pstmt;
    ResultSet rs;

    /**
     * Connection con=null;
   PreparedStatement pstmt=null;
   ResultSet rs=null;
    /**
     * Creates new form deletecontrol
     */
   


    
    public home1() {
        initComponents();
        DisplayTable();
        update_table();
       
    }
    private void DisplayTable()
{
     try{
   Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
    String sql="select * from newaccount";
    PreparedStatement pstmt=con.prepareStatement(sql);
    ResultSet rs=pstmt.executeQuery();
    jTable2.setModel(DbUtils.resultSetToTableModel(rs));
    
    
    
  
    }
    catch(Exception e)
         {
        JOptionPane.showMessageDialog(null,e);
        
    }
}
    private void update_table()
    {
        try
        {   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            String sql="select * from newaccount";
            PreparedStatement pstmt=con.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
           //  jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
    }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            try{
                rs.close();
                pstmt.close();
            }
            catch(Exception e){
        }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        ACC_NO = new javax.swing.JTextField();
        ACC_TYPE = new javax.swing.JTextField();
        GENDER = new javax.swing.JTextField();
        PAN_NO = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        MOBILE = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ADHAR_NO = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        BALANCE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        pin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("ADHAR_NO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 320, 150, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("ACCOUNT NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 180, 61);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("ACC_TYPE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 210, 140, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("PIN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 540, 84, 33);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 650, 102, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("BALANCE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 530, 130, 34);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("DOB");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(600, 610, 109, 38);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("MOB");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 130, 75, 38);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 430, 140, 39);

        NAME.setBackground(new java.awt.Color(204, 255, 255));
        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        getContentPane().add(NAME);
        NAME.setBounds(300, 300, 150, 52);

        ACC_NO.setBackground(new java.awt.Color(204, 255, 255));
        ACC_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACC_NOActionPerformed(evt);
            }
        });
        getContentPane().add(ACC_NO);
        ACC_NO.setBounds(310, 110, 142, 50);

        ACC_TYPE.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(ACC_TYPE);
        ACC_TYPE.setBounds(310, 200, 142, 54);

        GENDER.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(GENDER);
        GENDER.setBounds(320, 610, 139, 63);

        PAN_NO.setBackground(new java.awt.Color(204, 255, 255));
        PAN_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAN_NOActionPerformed(evt);
            }
        });
        getContentPane().add(PAN_NO);
        PAN_NO.setBounds(810, 250, 160, 54);

        DOB.setBackground(new java.awt.Color(204, 255, 255));
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        getContentPane().add(DOB);
        DOB.setBounds(810, 130, 160, 50);

        MOBILE.setBackground(new java.awt.Color(204, 255, 255));
        MOBILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILEActionPerformed(evt);
            }
        });
        getContentPane().add(MOBILE);
        MOBILE.setBounds(820, 600, 160, 66);

        ADDRESS.setBackground(new java.awt.Color(204, 255, 255));
        ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDRESSActionPerformed(evt);
            }
        });
        getContentPane().add(ADDRESS);
        ADDRESS.setBounds(300, 410, 173, 55);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 780, 169, 51);

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 860, 137, 46);

        ADHAR_NO.setBackground(new java.awt.Color(204, 255, 255));
        ADHAR_NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADHAR_NOActionPerformed(evt);
            }
        });
        getContentPane().add(ADHAR_NO);
        ADHAR_NO.setBounds(820, 390, 160, 60);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("TRANSACTION RECORD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(850, 780, 247, 50);

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("CHECK DETAILS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(590, 780, 216, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Pan_no");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(620, 260, 104, 36);

        BALANCE.setBackground(new java.awt.Color(204, 255, 255));
        BALANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BALANCEActionPerformed(evt);
            }
        });
        getContentPane().add(BALANCE);
        BALANCE.setBounds(810, 510, 231, 54);

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("CUSTOMERS RECORD:-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 30, 470, 61);

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 0));
        jButton5.setText("delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 780, 190, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("ADHAR_NO");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 400, 140, 50);

        jTable2.setBackground(new java.awt.Color(255, 204, 204));
        jTable2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1140, 200, 620, 520);

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 0));
        jButton7.setText("delete confirm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(410, 780, 140, 50);

        pin.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(pin);
        pin.setBounds(320, 520, 150, 50);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 0, 40);

        jLabel16.setBackground(new java.awt.Color(204, 255, 204));
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 2970, 1730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                          try{
                              
                              
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
           String sql="select * from newaccount where ACC_NO=?";
           PreparedStatement pstmt=con.prepareStatement(sql);
           
           // pstmt=con.prepareStatement("select * from newaccount where ACC_NO=?");
          // pstmt=con.prepareStatement("select * from user where ACC_N0=?");
            pstmt.setString(1, ACC_NO.getText());
           ResultSet rs=pstmt.executeQuery();
          // pstmt.executeQuery();
           if(rs.next())
           {
               //rno.setText(rs.getString("rollno"));
                ACC_TYPE.setText(rs.getString("ACC_TYPE"));
                NAME.setText(rs.getString("NAME"));
                ADDRESS.setText(rs.getString("ADDRESS"));
                pin.setText(rs.getString("PIN"));
                GENDER.setText(rs.getString("GENDER"));
                DOB.setText(rs.getString("DOB"));
                MOBILE.setText(rs.getString("MOBILE"));
                PAN_NO.setText(rs.getString("PAN_NO"));
                ADHAR_NO.setText(rs.getString("ADHAR_NO"));
                BALANCE.setText(rs.getString("BALANCE"));
                
           }
            
       else
           {
               JOptionPane.showMessageDialog(null, "not found");
           }

con.close();
           
           
           
    }                                        
catch(Exception e)
{
     JOptionPane.showMessageDialog(null,e);
}
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            new Transactions().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         new check().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ACC_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACC_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACC_NOActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDRESSActionPerformed

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void MOBILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOBILEActionPerformed

    private void PAN_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAN_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAN_NOActionPerformed

    private void BALANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BALANCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BALANCEActionPerformed

    private void ADHAR_NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADHAR_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADHAR_NOActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        try{
            
        
        int SelectedRowIndex=jTable2.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "no data enter empy field");
        }
        update_table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
           DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int SelectedRowIndex=jTable2.getSelectedRow();
        ACC_NO.setText(model.getValueAt(SelectedRowIndex, 0).toString());
         ACC_TYPE.setText(model.getValueAt(SelectedRowIndex, 1).toString());
          NAME.setText(model.getValueAt(SelectedRowIndex, 2).toString());
           ADDRESS.setText(model.getValueAt(SelectedRowIndex, 3).toString());
           pin.setText(model.getValueAt(SelectedRowIndex, 4).toString()); 
            GENDER.setText(model.getValueAt(SelectedRowIndex, 5).toString());
             DOB.setText(model.getValueAt(SelectedRowIndex, 6).toString());
            //  MOBILE.setText(model.getValueAt(SelectedRowIndex, 7).toString());
               PAN_NO.setText(model.getValueAt(SelectedRowIndex, 7).toString());
                ADHAR_NO.setText(model.getValueAt(SelectedRowIndex, 8).toString());
                 BALANCE.setText(model.getValueAt(SelectedRowIndex, 9).toString());
                  MOBILE.setText(model.getValueAt(SelectedRowIndex, 10).toString());
        
         
         
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try{
             String sql="delete from newaccount where ACC_NO =?";
           //  Class.forName("com.mysql.jdbc.Driver");
            //Connection con=DriverManager.getConnection("jdbc:mysql://localhost/multiuserlogin","root","shraddhha"); 
             Connection  con=DriverManager.getConnection("jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            //String sql="delete from newaccount where ACC_NO=?";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,ACC_NO.getText());

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "deleted successfull");

            con.close();
        }
        /**
        * @param args the command line arguments
        */
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
         update_table();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */  
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   
        //</editor-fold>
       public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACC_NO;
    private javax.swing.JTextField ACC_TYPE;
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JTextField ADHAR_NO;
    private javax.swing.JTextField BALANCE;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField GENDER;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PAN_NO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
