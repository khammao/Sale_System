

package Forms;

import static Forms.fetchResultSet.Tables;
import static Forms.fetchResultSet.rsAll;
import com.placeholder.PlaceHolder;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frmStore extends javax.swing.JInternalFrame {
    Connection conn = ConnectDB.getConnection();
    String sql;
    
    public frmStore() {
        initComponents();
        DisableEditText();
        Tables = "Stores";
        PlaceHolder txt1 = new PlaceHolder(txtSearch,"Please! enter Store name");
    }
    public void DisableEditText(){
        try {
            txtID.setEditable(false);
            txtStore.setEditable(false);
            txtStoreEn.setEditable(false);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcDate.getDateEditor();
            editor.setEditable(false);
            txtUser.setEditable(false);
        } catch (Exception e) {
        }
    }
    public void EnableEditText(){
        try {
            txtStore.setEditable(true);
            txtStoreEn.setEditable(true);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcDate.getDateEditor();
            editor.setEditable(true);
            txtUser.setEditable(true);
        } catch (Exception e) {
        }
    }
    public void ClearText(){
        try {
            txtID.setText("Auto");
            txtStore.setText("");
            txtStoreEn.setText("");
            dtcDate.setDate(null);
            
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnProvious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStore = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        dtcDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtStoreEn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnNew.setText("ເພີ່ມ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnNew);

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
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
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

        btnProvious.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnProvious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-page-arrow-icon-94883.png"))); // NOI18N
        btnProvious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProviousActionPerformed(evt);
            }
        });
        jPanel2.add(btnProvious);

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

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ລຳດັບ:");

        txtStore.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ຮ້ານ(ລາວ):");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ວັນທີ່ປັບປຸງ:");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ຜູ້ໃຊ້ງານ:");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        dtcDate.setDateFormatString("yyyy-MM-dd");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        txtStoreEn.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ຮ້ານ(ອັງກິດ):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dtcDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtStore, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStoreEn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStoreEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        EnableEditText();
        ClearText();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if(txtID.getText().equals("Auto")){
                if(txtID.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    return;
                }
                if(JOptionPane.showConfirmDialog(null,"Do you like to Save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtcDate.getDate());
                    sql="Insert into Stores (SName,SNameEn,Updates,Users) values(?,?,?,?)";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, txtStore.getText());
                    p.setString(2, txtStoreEn.getText());
                    p.setString(3, date);
                    p.setString(4, txtUser.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }else{
                if(txtStore.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    return;
                }
                if(JOptionPane.showConfirmDialog(null,"Do you like to edit?","edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtcDate.getDate());
                    sql="Update Stores set SName=?,SNameEn=?,Updates=?,Users=? where SID=?";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, txtStore.getText());
                    p.setString(2, txtStoreEn.getText());
                    p.setString(3, date);
                    p.setString(4, txtUser.getText());
                    p.setString(5, txtID.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Edit";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
            if(txtID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please check your data again";
                String b = "Message";
                JOptionPane.showMessageDialog(null,a, b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                sql="Delete from Stores where SID=?";
                PreparedStatement p = conn.prepareStatement(sql);
                p.setString(1,txtID.getText());
                if(p.executeUpdate()!=-1){
                   int type = JOptionPane.OK_OPTION;
                   String a = "Finished";
                   String b = "Message";
                   JOptionPane.showMessageDialog(null,a, b,type);
                }
                ClearText();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try
        {
            if (rsAll == null)
            {
                fetchResultSet.fatchR();
            }
            if (rsAll!=null)
            {
                if (rsAll.first())
                {
                    txtID.setText(rsAll.getString("SID"));
                    txtStore.setText(rsAll.getString("SName"));
                    txtStoreEn.setText(rsAll.getString("SNameEn"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Users"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.next( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnProviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviousActionPerformed
        try
        {
            if (rsAll == null)
            {
                fetchResultSet.fatchR();
            }
            if (rsAll!=null)
            {
                if (rsAll.previous())
                {
                    txtID.setText(rsAll.getString("SID"));
                    txtStore.setText(rsAll.getString("SName"));
                    txtStoreEn.setText(rsAll.getString("SNameEn"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Users"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.next( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnProviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try
        {
            if (rsAll == null)
            {
                fetchResultSet.fatchR();
            }
            if (rsAll!=null)
            {
                if (rsAll.next())
                {
                    txtID.setText(rsAll.getString("SID"));
                    txtStore.setText(rsAll.getString("SName"));
                    txtStoreEn.setText(rsAll.getString("SNameEn"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Users"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.previous();
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try
        {
            if (rsAll == null)
            {
                fetchResultSet.fatchR();
            }
            if (rsAll!=null)
            {
                if (rsAll.last())
                {
                    txtID.setText(rsAll.getString("SID"));
                    txtStore.setText(rsAll.getString("SName"));
                    txtStoreEn.setText(rsAll.getString("SNameEn"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Users"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.previous();
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnLastActionPerformed
    public void SearchData(){
        try {
            sql="Select * from Stores where SName=N'"+ txtSearch.getText() +"' or SNameEn=N'"+ txtSearch.getText() +"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                String ID = rs.getString("SID");
                txtID.setText(ID);
                String Sname = rs.getString("SName");
                txtStore.setText(Sname);
                String SnameEn = rs.getString("SNameEn");
                txtStoreEn.setText(SnameEn);
                dtcDate.setDate(rs.getDate("Updates"));
                String user = rs.getString("Users");
                txtUser.setText(user);
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnProvious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser dtcDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStore;
    private javax.swing.JTextField txtStoreEn;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
