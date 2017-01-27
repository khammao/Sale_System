

package Forms;

import static Forms.ChangeLanguage.LangType;
import static Forms.ChangeLanguage.getLabel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JDialog {
//    Connection c = ConnectDB.getConnection();
    public static boolean login;
    public static String user_name;
    static String permission;
    String sql;
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(RadLao);
        bg.add(RadEng);
    }
    public frmLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        initComponents();
        groupButton();
        txtEmail.requestFocus();
        // Create text hint 
        txtEmail.setToolTipText("<html><b><font color=red>"+"example@address.com"+ "</font></b></html>");
        txtPass.setToolTipText("<html><b><font color=red>"+ "Your Password" + "</font></b></html>");
        txtStatus.setEnabled(false);
        // Set textbox Enter
        txtEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPass.requestFocusInWindow();    
            }
        }); 
        
        txtPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Permission();
                btnLogin.requestFocusInWindow();    
            }
        });    
    }
        //   @Override
    public void Permission(){
        try {
            Connection c = ConnectDB.getConnection();
              sql="Select UserStatus from UserLogin where UserName = '"+ txtEmail.getText() +"' and UserPassword = '"+ txtPass.getText()+"'";
                ResultSet rs = c.createStatement().executeQuery(sql);
                if (rs.next()){
                    txtStatus.setText(rs.getString("UserStatus"));
                    frmLogin.permission = rs.getString("UserStatus");
                 }
        } catch (Exception e) {
        }
    }
    public void Login(){
        try {
            Connection c = ConnectDB.getConnection();
            sql="Select UserName, UserPassword from UserLogin where UserName = '"+ txtEmail.getText() +"' and UserPassword = '"+ txtPass.getText()+"'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                frmLogin.login = true;
                frmLogin.user_name = rs.getString("UserName");
                //frmLogin.permission = rs.getString("UserStatus");
                dispose();
                frmMainmenu m = new frmMainmenu();
                m.setVisible(true);  
                
             }else{
                int type = JOptionPane.WARNING_MESSAGE;
                String msg = "User and password incorrect";
                String t = "Message.... ຂໍ້ຄວາມ";
                JOptionPane.showMessageDialog(this, msg, t,type);
                txtEmail.setText("");
                txtPass.setText("");
                txtEmail.requestFocus();
            }
        } catch (Exception e) {}
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lb_Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Lb_Pass = new javax.swing.JLabel();
        Lb_Permission = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        RadLao = new javax.swing.JRadioButton();
        RadEng = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 4, true));

        Lb_Email.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Email.setText("ອີເມວ:");

        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Pass.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Pass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Pass.setText("ລະຫັດຜ່ານ:");

        Lb_Permission.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Permission.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Permission.setText("ສິດທີໃຊ້ງານ:");

        txtStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sso-icon.png"))); // NOI18N
        btnLogin.setText("ເຂົ້າລະບົບ");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/x-mark-256.png"))); // NOI18N
        btnExit.setText("ຍົກເລີກ");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPassMouseEntered(evt);
            }
        });

        RadLao.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadLao.setText("Lao");
        RadLao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RadLao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadLaoActionPerformed(evt);
            }
        });

        RadEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadEng.setText("English");
        RadEng.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RadEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadEngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadLao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadEng))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Permission, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadLao)
                    .addComponent(RadEng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Pass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Permission)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
//        int reply= JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Close?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//        if(reply == JOptionPane.YES_OPTION){
//            System.exit(0);
//        }
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        Permission();
        if(txtStatus.getText().equals("")){
             int type = JOptionPane.WARNING_MESSAGE;
             String msg = "Plese check Permission";
             String t = "Message.... ຂໍ້ຄວາມ";
             JOptionPane.showMessageDialog(this, msg, t,type);
        }else{
            Login();
               // LangType = LangType;
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseEntered
         
    }//GEN-LAST:event_txtPassMouseEntered

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtStatus.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String msg = "Plese check Permission";
                String t = "Message.... ຂໍ້ຄວາມ";
                JOptionPane.showMessageDialog(this, msg, t,type);
            }else{
                Login();
            }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void RadLaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadLaoActionPerformed
       showLang();
      // LangType="Lao";
    }//GEN-LAST:event_RadLaoActionPerformed

    private void RadEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadEngActionPerformed
       showLang();
      // LangType="Eng";
    }//GEN-LAST:event_RadEngActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      // Show Label Languages
        RadLao.setSelected(true);
        LangType="Lao";
    }//GEN-LAST:event_formWindowOpened
public void showLang(){
         try {
             if(RadLao.isSelected()==true){
                LangType="Lao";
             }else {
                LangType="Eng";
             }
             RadLao.setText(getLabel("RadLao"));
             RadEng.setText(getLabel("RadEng"));
             Lb_Email.setText(getLabel("Lb_Email"));
             Lb_Pass.setText(getLabel("Lb_Pass"));
             Lb_Permission.setText(getLabel("Lb_Permission"));
             btnLogin.setText(getLabel("btnLogin"));
             btnExit.setText(getLabel("btnExit"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin dialog = new frmLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_Email;
    private javax.swing.JLabel Lb_Pass;
    private javax.swing.JLabel Lb_Permission;
    public javax.swing.JRadioButton RadEng;
    public javax.swing.JRadioButton RadLao;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
