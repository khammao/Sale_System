
package Forms;

import static Forms.ChangeLanguage.getLabel;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class frmUnit extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql; 
    public frmUnit() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
        Lb_ID.setText(getLabel("Lb_ID"));
        Lb_UnitName.setText(getLabel("Lb_UnitName"));
        Lb_Update.setText(getLabel("Lb_Update"));
        Lb_CreateBy.setText(getLabel("Lb_CreateBy"));
        btnNew.setText(getLabel("btnNew"));
        btnSave.setText(getLabel("btnSave"));
        btnDelete.setText(getLabel("btnDelete"));
        JTableHeader th = jTable1.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        jTable1.getColumnCount();
        for(int i=0; i < jTable1.getColumnCount(); i++){
            TableColumn tc = tcm.getColumn(i);            
            tc.setHeaderValue(getLabel (jTable1.getModel().getColumnName(i)));
            System.out.println(jTable1.getModel().getColumnName(i));
        }
        jTable1.setAutoCreateRowSorter(true);
        th.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Lb_ID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Lb_UnitName = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        Lb_Update = new javax.swing.JLabel();
        dtcDate = new com.toedter.calendar.JDateChooser();
        Lb_CreateBy = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
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

        Lb_ID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_ID.setText("ລຳດັບ:");

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_UnitName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_UnitName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_UnitName.setText("ຫົວໜ່ວຍ:");

        txtUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Update.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Update.setText("ວັນທີ່ປັບປຸງ:");

        dtcDate.setDateFormatString("yyyy-MM-dd");
        dtcDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Lb_CreateBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_CreateBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_CreateBy.setText("ຜູ້ປັບປຸງ:");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnNew.setText("ເພີ່ມໃໝ່");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save_37110.png"))); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lb_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_UnitName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_CreateBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser)
                    .addComponent(dtcDate, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtUnit)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_ID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lb_UnitName)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lb_Update)
                    .addComponent(dtcDate, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_CreateBy)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "LbT_ID", "LbT_Unit", "LbT_Updates", "LbT_CreateBy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       Date date = new Date();
       dtcDate.setDate(date);
        ShowData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try
       {
           SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
           if(evt.getClickCount()==1)
           {
               int index=jTable1.getSelectedRow();
               String ID=jTable1.getValueAt(index, 0).toString();
               String Unit=jTable1.getValueAt(index, 1).toString();
             //  String date =jTable1.getValueAt(index, 2).toString();
               String User=jTable1.getValueAt(index, 3).toString();
               txtID.setText(ID);
               txtUnit.setText(Unit);
             //  dtcDate.setDateFormatString(date);
               txtUser.setText(User);
           }
       }catch(Exception e)
       {
           
       }
    }//GEN-LAST:event_jTable1MouseClicked
public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       try
       {
           if(txtID.getText().equals("Auto")){
               if(txtUnit.getText().equals("")){
               int type = JOptionPane.WARNING_MESSAGE;
               String a="Error...Please check your date again.";
               String b="Message";
               JOptionPane.showMessageDialog(null,a, b,type);
                return;
           }
           if(JOptionPane.showConfirmDialog(null, "Do you like to save?","Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
               SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
               String date = dd.format(dtcDate.getDate());
               sql="Insert into Unit(UnitName,Updates,CreateBy)values(?,?,?)";
               PreparedStatement p = con.prepareStatement(sql);
               p.setString(1, txtUnit.getText());
               p.setString(2, date);
               //p.setDate(2,convertUtilDateToSqlDate(dtcDate.getDate()));
               p.setString(3,txtUser.getText());
               if(p.executeUpdate()!=-1){
                   int type = JOptionPane.OK_OPTION;
                   String a = "Finished";
                   String b = "Message";
                   JOptionPane.showMessageDialog(null,a,b,type);
               }
               ShowData();
               ClearText();
           }
           }else{
              if(txtUnit.getText().equals("")){
                  int type = JOptionPane.WARNING_MESSAGE;
                  String a =  "Error...Please check your data again.";
                  String b = "Message";
                  JOptionPane.showMessageDialog(null,a, b,type);
                   return;
              }
              if(JOptionPane.showConfirmDialog(null, "Do you like to save?","Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
                  String date = dd.format(dtcDate.getDate());
         
                  sql="Update Unit set UnitName=?,Updates=?,CreateBy=? where UnitID=?";
                  PreparedStatement p = con.prepareStatement(sql);
                  p.setString(1,txtUnit.getText());
                  p.setString(2,date);
                  p.setString(3,txtUser.getText());
                  p.setString(4,txtID.getText());
                  if(p.executeUpdate()!=-1){
                      int type = JOptionPane.OK_OPTION;
                      String a = "Finished";
                      String b = "Message";
                      JOptionPane.showMessageDialog(null,a, b,type);
                  }
                  ShowData();
                  ClearText();
                  
              }
           }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        ClearText();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
           if(txtID.getText().equals("")){
               int type = JOptionPane.WARNING_MESSAGE;
               String a = "Error...Please select your data.";
               String b = "Message";
               JOptionPane.showMessageDialog(null,a, b,type);
                return;
           }
           if(JOptionPane.showConfirmDialog(null,"Do you like to Delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
               sql="Delete from Unit where UnitID=?";
               PreparedStatement p = con.prepareStatement(sql);
               p.setString(1,txtID.getText());
               if(p.executeUpdate()!=-1){
                   int type = JOptionPane.OK_OPTION;
                   String a = "Finished";
                   String b = "Message";
                   JOptionPane.showConfirmDialog(null,a, b,type);
               }
               ShowData();
               ClearText();
           }
       }catch(Exception e){}
    }//GEN-LAST:event_btnDeleteActionPerformed
 public void ShowData()
    {
        try
        {
            int index =jTable1.getRowCount()-1;
            while (index > -1)
            {
                model.removeRow(index--);
            }
            sql="Select * from Unit";
            ResultSet rs= con.createStatement().executeQuery(sql);
            while(rs.next())
            {
                Vector v = new Vector();
                v.add(rs.getString("UnitID"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("Updates"));
                v.add(rs.getString("CreateBy"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        }catch(Exception e)
        {
        }
    }
    public void ClearText()
    {
        txtID.setText("Auto");
        txtUnit.setText("");
       Date date = new Date();
       dtcDate.setDate(date);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_CreateBy;
    private javax.swing.JLabel Lb_ID;
    private javax.swing.JLabel Lb_UnitName;
    private javax.swing.JLabel Lb_Update;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dtcDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtUnit;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
