
package Forms;

import static Forms.fetchResultSet.rsAll;
import com.placeholder.PlaceHolder;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVillage extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    ResultSet rs1;
    ArrayList PV = new ArrayList();
    ArrayList DT = new ArrayList();
    public frmVillage() {
        initComponents();
        fetchResultSet.Tables="vw_Villages";
        PlaceHolder txt1 = new PlaceHolder(txtSearch,"Please! enter Village ID");
    }
    public void DisableEditeText(){
        txtVillage.setEditable(false);
        cmbDistrict.setSelectedItem(false);
        cmbProvince.setSelectedItem(false);
        txtUser.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor.setEditable(false);
    }
    public void EnableEditeText(){
        txtVillage.setEditable(true);
        cmbDistrict.setSelectedItem(true);
        cmbProvince.setSelectedItem(true);
        txtUser.setEditable(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor.setEditable(true);
    } 
    public void ClearText(){
        txtID.setText("Auto");
        txtVillage.setText("");
        //cmbDistrict.setSelectedIndex(0);
        //cmbProvince.setSelectedIndex(0);
        txtUser.setText("");
        Date date = new Date();
        dtcUpdate.setDate(date);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVillage = new javax.swing.JTextField();
        cmbProvince = new javax.swing.JComboBox();
        cmbDistrict = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dtcUpdate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save_37110.png"))); // NOI18N
        btnSave.setText("ບັກທຶກ");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_Icon-300x241.png"))); // NOI18N
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

        jButton1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next-arrow-icon-94826.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setText("ລຳດັບ:");

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setText("ແຂວງ:");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setText("ເມືອງ:");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ຊື່ບ້ານ:");

        txtVillage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        cmbProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinceActionPerformed(evt);
            }
        });

        cmbDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 2));

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setText("ຄົ້ນຫາ:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setText("ວັນທີ່ປັບປຸງ:");

        dtcUpdate.setDateFormatString("yyyy-MM-dd");

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setText("ຜູ້ປັບປຸງ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVillage)
                    .addComponent(cmbProvince, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser)
                    .addComponent(dtcUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVillage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(dtcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtID.setText("Auto");
        txtID.setEnabled(false);
        DisableEditeText();
        Date date = new Date();
        dtcUpdate.setDate(date);
        ShowProvince();
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        EnableEditeText();
        ClearText();
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinceActionPerformed
       ShowDistrict();
    }//GEN-LAST:event_cmbProvinceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if(txtID.getText().equals("Auto")){
                if(txtID.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int D1 =cmbDistrict.getSelectedIndex();
                int P1 =cmbProvince.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to Save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date =(String) df.format(dtcUpdate.getDate());
                    sql="Insert into Villages(Village,DistID,ProvID,Updates,Createby) values(?,?,?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtVillage.getText());
                    p.setString(2,DT.get(D1).toString());
                    p.setString(3,PV.get(P1).toString());
                    p.setString(4,date);
                    p.setString(5,txtUser.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }else{
                if(txtVillage.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int D1 =cmbDistrict.getSelectedIndex();
                int P1 =cmbProvince.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to edit?","edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date =(String) df.format(dtcUpdate.getDate());
                    sql="Update Villages set Village=?,DistID=?,ProvID=?,Updates=?,Createby=? where VID=?";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtVillage.getText());
                    p.setString(2,DT.get(D1).toString());
                    p.setString(3,PV.get(P1).toString());
                    p.setString(4,date);
                    p.setString(5,txtUser.getText());
                    p.setString(6,txtID.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       SearchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtVillage.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check you data again.";
                String b = "Message";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                sql="Delete from Villages where VID=?";
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
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
                    txtID.setText(rsAll.getString("VID"));
                    txtVillage.setText(rsAll.getString("Village"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    dtcUpdate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Createby"));
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

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
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
                    txtID.setText(rsAll.getString("VID"));
                    txtVillage.setText(rsAll.getString("Village"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    dtcUpdate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.next( );
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                    txtID.setText(rsAll.getString("VID"));
                    txtVillage.setText(rsAll.getString("Village"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    dtcUpdate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.previous();
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
                    txtID.setText(rsAll.getString("VID"));
                    txtVillage.setText(rsAll.getString("Village"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    dtcUpdate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("Createby"));
                }
                else
                {
                    //rs1 = null;
                    rsAll.previous();
                    JOptionPane.showMessageDialog(this,"End of File");
                }
            }
        }catch(Exception ex){System.out.println(ex);}
    }//GEN-LAST:event_jButton2ActionPerformed
    public void SearchData(){
        try{
            sql="Select * from vw_FilterVillages where VID="+ txtSearch.getText() +"";
            ResultSet rs = con.createStatement().executeQuery(sql);
            if(rs.next()){
                String ID = rs.getString("VID");
                txtID.setText(ID);
                String Vill = rs.getString("Village");
                txtVillage.setText(Vill);
                String PID = rs.getString("ProvName");
                cmbProvince.setSelectedItem(PID);
                String DID = rs.getString("DistName");
                cmbDistrict.setSelectedItem(DID);
                
                dtcUpdate.setDate(rs.getDate("Updates"));
                String user = rs.getString("Createby");
                txtUser.setText(user);
            }
        }catch(Exception e){}
    }
    public void ShowProvince(){
        try{
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select ProvID, ProvName from Provinces";
            mode.removeAllElements();
            PV.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                PV.add(rs.getString("ProvID"));
                mode.addElement(rs.getString("ProvName"));
            }
             cmbProvince.setModel(mode);
        }catch(Exception e){}
    }
    public void ShowDistrict(){
        try{
           int dc =cmbProvince.getSelectedIndex();
            DefaultComboBoxModel md = new DefaultComboBoxModel();
            sql="SELECT dbo.Districts.DistID, dbo.Districts.DistName\n" +
            "FROM  dbo.Districts INNER JOIN\n" +
            " dbo.Provinces ON dbo.Districts.ProvID = dbo.Provinces.ProvID\n" +
            "WHERE (dbo.Districts.ProvID ="+ PV.get(dc) +" )";
            md.removeAllElements();
            DT.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                DT.add(rs.getString("DistID"));
                md.addElement(rs.getString("DistName"));
            }
             cmbDistrict.setModel(md);
        }catch(Exception e){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbDistrict;
    private javax.swing.JComboBox cmbProvince;
    private com.toedter.calendar.JDateChooser dtcUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtVillage;
    // End of variables declaration//GEN-END:variables
}
