package dashinternal;

import config.dbconnector;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author ellan
 */
public class accountpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form accountpage
     */
    public accountpage() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
    }

    public  ImageIcon ResizeImage(String ImagePath, byte[] pic) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(ppshow.getWidth(), ppshow.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public byte[] imageBytes;
    String path;
    String filename = null;
    String imgPath = null;
    byte[] person_image = null;

    Color enter = new Color(136, 8, 8);
    Color exit = new Color(74, 4, 4);
    Color plate = new Color(100, 4, 4);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changepp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ppshow = new javax.swing.JLabel();
        cahngepp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        savepp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadpp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changepp.setBackground(new java.awt.Color(157, 1, 27));
        changepp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        changepp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account Settings");
        changepp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Name: ");
        changepp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Email: ");
        changepp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Postion: ");
        changepp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Address: ");
        changepp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contact: ");
        changepp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ryle Aaron Delicano");
        changepp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("rylearonundead@gmail.com");
        changepp.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Administrator");
        changepp.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Vito Minglanilla, Cebu");
        changepp.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("09123654585");
        changepp.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        ppshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Duck Twerk GIFs _ Tenor.gif"))); // NOI18N
        changepp.add(ppshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        cahngepp.setBackground(new java.awt.Color(255, 204, 51));
        cahngepp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cahngeppMouseClicked(evt);
            }
        });
        cahngepp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Change Avatar");
        cahngepp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        changepp.add(cahngepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 110, 30));

        savepp.setBackground(new java.awt.Color(255, 204, 51));
        savepp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveppMouseClicked(evt);
            }
        });
        savepp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Save");
        savepp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        changepp.add(savepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 110, 30));

        loadpp.setBackground(new java.awt.Color(255, 204, 51));
        loadpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadppMouseClicked(evt);
            }
        });
        loadpp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Load");
        loadpp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        changepp.add(loadpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 110, 30));

        getContentPane().add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cahngeppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cahngeppMouseClicked
      JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            ppshow.setIcon(ResizeImage(path,null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
        }else{
        JOptionPane.showMessageDialog(null, "Canceled !");
        }
        
      
        try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                
                for (int readNum; (readNum=fis.read(buf)) !=-1;){
                 bos.write(buf,0,readNum);
                }
                person_image=bos.toByteArray();
                
        }catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_cahngeppMouseClicked

    private void saveppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveppMouseClicked
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restotracker", "root", "");
            String sql = "INSERT INTO tbl_avatar (name, picture) VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, filename);
            pst.setBytes(2,person_image);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_saveppMouseClicked

    private void loadppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadppMouseClicked
        try{
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getdata("SELECT * FROM picture WHERE name = 1");
            if(rs.next()){
                ppshow.setIcon(ResizeImage(null, rs.getBytes("picture")));
                
            }
            
}catch(Exception e){

}
    }//GEN-LAST:event_loadppMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cahngepp;
    private javax.swing.JPanel changepp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel loadpp;
    private javax.swing.JLabel ppshow;
    private javax.swing.JPanel savepp;
    // End of variables declaration//GEN-END:variables
}
