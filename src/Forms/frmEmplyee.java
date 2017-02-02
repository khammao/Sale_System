
package Forms;

import static Forms.ChangeLanguage.getLabel;
import static Forms.frmLogin.user_name;
import com.placeholder.PlaceHolder;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEmplyee extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    String sex;
    public frmEmplyee() {
        initComponents();
        groupButton();
        txtUser.setText(user_name);
        PlaceHolder txt1 = new PlaceHolder(txtSearch,"Please! enter employee id");
        Lb_ID.setText(getLabel("Lb_ID"));
        Lb_Empname.setText(getLabel("Lb_Empname"));
        Lb_EmpnameEN.setText(getLabel("Lb_EmpnameEN"));
        Lb_Mobile.setText(getLabel("Lb_Mobile"));
        Lb_Email.setText(getLabel("Lb_Email"));
        Lb_BDay.setText(getLabel("Lb_BDay"));
        Lb_Emergency.setText(getLabel("Lb_Emergency"));
        Lb_EmpStartW.setText(getLabel("Lb_EmpStartW"));
        Lb_EmpAddress.setText(getLabel("Lb_EmpAddress"));
        Lb_Note.setText(getLabel("Lb_Note"));
        Lb_Update.setText(getLabel("Lb_Update"));
        Lb_CreateBy.setText(getLabel("Lb_CreateBy"));
        RadMale.setText(getLabel("RadMale"));
        RadFemale.setText(getLabel("RadFemale"));
        btnNew.setText(getLabel("btnNew"));
        btnSave.setText(getLabel("btnSave"));
        btnDelete.setText(getLabel("btnDelete"));
        Lb_Search.setText(getLabel("Lb_Search"));
    }
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(RadMale);
        bg.add(RadFemale);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Lb_ID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Lb_Empname = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        Lb_EmpnameEN = new javax.swing.JLabel();
        txtNameEng = new javax.swing.JTextField();
        RadMale = new javax.swing.JRadioButton();
        RadFemale = new javax.swing.JRadioButton();
        Lb_Mobile = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        Lb_Email = new javax.swing.JLabel();
        Lb_EmpAddress = new javax.swing.JLabel();
        dtcBD = new com.toedter.calendar.JDateChooser();
        Lb_BDay = new javax.swing.JLabel();
        dtcStart = new com.toedter.calendar.JDateChooser();
        Lb_EmpStartW = new javax.swing.JLabel();
        Lb_Emergency = new javax.swing.JLabel();
        txtEmergency = new javax.swing.JTextField();
        Lb_Note = new javax.swing.JLabel();
        Lb_CreateBy = new javax.swing.JLabel();
        Lb_Update = new javax.swing.JLabel();
        dtcUpdate = new com.toedter.calendar.JDateChooser();
        txtUser = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Lb_Search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(248, 248, 248));
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

        jButton1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-arrow-icon-94826.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-page-arrow-icon-94883.png"))); // NOI18N
        jPanel2.add(jButton2);

        jButton3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        jPanel2.add(jButton3);

        jButton5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next-arrow-icon-94826.png"))); // NOI18N
        jPanel2.add(jButton5);

        Lb_ID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_ID.setText("ລຳດັບ:");

        txtID.setBackground(new java.awt.Color(244, 244, 244));
        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Empname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Empname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Empname.setText("ຊື່ພະນັກງານ:");

        txtName.setBackground(new java.awt.Color(248, 248, 248));
        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_EmpnameEN.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_EmpnameEN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_EmpnameEN.setText("ຊື່ພະນັກງານ Eng:");

        txtNameEng.setBackground(new java.awt.Color(248, 248, 248));
        txtNameEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        RadMale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadMale.setText("ຊາຍ");
        RadMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadMaleActionPerformed(evt);
            }
        });

        RadFemale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadFemale.setText("ຍິງ");
        RadFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadFemaleActionPerformed(evt);
            }
        });

        Lb_Mobile.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Mobile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Mobile.setText("ເບີ:");

        txtPhone.setBackground(new java.awt.Color(248, 248, 248));
        txtPhone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtEmail.setBackground(new java.awt.Color(248, 248, 248));
        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Email.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Email.setText("Email:");

        Lb_EmpAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_EmpAddress.setText("ທີ່ຢູ່ປະຈຸບັນຂອງພະນັກງານ");

        dtcBD.setBackground(new java.awt.Color(247, 246, 246));
        dtcBD.setDateFormatString("yyyy-MM-dd");

        Lb_BDay.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_BDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_BDay.setText("ວັນ,ເດືອນ,ປີເກີດ:");

        dtcStart.setBackground(new java.awt.Color(247, 246, 246));
        dtcStart.setDateFormatString("yyyy-MM-dd");

        Lb_EmpStartW.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_EmpStartW.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_EmpStartW.setText("ວັນທີ່ເຂົ້າການ:");

        Lb_Emergency.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Emergency.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Emergency.setText("ເບີໂທສຸກເສິນ:");

        txtEmergency.setBackground(new java.awt.Color(248, 248, 248));
        txtEmergency.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Note.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Note.setText("ໝາຍເຫດ");

        Lb_CreateBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_CreateBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_CreateBy.setText("ຜູ້ປັບປຸງ:");

        Lb_Update.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Update.setText("ວັນທີປັັບປຸງ:");

        dtcUpdate.setBackground(new java.awt.Color(248, 248, 248));
        dtcUpdate.setDateFormatString("yyyy-MM-dd");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtUser.setText("Mee");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jButton4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Lb_Search.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Search.setText("ຄົ້ນຂໍ້ມູນ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Lb_Search)
                .addGap(27, 27, 27)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lb_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        txtAddress.setBackground(new java.awt.Color(248, 248, 248));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtRemark.setBackground(new java.awt.Color(248, 248, 248));
        txtRemark.setColumns(20);
        txtRemark.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtRemark.setRows(5);
        jScrollPane2.setViewportView(txtRemark);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lb_Mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_EmpnameEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_Empname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lb_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb_BDay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Lb_Emergency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb_EmpStartW, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RadMale)
                        .addGap(8, 8, 8)
                        .addComponent(RadFemale))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameEng, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcBD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcStart, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Note)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Lb_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dtcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lb_EmpAddress)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Lb_ID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RadMale)
                                .addComponent(RadFemale))
                            .addComponent(Lb_EmpAddress, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Lb_Empname)
                        .addGap(12, 12, 12)
                        .addComponent(Lb_EmpnameEN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtNameEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Mobile)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Note))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Lb_Email)
                        .addGap(9, 9, 9)
                        .addComponent(Lb_BDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(dtcBD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_EmpStartW, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcStart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Lb_Emergency)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtID.setEnabled(false);
        DisableEditText();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        EnableEditText();
        ClearText();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            if(txtID.getText().equals("Auto")){
                if(txtName.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    return;
                }
                if(JOptionPane.showConfirmDialog(null,"Do you like to save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String DBD = (String) df.format(dtcBD.getDate());
                    String DST = (String) df.format(dtcStart.getDate());
                    String DUP = (String) df.format(dtcUpdate.getDate());
                    sql="Insert into Employee(EName,ENameEng,Sex,Tel,Email,Address,BDay,StartDate,EmergencyContact,Description,Updates,CreateBy)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtName.getText());
                    p.setString(2,txtNameEng.getText());
                    p.setString(3,sex);
                    p.setString(4,txtPhone.getText());
                    p.setString(5,txtEmail.getText());
                    p.setString(6,txtAddress.getText());
                    p.setString(7,DBD);
                    p.setString(8,DST);
                    p.setString(9,txtEmergency.getText());
                    p.setString(10,txtRemark.getText());
                    p.setString(11,DUP);
                    p.setString(12,txtUser.getText());
                    if(p.executeUpdate()!= -1){
                        int type = JOptionPane.OK_OPTION;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a,b,type);
                    }
                    ClearText();
                }
            }else{
                if(txtName.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    return;
                }
                if(JOptionPane.showConfirmDialog(null,"Do you like to edit?","edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String DBD = (String) df.format(dtcBD.getDate());
                    String DST = (String) df.format(dtcStart.getDate());
                    String DUP = (String) df.format(dtcUpdate.getDate());
                    sql="Update Employee set EName=?,ENameEng=?,Sex=?,Tel=?,Email=?,Address=?,BDay=?,StartDate=?,EmergencyContact=?,Description=?,Updates=?,CreateBy=? where EID=?";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtName.getText());
                    p.setString(2,txtNameEng.getText());
                    p.setString(3,sex);
                    p.setString(4,txtPhone.getText());
                    p.setString(5,txtEmail.getText());
                    p.setString(6,txtAddress.getText());
                    p.setString(7,DBD);
                    p.setString(8,DST);
                    p.setString(9,txtEmergency.getText());
                    p.setString(10,txtRemark.getText());
                    p.setString(11,DUP);
                    p.setString(12,txtUser.getText());
                    p.setString(13,txtID.getText());
                    if(p.executeUpdate()!= -1){
                        int type = JOptionPane.OK_OPTION;
                        String a = "Finished";
                        String b = "Edit";
                        JOptionPane.showMessageDialog(null,a,b,type);
                    }
                    ClearText();
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void RadMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadMaleActionPerformed
        if(RadMale.isSelected()){
             sex="Male";
        }
    }//GEN-LAST:event_RadMaleActionPerformed

    private void RadFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadFemaleActionPerformed
        if(RadFemale.isSelected()){
            sex="Female";
        }
    }//GEN-LAST:event_RadFemaleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SearchData();
        radioSelected();
    }//GEN-LAST:event_jButton4ActionPerformed

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
                sql="Delete from Employee where EID=?";
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
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void DisableEditText(){
        txtName.setEditable(false);
        txtNameEng.setEditable(false);
        txtPhone.setEditable(false);
        txtEmail.setEditable(false);
        txtAddress.setEditable(false);
        txtEmergency.setEditable(false);
        txtRemark.setEditable(false);
        txtUser.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcBD.getDateEditor();
        editor.setEditable(false);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dtcStart.getDateEditor();
        editor1.setEditable(false);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor2.setEditable(false);
    }
    public void EnableEditText(){
        txtName.setEditable(true);
        txtNameEng.setEditable(true);
        txtPhone.setEditable(true);
        txtEmail.setEditable(true);
        txtAddress.setEditable(true);
        txtEmergency.setEditable(true);
        txtRemark.setEditable(true);
        txtUser.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcBD.getDateEditor();
        editor.setEditable(true);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dtcStart.getDateEditor();
        editor1.setEditable(true);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) dtcUpdate.getDateEditor();
        editor2.setEditable(true);
    }
    public void ClearText(){
        txtID.setText("Auto");
        txtName.setText("");
        txtNameEng.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtEmergency.setText("");
        txtRemark.setText("");
        txtUser.setText("");
        dtcBD.setDate(null);
        dtcStart.setDate(null);
        dtcUpdate.setDate(null);
        RadMale.setSelected(false);
        RadFemale.setSelected(false);
    }
    public void SearchData(){
        try{
            sql="SELECT EID, EName, ENameEng, Tel, Email, Address, BDay, StartDate, EmergencyContact, Description, Updates, CreateBy FROM Employee where EID="+ txtSearch.getText() +"";
            ResultSet rs = con.createStatement().executeQuery(sql);
            if(rs.next())
            {
                String ID = rs.getString("EID");
                txtID.setText(ID);
                String Name = rs.getString("EName");
                txtName.setText(Name);
                String NameEN = rs.getString("ENameEng");
                txtNameEng.setText(NameEN);
                String TEL = rs.getString("Tel");
                txtPhone.setText(TEL);
                String EM = rs.getString("Email");
                txtEmail.setText(EM);
                String AD = rs.getString("Address");
                txtAddress.setText(AD);
                dtcBD.setDate(rs.getDate("BDay"));
                dtcStart.setDate(rs.getDate("StartDate"));
                String EC = rs.getString("EmergencyContact");
                txtEmergency.setText(EC);
                String DP = rs.getString("Description");
                txtRemark.setText(DP);
                dtcUpdate.setDate(rs.getDate("Updates"));
                String CB = rs.getString("CreateBy");
                txtUser.setText(CB);
            }
            //rs.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void radioSelected(){
          
        try {
            
            sql = "select Sex from Employee where EID = "+ txtSearch.getText() +"";            
            ResultSet rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                 String gender=rs.getString("Sex");
                if(gender.equals("Male"))
                {
                    RadMale.setSelected(true); 
                }
                else if(gender.equals("Female"))
                {
                    RadFemale.setSelected(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "error !");
                }  
            }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_BDay;
    private javax.swing.JLabel Lb_CreateBy;
    private javax.swing.JLabel Lb_Email;
    private javax.swing.JLabel Lb_Emergency;
    private javax.swing.JLabel Lb_EmpAddress;
    private javax.swing.JLabel Lb_EmpStartW;
    private javax.swing.JLabel Lb_Empname;
    private javax.swing.JLabel Lb_EmpnameEN;
    private javax.swing.JLabel Lb_ID;
    private javax.swing.JLabel Lb_Mobile;
    private javax.swing.JLabel Lb_Note;
    private javax.swing.JLabel Lb_Search;
    private javax.swing.JLabel Lb_Update;
    private javax.swing.JRadioButton RadFemale;
    private javax.swing.JRadioButton RadMale;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dtcBD;
    private com.toedter.calendar.JDateChooser dtcStart;
    private com.toedter.calendar.JDateChooser dtcUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmergency;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameEng;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtRemark;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
