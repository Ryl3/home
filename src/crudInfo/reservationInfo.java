/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudInfo;

import config.dbconnector;
import dashinternal.reservepage;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import restoframes.dashboard;

/**
 *
 * @author ellan
 */
public class reservationInfo extends javax.swing.JFrame {

    /**
     * Creates new form clientInfo
     */
    public reservationInfo() {
        initComponents();
    }
    
    public void close(){
        this.dispose();
        dashboard dash = new dashboard();
        dash.setVisible(true);
        reservepage cp = new reservepage();
        dash.dashboardpane.add(cp).setVisible(true);
   }
    
    int validateregister(){
            int result;
            if(status.getText().isEmpty() || type.getSelectedItem().equals(null) || desc.getText().isEmpty() || payrate.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Required Inputs!");
                result = 0;
            }else{
                result = 1;
            }
                return result;
        }

    
        Color o  = new Color(255,51,51);
        Color ten = new Color(255,102,102);
        
        public String action;  
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        payrate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        resid = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        cusid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        Azzaz = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        desc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        close = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        minimize = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel2.setText("Reservation Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        payrate.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        payrate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(payrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 270, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("Reservation ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel8.setText("Payrate");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        resid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        resid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(resid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 270, 30));

        userid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, 30));

        cusid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        cusid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(cusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 270, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel9.setText("User ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        add.setBackground(new java.awt.Color(255, 102, 102));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Azzaz.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        Azzaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Azzaz.setText("Azzaz");
        add.add(Azzaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 140, 50));

        type.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alone", "Couple", "Family", "Social Gathering" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 270, 30));

        desc.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 270, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("Customer ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        status.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 270, 30));

        close.setBackground(new java.awt.Color(255, 102, 102));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        close.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 10));

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 30));

        minimize.setBackground(new java.awt.Color(255, 102, 102));
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("—");
        minimize.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 10));

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(action.equals("Add")){
            
        int check = validateregister(); 
        if(check == 1){
            dbconnector dbc = new dbconnector();
           int result = dbc.insertdata("INSERT INTO tbl_reserve(res_id, us_id, c_id) VALUES ('"+resid.getText()+"', '"+userid.getText()+"', '"+cusid.getText()+"')");
           if(result==1){
                  JOptionPane.showMessageDialog(null, "Successfully Saved!");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "Successfully Failed!");
              }
            }else{
                  
              }
        
       }else if(action.equals("Edit")){
           dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_reserve SET WHERE res_id = '"+resid.getText()+"', us_id = '"+userid.getText()+"',"
                                            + " c_id = '"+cusid.getText()+"',   ");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "No Actions Performed!");
                close();
       }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(o);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(ten);
    }//GEN-LAST:event_addMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        reservepage cp = new reservepage();
        this.dispose();
        cp.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(o);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(ten);
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(o);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(ten);
    }//GEN-LAST:event_minimizeMouseExited

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
            java.util.logging.Logger.getLogger(reservationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservationInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Azzaz;
    private javax.swing.JPanel add;
    private javax.swing.JPanel close;
    public javax.swing.JTextField cusid;
    public javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel minimize;
    public javax.swing.JTextField payrate;
    public javax.swing.JTextField resid;
    public javax.swing.JTextField status;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
