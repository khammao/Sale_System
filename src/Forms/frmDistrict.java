
package Forms;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmDistrict extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    ResultSet rs1;
    ArrayList pv = new ArrayList();
    public frmDistrict() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDistrict = new javax.swing.JTextField();
        dtcUpdate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbProvince = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("ເມືອງ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(83, 157, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save_37110.png"))); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/remove-icon-png-26.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnFirst.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-arrow-icon-94826.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btnFirst);

        btnPrevious.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-page-arrow-icon-94883.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrevious);

        btnNext.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);

        btnLast.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next-arrow-icon-94826.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel2.add(btnLast);

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setText("ລຳດັບ:");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setText("ເມືອງ:");

        txtDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        dtcUpdate.setDateFormatString("yyyy-MM-dd");

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setText("ວັນທີ່ປັບປຸງ:");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ຜູ້ປັບປຸງ:");

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setText("ແຂວງ:");

        cmbProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbProvince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProvinceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistrict)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(cmbProvince, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 169, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void DisableEditeText(){
        txtDistrict.setEditable(false);
        txtUser.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor.setEditable(false);
    } 
    public void EnableEditeText(){
        txtID.setText("Auto");
        txtDistrict.setEditable(true);
        txtUser.setEditable(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor.setEditable(true);
    } 
    public void ClearText(){
        txtID.setText("Auto");
        txtDistrict.setText("");
        Date date = new Date();
        dtcUpdate.setDate(date);
        txtUser.setText("");
    }
    public void fetchResultSet()
    {
      try {
        
        String query = "select * from vw_District";
        //rs1 = con.createStatement().executeQuery(query);
          Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
          ResultSet.CONCUR_UPDATABLE);
          rs1 = st.executeQuery(query);
      }catch(Exception ex){}
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        EnableEditeText();
        ClearText();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            if(txtID.getText().equals("Auto")){
                if(txtDistrict.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int P1 =cmbProvince.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to Save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date =(String) df.format(dtcUpdate.getDate());
                    sql="Insert into Districts(DistName,ProvID,Updates,Createby) values(?,?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtDistrict.getText());
                    p.setString(2,pv.get(P1).toString());
                    p.setString(3,date);
                    p.setString(4,txtUser.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }else{
                if(txtDistrict.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int P1 =cmbProvince.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to edit?","edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date =(String) df.format(dtcUpdate.getDate());
                    sql="Update Districts set DistName=?,ProvID=?,Updates=?,Createby=? where DistID=?";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtDistrict.getText());
                    p.setString(2,pv.get(P1).toString());
                    p.setString(3,date);
                    p.setString(4,txtUser.getText());
                    p.setString(5,txtID.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            if(txtDistrict.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check you data again.";
                String b = "Message";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                sql="Delete from Districts where DistID=?";
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1,txtID.getText());
                if(p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished";
                    String b = "Message";
                    JOptionPane.showMessageDialog(null,a, b,type);
                }
                ClearText();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try
        {
            if (rs1 == null)
            {
                fetchResultSet();
            }
            if (rs1!=null)
            {
                if (rs1.first())
                {
                    txtID.setText(rs1.getString("DistID"));
                    txtDistrict.setText(rs1.getString("DistName"));
                    cmbProvince.setSelectedItem(rs1.getString("ProvName"));
                    dtcUpdate.setDate(rs1.getDate("Updates"));
                    txtUser.setText(rs1.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rs1.next( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try
        {
            if (rs1 == null)
            {
                fetchResultSet();
            }
            if (rs1!=null)
            {
                if (rs1.previous())
                {
                    txtID.setText(rs1.getString("DistID"));
                    txtDistrict.setText(rs1.getString("DistName"));
                    cmbProvince.setSelectedItem(rs1.getString("ProvName"));
                    dtcUpdate.setDate(rs1.getDate("Updates"));
                    txtUser.setText(rs1.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rs1.next( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try
        {
            if (rs1 == null)
            {
                fetchResultSet();
            }
            if (rs1!=null)
            {
                if (rs1.next())
                {
                    txtID.setText(rs1.getString("DistID"));
                    txtDistrict.setText(rs1.getString("DistName"));
                    cmbProvince.setSelectedItem(rs1.getString("ProvName"));
                    dtcUpdate.setDate(rs1.getDate("Updates"));
                    txtUser.setText(rs1.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rs1.previous( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try
        {
            if (rs1 == null)
            {
                fetchResultSet();
            }
            if (rs1!=null)
            {
                if (rs1.last())
                {
                   txtID.setText(rs1.getString("DistID"));
                    txtDistrict.setText(rs1.getString("DistName"));
                    cmbProvince.setSelectedItem(rs1.getString("ProvName"));
                    dtcUpdate.setDate(rs1.getDate("Updates"));
                    txtUser.setText(rs1.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rs1.previous();
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnLastActionPerformed

    private void cmbProvinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinceMouseClicked
        //ShowProvince();
    }//GEN-LAST:event_cmbProvinceMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtID.setEnabled(false);
        ShowProvince();
        DisableEditeText();
    }//GEN-LAST:event_formInternalFrameOpened
    public void ShowProvince(){
        try{
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select ProvID, ProvName from Provinces";
            mode.removeAllElements();
            pv.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                pv.add(rs.getString("ProvID"));
                mode.addElement(rs.getString("ProvName"));
            }
             cmbProvince.setModel(mode);
        }catch(Exception e){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbProvince;
    private com.toedter.calendar.JDateChooser dtcUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
