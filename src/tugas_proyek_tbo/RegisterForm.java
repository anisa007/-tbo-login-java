
package tugas_proyek_tbo;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.sql.*;



/**
 *
 * @author anisa
 */
public class RegisterForm extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TombolDaftar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabelRegister = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        GenPass = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(793, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imagesLogin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA DEPAN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 34));

        TombolDaftar.setBackground(new java.awt.Color(255, 153, 153));
        TombolDaftar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TombolDaftar.setForeground(new java.awt.Color(153, 153, 153));
        TombolDaftar.setText("SIGN UP");
        TombolDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(TombolDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 207, 37));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sudah mempunyai akun?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        LabelRegister.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        LabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegister.setText("LOGIN DISINI");
        LabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(LabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 178, 20));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAMA BELAKANG");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 34));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("USERNAME");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EMAIL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 34));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PASSWORD");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 34));

        GenPass.setBackground(new java.awt.Color(255, 153, 153));
        GenPass.setForeground(new java.awt.Color(153, 153, 153));
        GenPass.setText("GENERATE");
        GenPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenPassActionPerformed(evt);
            }
        });
        jPanel1.add(GenPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 153, 153));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 140, 20));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 420, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void TombolDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDaftarActionPerformed
        // TODO add your handling code here:
        //pass.setEditable(false);
        if(fname.getText().length() == 0 || lname.getText().length() == 0 || username.getText().length() == 0 || email.getText().length() == 0){
             JOptionPane.showMessageDialog(this, "Masih ada kotak yang belum diisi.");
        //Regex untuk nama depan
        }else if(!fname.getText().matches("^[a-zA-Z]*$")){
            JOptionPane.showMessageDialog(this, "Nama Yang Anda masukan tidak Valid");   
        //Regex untuk nama belakang
        }else if(!lname.getText().matches("^[a-zA-Z]*$")){
            JOptionPane.showMessageDialog(this, "Nama Yang Anda masukan tidak Valid");   
        //Regex untuk email 
        }else if(!email.getText().matches("[A-za-z]+[0-9]*@[A-za-z]+\\.[A-Za-z]+")){
            JOptionPane.showMessageDialog(this, "Kombinasi email yang Anda masukkan salah. ");
        //Regex untuk username
        }else if(!username.getText().matches("^[a-zA-Z0-9]*$")){
            JOptionPane.showMessageDialog(this, "Username Yang Anda masukan tidak Valid");
        }else{   
            try{
            Statement statement = (Statement) KoneksiDatabase.GetConnection().createStatement();
                
                try {
                ResultSet result= statement.executeQuery("select * from tbo where username = '"+username.getText()+"'");
                    if (result.next()){
                        RekomendasiUsername rek = new RekomendasiUsername();
                        rek.setUsername(fname.getText(), lname.getText());
                        rek.setVisible(true);
                        rek.setLocationRelativeTo(null);
                        rek.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
                        this.dispose();
                    }else{
                         
            statement.executeUpdate("insert into tbo VALUES ('" + fname.getText() +"','"+ lname.getText()+"','"+ username.getText() +"','"+  email.getText() +"','" + pass.getText() + "');");
            statement.close ();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
                   new LoginForm().show();
                    this.dispose();
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(rootPane, "gagal");
                }         
            }catch (Exception t){
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
            }
        }
    }//GEN-LAST:event_TombolDaftarActionPerformed
    
    public void setTextFieldPass(){
        pass.setEditable(false);
    }
    
    public static boolean CekLogin(String nama, String kataSandi){
        for(int i = 0; i < userArr.size(); i++) {
            if(nama.equals(userArr.get(i)) && kataSandi.equals(passArr.get(i))){
                return true;
            }
        }
        return false;
    }
    
    private void LabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegisterMouseClicked
        // TODO add your handling code here:
      
        LoginForm reg = new LoginForm();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LabelRegisterMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void GenPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenPassActionPerformed
        // TODO add your handling code here:
        Random ran = new Random();
            
            // panjang password generated yang random
            int genLength = ran.nextInt((12-8)+1) + 8;
            //
            boolean[] kondisi = {true,false};
        
            boolean cek = kondisi[ran.nextInt(2)];
            //untuk menyimpan satu angka/huruf generated password
            char[] hasilArr = new char[genLength];
            //
            String hasil = "";
            //
            for(int i = 0; i < genLength;i++){
            hasilArr[i] = (char)(ran.nextInt((57-48)+1) + 48);   
            }
            // true = ada penambahan huruf, false = tidak ada huruf
             if(cek)
                for(int i = 0; i < genLength;i++)
                  hasilArr[ran.nextInt(genLength)] = (char)(kondisi[ran.nextInt(2)] ? ran.nextInt((90-65)+1) + 65 : ran.nextInt((122-97)+1) + 97); 
            
            for(int i = 0; i < genLength;i++){
            hasil += "" + hasilArr[i];   
            
            }     
        pass.setText(hasil);   
    }//GEN-LAST:event_GenPassActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
            if (jCheckBox1.isSelected()) {
            pass.setEchoChar((char)0); //password = JPasswordField
            } else {
           pass.setEchoChar('*');
            }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
        
        /* Create and display the form */
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    public static ArrayList<String> fnameArr = new ArrayList<String>();
    public static ArrayList<String> lnameArr = new ArrayList<String>();
    public static ArrayList<String> userArr = new ArrayList<String>();
    public static ArrayList<String> emailArr = new ArrayList<String>();
    public static ArrayList<String> passArr = new ArrayList<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenPass;
    private javax.swing.JLabel LabelRegister;
    private javax.swing.JButton TombolDaftar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}




