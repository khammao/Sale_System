
package Forms;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCategory extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    ArrayList gp =new ArrayList();
    public frmCategory() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        dtpDate = new com.toedter.calendar.JDateChooser();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbGroup = new javax.swing.JComboBox();
        txtCategory = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnAdd.setText("ເພີ່ມໃໝ່");
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd);

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save_37110.png"))); // NOI18N
        btnSave.setText("ບັນທືກ");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setText("ລຳດັບ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setText("ື່ກຸ່ມສິນຄ້າ:");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setText("ວັນທີປັບປຸງ:");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ຜູ້ປັບປຸງ:");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        dtpDate.setDateFormatString("yyyy-MM-dd");
        dtpDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setText("ຊື່ປະເພດ:");

        cmbGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbGroupMouseClicked(evt);
            }
        });
        cmbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGroupActionPerformed(evt);
            }
        });

        txtCategory.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCategory)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel3.setBackground(new java.awt.Color(83, 157, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102), 2));

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setText("ຄົ້ນຫາຂໍ້ມູນ:");

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setText("ໃຫ້ປ້ອນ ລຳດັບ ຫຼື ຊື່ຂອງກຸ່ມ");

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel8.setText("ຕົວຢ່າງການໃນຄົ້ນຫາ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ລຳດັບ", "ປະເພດ", "ກຸ່ມສິນຄ້າ", "ວັນທີ່ປັບປຸງ", "ຜູ້ປັບປຸງ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         ClearText();
         EnableEditText();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            if(txtID.getText().equals("Auto")){
                if(txtCategory.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please check your data again.";
                String b = "Error";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
                }
                int Cat =cmbGroup.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you live to save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="insert into Categorys(GroupID,CatName,Updates,CreateBy)values(?,?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,gp.get(Cat).toString());
                    p.setString(2,txtCategory.getText());
                    p.setString(3,date);
                    p.setString(4,txtUser.getText());
                    if(p.executeUpdate()!= -1){
                        int type=JOptionPane.OK_OPTION;
                        String a="Finished";
                        String b ="message";
                        JOptionPane.showMessageDialog(null,a,b,type);
                    }
                    ClearText();
                    ShowData();
                }
            }else{
                if(txtCategory.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int Cat =cmbGroup.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you want to edit?","Edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="Update Categorys set GroupID=?,CatName=?,Updates=?,CreateBy=? where CatID=?";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,gp.get(Cat).toString());
                    p.setString(2,txtCategory.getText());
                    p.setString(3,date);
                    p.setString(4,txtUser.getText());
                    p.setString(5,txtID.getText());
                    if(p.executeUpdate()!= -1){
                        int type=JOptionPane.OK_OPTION;
                        String a="Finished";
                        String b ="message";
                        JOptionPane.showMessageDialog(null,a,b,type);
                    }
                    ClearText();
                    ShowData();
                }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            if(txtID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Please select data you want to delete.";
                String b = "Message";
                JOptionPane.showConfirmDialog(null,a, b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you want to delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                sql="Delete from Categorys where CatID=?";
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1,txtID.getText());
                if(p.executeUpdate()!=-1){
                   int type = JOptionPane.WARNING_MESSAGE;
                   String a = "Finished";
                   String b = "Message";
                   JOptionPane.showMessageDialog(null,a, b,type);
                }
                ClearText();
                ShowData();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_btnDeleteActionPerformed
    public void FilterData(){
        try{
            int index = jTable1.getRowCount()-1;
            while(index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.Categorys.CatID, dbo.Categorys.CatName, dbo.Groups.GroupName, dbo.Categorys.Updates, dbo.Categorys.CreateBy\n" +
                "FROM dbo.Groups INNER JOIN\n" +
                " dbo.Categorys ON dbo.Groups.GroupID = dbo.Categorys.GroupID where CatID = '"+ txtSearch.getText()+"' or CatName like N'%"+ txtSearch.getText()+"%'";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CatID"));
                v.add(rs.getString("CatName"));
                v.add(rs.getString("GroupName"));
                v.add(rs.getString("Updates"));
                v.add(rs.getString("CreateBy"));
                model.addRow(v);
            }
             jTable1.setModel(model);
        }catch(Exception e){}
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try{
          FilterData();
        }catch(Exception e){}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbGroupMouseClicked
       ShowGroup();
    }//GEN-LAST:event_cmbGroupMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DisableEditText();
        Date date = new Date();
        dtpDate.setDate(date);
        ShowData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGroupActionPerformed
    
    }//GEN-LAST:event_cmbGroupActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
       {
           if(evt.getClickCount()==1)
           {
               int index=jTable1.getSelectedRow();
               String ID=jTable1.getValueAt(index, 0).toString();
               String cat=jTable1.getValueAt(index, 1).toString();
               String gp=jTable1.getValueAt(index, 2).toString();
              // String dt=jTable1.getValueAt(index, 2).toString();
               String User=jTable1.getValueAt(index, 4).toString();
               txtID.setText(ID);
               cmbGroup.setSelectedItem(gp);
               txtCategory.setText(cat);
              // dtpDate.setDateFormatString(dt);
               txtUser.setText(User);
           }
       }catch(Exception e)
       {
           
       }
    }//GEN-LAST:event_jTable1MouseClicked
    public void ShowData(){
        try{
            int index = jTable1.getRowCount()-1;
            while(index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.Categorys.CatID, dbo.Categorys.CatName, dbo.Groups.GroupName, dbo.Categorys.Updates, dbo.Categorys.CreateBy\n" +
                "FROM dbo.Groups INNER JOIN\n" +
                " dbo.Categorys ON dbo.Groups.GroupID = dbo.Categorys.GroupID";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CatID"));
                v.add(rs.getString("CatName"));
                v.add(rs.getString("GroupName"));
                v.add(rs.getString("Updates"));
                v.add(rs.getString("CreateBy"));
                 model.addRow(v);
            }
        }catch(Exception e){}
          jTable1.setModel(model);
    }
    public void ShowGroup(){
        try{
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select GroupID, GroupName from Groups";
            mode.removeAllElements();
            gp.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                gp.add(rs.getString("GroupID"));
                mode.addElement(rs.getString("GroupName"));
            }
             cmbGroup.setModel(mode);
        }catch(Exception e){}
    }
    public void ClearText(){
        txtCategory.setText("");
        txtID.setText("Auto");
        Date date = new Date();
        dtpDate.setDate(date);
    }
    public void DisableEditText(){
        txtID.setEditable(false);
        txtCategory.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
        editor.setEditable(false);
        txtUser.setEditable(false);
    }
    public void EnableEditText(){
        txtCategory.setEditable(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
        editor.setEditable(true);
        txtUser.setEditable(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbGroup;
    private com.toedter.calendar.JDateChooser dtpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
