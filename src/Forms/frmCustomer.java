
package Forms;

import static Forms.ShowAddress.DS;
import static Forms.ShowAddress.District;
import static Forms.ShowAddress.Provinces;
import static Forms.ShowAddress.VL;
import static Forms.ShowAddress.Villages;
import static Forms.ShowAddress.cmbD;
import static Forms.ShowAddress.cmbP;
import static Forms.ShowAddress.cmbV;
import static Forms.ShowAddress.pv;
import static Forms.fetchResultSet.rsAll;
import static Forms.fetchResultSet.Tables;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frmCustomer extends javax.swing.JInternalFrame {
    Connection conn = ConnectDB.getConnection();
    String sql;
    String Sex;
    public frmCustomer() {
        initComponents();
        GroupButton();
        DisableEditText();
        //GetIDAuto();
        cmbP = cmbProvince;
        cmbD = cmbDistrict;
        cmbV = cmbVillage;
        Tables = "vw_Filter_Customer";
    }
    public void GroupButton(){
        ButtonGroup bg = new ButtonGroup();
        bg.add(RadMale);
        bg.add(RadFemale);
    }
    public void DisableEditText(){
        try {
            txtID.setEditable(false);
            txtNbr.setEditable(false);
            txtCusName.setEditable(false);
            txtCusNameEn.setEditable(false);
            txtStreet.setEditable(false);
            txtMobile.setEditable(false);
            txtEmail.setEditable(false);
            txtCompany.setEditable(false);
            txtDiscount.setEditable(false);
            txtBank1.setEditable(false);
            txtAccNo1.setEditable(false);
            txtBank2.setEditable(false);
            txtAccNo2.setEditable(false);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcDate.getDateEditor();
            editor.setEditable(false);
            txtUser.setEditable(false);
        } catch (Exception e) {
        }
    }
    public void EnableEditText(){
        try {
            GetIDAuto();
            txtID.setText("Auto");
            txtCusName.setEditable(true);
            txtCusNameEn.setEditable(true);
            txtStreet.setEditable(true);
            txtMobile.setEditable(true);
            txtEmail.setEditable(true);
            txtCompany.setEditable(true);
            txtDiscount.setEditable(true);
            txtBank1.setEditable(true);
            txtAccNo1.setEditable(true);
            txtBank2.setEditable(true);
            txtAccNo2.setEditable(true);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtcDate.getDateEditor();
            editor.setEditable(true);
            txtUser.setEditable(true);
        } catch (Exception e) {
        }
    }
    public void ClearText(){
        try {
            GetIDAuto();
            txtID.setText("Auto");
            txtCusName.setText("");
            txtCusNameEn.setText("");
            txtStreet.setText("");
            cmbProvince.setSelectedItem(null);
            cmbDistrict.setSelectedItem(null);
            cmbVillage.setSelectedItem(null);
            txtMobile.setText("");
            txtEmail.setText("");
            txtCompany.setText("");
            txtDiscount.setText("");
            txtBank1.setText("");
            txtAccNo1.setText("");
            txtBank2.setText("");
            txtAccNo2.setText("");
            dtcDate.setDate(null);
            txtUser.setText("");
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
        jButton8 = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        txtCusNameEn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbProvince = new javax.swing.JComboBox();
        cmbDistrict = new javax.swing.JComboBox();
        cmbVillage = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        txtBank1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtAccNo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtBank2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAccNo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dtcDate = new com.toedter.calendar.JDateChooser();
        txtMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        RadMale = new javax.swing.JRadioButton();
        RadFemale = new javax.swing.JRadioButton();
        txtNbr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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

        jButton8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton8.setText("ຂໍ້ມູນຂອງລູກຄ້າ");
        jPanel2.add(jButton8);

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

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ລຳດັບ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ຊື່ລູກຄ້າ(ລາວ):");

        txtCusName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtCusNameEn.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ຊື່ລູກຄ້າ(ອັງກີດ):");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ທະໜົນ:");

        txtStreet.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ແຂວງ:");

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ເມືອງ:");

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ບ້ານ:");

        cmbProvince.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbProvince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProvinceMouseClicked(evt);
            }
        });
        cmbProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinceActionPerformed(evt);
            }
        });

        cmbDistrict.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistrictActionPerformed(evt);
            }
        });

        cmbVillage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");

        txtCompany.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ບໍລິສັດ:");

        jLabel12.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ສ່ວນຫຼຸດ:");

        txtDiscount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtBank1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ທະນະຄານ 1:");

        jLabel14.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ບັນຊີ 1:");

        txtAccNo1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ທະນະຄານ 2:");

        txtBank2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ບັນຊີ 2:");

        txtAccNo2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ວັນທີ່ປັບປຸງ:");

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ຜູ້ໃຊ້:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtcDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAccNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBank2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAccNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBank1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBank1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBank2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtcDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtMobile.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ເບີໂທ:");

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        RadMale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadMale.setText("ຊາຍ");
        RadMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadMaleActionPerformed(evt);
            }
        });

        RadFemale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        RadFemale.setText("ຍຶງ");
        RadFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadFemaleActionPerformed(evt);
            }
        });

        txtNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ລະຫັດ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMobile, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbDistrict, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbProvince, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCusNameEn, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCusName)
                                            .addComponent(cmbVillage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RadMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RadFemale))
                                    .addComponent(txtNbr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(RadMale)
                            .addComponent(RadFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCusName)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCusNameEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbVillage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        EnableEditText();
        ClearText();
    }//GEN-LAST:event_btnNewActionPerformed
    public void GetIDAuto(){
        try {
            sql = "Select  CONCAT('CST', Substring(max(CusNbr),4,6)+1) as CNbr from Customers";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if (rs.next()){
                    txtNbr.setText(rs.getString("CNbr"));
                 }
        } catch (Exception e) {
        }
    }
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
                int Dis =cmbDistrict.getSelectedIndex();
                int Pro =cmbProvince.getSelectedIndex();
                int Vill =cmbVillage.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to Save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtcDate.getDate());
                    sql = "Insert into Customers(CusNbr,CusName,CusNameEng,Sex,Street,VID,DistID,ProvID,Tel,Email,Company,Discount,Bank1,AccNo1,Bank2,AccNo2,Updates,CreateBy)Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, txtNbr.getText());
                    p.setString(2, txtCusName.getText());
                    p.setString(3, txtCusNameEn.getText());
                    p.setString(4, Sex);
                    p.setString(5, txtStreet.getText());
                    p.setString(6, VL.get(Vill).toString());
                    p.setString(7, DS.get(Dis).toString());
                    p.setString(8, pv.get(Pro).toString());
                    p.setString(9, txtMobile.getText());
                    p.setString(10, txtEmail.getText());
                    p.setString(11, txtCompany.getText());
                    p.setFloat(12, Float.parseFloat(txtDiscount.getText()));
                    p.setString(13, txtBank1.getText());
                    p.setString(14, txtAccNo1.getText());
                    p.setString(15, txtBank2.getText());
                    p.setString(16, txtAccNo2.getText());
                    p.setString(17, date);
                    p.setString(18, txtUser.getText());
                    if(p.executeUpdate() != - 1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }else{}
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbProvinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinceMouseClicked
       
    }//GEN-LAST:event_cmbProvinceMouseClicked

    private void cmbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinceActionPerformed
        District();
    }//GEN-LAST:event_cmbProvinceActionPerformed

    private void cmbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistrictActionPerformed
        Villages();
    }//GEN-LAST:event_cmbDistrictActionPerformed

    private void RadMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadMaleActionPerformed
        if(RadMale.isSelected()){
             Sex="Male";
        }
    }//GEN-LAST:event_RadMaleActionPerformed

    private void RadFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadFemaleActionPerformed
        if(RadFemale.isSelected()){
             Sex="Female";
        }
    }//GEN-LAST:event_RadFemaleActionPerformed

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
                sql="Delete from Customers where CusID=?";
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
                    txtID.setText(rsAll.getString("CusID"));
                    txtNbr.setText(rsAll.getString("CusNbr"));
                    txtCusName.setText(rsAll.getString("CusName"));
                    txtCusNameEn.setText(rsAll.getString("CusNameEng"));
                    String gender=rsAll.getString("Sex");
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
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillage.setSelectedItem(rsAll.getString("Village"));
                    txtMobile.setText(rsAll.getString("Tel"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtDiscount.setText(rsAll.getString("Discount"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("CreateBy"));
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
                    txtID.setText(rsAll.getString("CusID"));
                    txtNbr.setText(rsAll.getString("CusNbr"));
                    txtCusName.setText(rsAll.getString("CusName"));
                    txtCusNameEn.setText(rsAll.getString("CusNameEng"));
                    String gender=rsAll.getString("Sex");
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
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillage.setSelectedItem(rsAll.getString("Village"));
                    txtMobile.setText(rsAll.getString("Tel"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtDiscount.setText(rsAll.getString("Discount"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("CreateBy"));
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
                    txtID.setText(rsAll.getString("CusID"));
                    txtNbr.setText(rsAll.getString("CusNbr"));
                    txtCusName.setText(rsAll.getString("CusName"));
                    txtCusNameEn.setText(rsAll.getString("CusNameEng"));
                    String gender=rsAll.getString("Sex");
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
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillage.setSelectedItem(rsAll.getString("Village"));
                    txtMobile.setText(rsAll.getString("Tel"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtDiscount.setText(rsAll.getString("Discount"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("CreateBy"));
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
                    txtID.setText(rsAll.getString("CusID"));
                    txtNbr.setText(rsAll.getString("CusNbr"));
                    txtCusName.setText(rsAll.getString("CusName"));
                    txtCusNameEn.setText(rsAll.getString("CusNameEng"));
                    String gender=rsAll.getString("Sex");
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
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillage.setSelectedItem(rsAll.getString("Village"));
                    txtMobile.setText(rsAll.getString("Tel"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtDiscount.setText(rsAll.getString("Discount"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtcDate.setDate(rsAll.getDate("Updates"));
                    txtUser.setText(rsAll.getString("CreateBy"));
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
          try{
            sql="Select * from vw_Filter_Customer where CusName=N'"+ txtSearch.getText() +"' or CusNameEng=N'"+ txtSearch.getText() +"' or CusNbr = '"+ txtSearch.getText() +"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                String ID = rs.getString("CusID");
                txtID.setText(ID);
                String Nbr = rs.getString("CusNbr");
                txtNbr.setText(Nbr);
                String Sname = rs.getString("CusName");
                txtCusName.setText(Sname);
                String SnameEn = rs.getString("CusNameEng");
                txtCusNameEn.setText(SnameEn);
                String Srt = rs.getString("Street");
                txtStreet.setText(Srt);
                String VLL = rs.getString("Village");
                cmbVillage.setSelectedItem(VLL);
                String PID = rs.getString("ProvName");
                cmbProvince.setSelectedItem(PID);
                String DID = rs.getString("DistName");
                cmbDistrict.setSelectedItem(DID);
                String Mb = rs.getString("Tel");
                txtMobile.setText(Mb);
                String em = rs.getString("Email");
                txtEmail.setText(em);
                String CP = rs.getString("Company");
                txtCompany.setText(CP);
                String Dcr = rs.getString("Discount");
                txtDiscount.setText(Dcr);
                String B1 = rs.getString("Bank1");
                txtBank1.setText(B1);
                String A1 = rs.getString("AccNo1");
                txtAccNo1.setText(A1);
                String B2 = rs.getString("Bank2");
                txtBank2.setText(B2);
                String A2 = rs.getString("AccNo2");
                txtAccNo2.setText(A2);
                dtcDate.setDate(rs.getDate("Updates"));
                String user = rs.getString("Createby");
                txtUser.setText(user);
            }
        }catch(Exception e){}
    }
    public void radioSelected(){  
        try {
            sql="Select Sex from vw_Filter_Customer where CusName=N'"+ txtSearch.getText() +"' or CusNameEng=N'"+ txtSearch.getText() +"' or CusNbr = '"+ txtSearch.getText() +"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
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
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchData();
        radioSelected();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Provinces();
        cmbProvince.setSelectedItem(null);
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadFemale;
    private javax.swing.JRadioButton RadMale;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbDistrict;
    private javax.swing.JComboBox cmbProvince;
    private javax.swing.JComboBox cmbVillage;
    private com.toedter.calendar.JDateChooser dtcDate;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAccNo1;
    private javax.swing.JTextField txtAccNo2;
    private javax.swing.JTextField txtBank1;
    private javax.swing.JTextField txtBank2;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusNameEn;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNbr;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
