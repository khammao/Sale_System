
package Forms;

import static Forms.ChangeLanguage.getLabel;
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
import com.placeholder.PlaceHolder;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frmSuppliers extends javax.swing.JInternalFrame {
    Connection conn = ConnectDB.getConnection();
    String sql;
    String Sex;
    public frmSuppliers() {
        initComponents();
        groupButton();
        cmbP = cmbProvince;
        cmbD = cmbDistrict;
        cmbV = cmbVillages;
        DisableEditText();
        Tables = "vw_Filter_Suppliers";
        PlaceHolder txt1 = new PlaceHolder(txtSearch,"Please! enter Supplier name");
        // Change Languages
        Lb_ID.setText(getLabel("Lb_ID"));
        RadMale.setText(getLabel("RadMale"));
        RadFemale.setText(getLabel("RadFemale"));
        Lb_SupplierLao.setText(getLabel("Lb_SupplierLao"));
        Lb_SupplierEn.setText(getLabel("Lb_SupplierEn"));
        Lb_Mobile.setText(getLabel("Lb_Mobile"));
        Lb_Email.setText(getLabel("Lb_Email"));
        Lb_Province.setText(getLabel("Lb_Province"));
        Lb_District.setText(getLabel("Lb_District"));
        Lb_Village.setText(getLabel("Lb_Village"));
        Lb_Company.setText(getLabel("Lb_Company"));
        Lb_Street.setText(getLabel("Lb_Street"));
        Lb_Bank1.setText(getLabel("Lb_Bank1"));
        Lb_Account1.setText(getLabel("Lb_Account1"));
        Lb_Bank2.setText(getLabel("Lb_Bank2"));
        Lb_Account2.setText(getLabel("Lb_Account2"));
        Lb_Update.setText(getLabel("Lb_Update"));
        Lb_CreateBy.setText(getLabel("Lb_CreateBy"));
        btnNew.setText(getLabel("btnNew"));
        btnSave.setText(getLabel("btnSave"));
        btnDelete.setText(getLabel("btnDelete"));
        btnVillage_in_Supplier.setText(getLabel("btnVillage_in_Supplier"));
    }
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(RadMale);
        bg.add(RadFemale);
    }
    public void ClearText(){
        try {
            txtID.setText("Auto");
            txtSpName.setText("");
            txtSpNameEng.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            cmbProvince.setSelectedItem(null);
            cmbDistrict.setSelectedItem(null);
            cmbVillages.setSelectedItem(null);
            txtCompany.setText("");
            txtStreet.setText("");
            txtBank1.setText("");
            txtAccNo1.setText("");
            txtBank2.setText("");
            txtAccNo2.setText("");
//            Date date = new Date();
            dtpDate.setDate(null);
           // txtUser.setText("");
            RadMale.setSelected(false);
            RadFemale.setSelected(false);
        } catch (Exception e) {
        }
    }
    public void DisableEditText(){
        try {
            txtID.setEditable(false);
            txtSpName.setEditable(false);
            txtSpNameEng.setEditable(false);
            txtMobile.setEditable(false);
            txtEmail.setEditable(false);
            //cmbProvince.setEditable(false);
            //cmbDistrict.setEditable(false);
            //cmbVillages.setEditable(false);
            txtCompany.setEditable(false);
            txtStreet.setEditable(false);
            txtBank1.setEditable(false);
            txtAccNo1.setEditable(false);
            txtBank2.setEditable(false);
            txtAccNo2.setEditable(false);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
            editor.setEditable(false);
            txtUser.setEditable(false);
        } catch (Exception e) {
        }
    }
    public void EnableEditText(){
        try {
            //txtID.setEditable(true);
            txtSpName.setEditable(true);
            txtSpNameEng.setEditable(true);
            txtMobile.setEditable(true);
            txtEmail.setEditable(true);
            //cmbProvince.setEditable(true);
            //cmbDistrict.setEditable(true);
            //cmbVillages.setEditable(true);
            txtCompany.setEditable(true);
            txtStreet.setEditable(true);
            txtBank1.setEditable(true);
            txtAccNo1.setEditable(true);
            txtBank2.setEditable(true);
            txtAccNo2.setEditable(true);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
            editor.setEditable(true);
            txtUser.setEditable(true);
        } catch (Exception e) {
        }
    }
    public void radioSelected(){  
        try {
            sql = "select Sex from vw_Filter_Suppliers where  SupName=N'"+ txtSearch.getText() +"'";            
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
    public void SearchData(){
        try{
            sql="Select * from vw_Filter_Suppliers where SupName=N'"+ txtSearch.getText() +"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                String ID = rs.getString("SupID");
                txtID.setText(ID);
                String Sname = rs.getString("SupName");
                txtSpName.setText(Sname);
                String SnameEn = rs.getString("SupNameEng");
                txtSpNameEng.setText(SnameEn);
                String Mb = rs.getString("Phone");
                txtMobile.setText(Mb);
                String em = rs.getString("Email");
                txtEmail.setText(em);
                String Srt = rs.getString("Street");
                txtStreet.setText(Srt);
                String VLL = rs.getString("Village");
                cmbVillages.setSelectedItem(VLL);
                String PID = rs.getString("ProvName");
                cmbProvince.setSelectedItem(PID);
                String DID = rs.getString("DistName");
                cmbDistrict.setSelectedItem(DID);
                String CP = rs.getString("Company");
                txtCompany.setText(CP);
                String B1 = rs.getString("Bank1");
                txtBank1.setText(B1);
                String A1 = rs.getString("AccNo1");
                txtAccNo1.setText(A1);
                String B2 = rs.getString("Bank2");
                txtBank2.setText(B2);
                String A2 = rs.getString("AccNo2");
                txtAccNo2.setText(A2);
                dtpDate.setDate(rs.getDate("Updates"));
                String user = rs.getString("Createby");
                txtUser.setText(user);
            }
        }catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnVillage_in_Supplier = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        Lb_ID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Lb_SupplierLao = new javax.swing.JLabel();
        Lb_SupplierEn = new javax.swing.JLabel();
        RadMale = new javax.swing.JRadioButton();
        RadFemale = new javax.swing.JRadioButton();
        Lb_Mobile = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        Lb_Email = new javax.swing.JLabel();
        Lb_Province = new javax.swing.JLabel();
        Lb_District = new javax.swing.JLabel();
        Lb_Village = new javax.swing.JLabel();
        cmbProvince = new javax.swing.JComboBox<String>();
        cmbDistrict = new javax.swing.JComboBox<String>();
        txtSpName = new javax.swing.JTextField();
        txtSpNameEng = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Lb_Company = new javax.swing.JLabel();
        Lb_Street = new javax.swing.JLabel();
        Lb_Bank1 = new javax.swing.JLabel();
        Lb_Account1 = new javax.swing.JLabel();
        Lb_Bank2 = new javax.swing.JLabel();
        Lb_Account2 = new javax.swing.JLabel();
        Lb_Update = new javax.swing.JLabel();
        Lb_CreateBy = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtBank1 = new javax.swing.JTextField();
        txtAccNo1 = new javax.swing.JTextField();
        txtBank2 = new javax.swing.JTextField();
        txtAccNo2 = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        dtpDate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cmbVillages = new javax.swing.JComboBox<String>();

        setBackground(new java.awt.Color(249, 249, 249));
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

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnNew.setText("ເພີ່ມ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel3.add(btnNew);

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save_37110.png"))); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);

        btnVillage_in_Supplier.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnVillage_in_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house-xxl.png"))); // NOI18N
        btnVillage_in_Supplier.setText("ເພີ່ມບ້ານຜູ້ສະໜອງ");
        btnVillage_in_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVillage_in_SupplierActionPerformed(evt);
            }
        });
        jPanel3.add(btnVillage_in_Supplier);

        btnFirst.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-arrow-icon-94826.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst);

        btnPrevious.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/previous-page-arrow-icon-94883.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrevious);

        btnNext.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext);

        btnLast.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next-arrow-icon-94826.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel3.add(btnLast);

        Lb_ID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_ID.setText("ລຳດັບ:");

        txtID.setBackground(new java.awt.Color(249, 249, 249));
        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_SupplierLao.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_SupplierLao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_SupplierLao.setText("ຊື່ຜູ້ສະໜອງ:");

        Lb_SupplierEn.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_SupplierEn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_SupplierEn.setText("ຊື່ຜູ້ສະໜອງ EN:");

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
        Lb_Mobile.setText("ເບີໂທລະສັບ:");

        txtEmail.setBackground(new java.awt.Color(249, 249, 249));
        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Email.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Email.setText("Email:");

        Lb_Province.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Province.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Province.setText("ແຂວງ:");

        Lb_District.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_District.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_District.setText("ເມືອງ:");

        Lb_Village.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Village.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Village.setText("ບ້ານ:");

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
        cmbDistrict.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDistrictMouseClicked(evt);
            }
        });
        cmbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistrictActionPerformed(evt);
            }
        });

        txtSpName.setBackground(new java.awt.Color(249, 249, 249));
        txtSpName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtSpNameEng.setBackground(new java.awt.Color(249, 249, 249));
        txtSpNameEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtMobile.setBackground(new java.awt.Color(249, 249, 249));
        txtMobile.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_Company.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Company.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Company.setText("ບໍລິສັດ:");

        Lb_Street.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Street.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Street.setText("ທະໜົນ:");

        Lb_Bank1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Bank1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Bank1.setText("ທະນະຄານ:");

        Lb_Account1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Account1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Account1.setText("ບັນຊີ:");

        Lb_Bank2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Bank2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Bank2.setText("ທະນະຄານ:");

        Lb_Account2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Account2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Account2.setText("ບັນຊີ:");

        Lb_Update.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Update.setText("ວັນທີ່:");

        Lb_CreateBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_CreateBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_CreateBy.setText("ຜູ້ໃຊ້ງານ:");

        txtCompany.setBackground(new java.awt.Color(249, 249, 249));
        txtCompany.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtStreet.setBackground(new java.awt.Color(249, 249, 249));
        txtStreet.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtBank1.setBackground(new java.awt.Color(249, 249, 249));
        txtBank1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtAccNo1.setBackground(new java.awt.Color(249, 249, 249));
        txtAccNo1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtBank2.setBackground(new java.awt.Color(249, 249, 249));
        txtBank2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtAccNo2.setBackground(new java.awt.Color(249, 249, 249));
        txtAccNo2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtUser.setBackground(new java.awt.Color(249, 249, 249));
        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        dtpDate.setBackground(new java.awt.Color(249, 249, 249));
        dtpDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(Lb_Account2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lb_Street, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lb_Bank1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lb_Account1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lb_Bank2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lb_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Company, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAccNo1)
                    .addComponent(txtCompany)
                    .addComponent(txtStreet)
                    .addComponent(txtBank1)
                    .addComponent(txtBank2)
                    .addComponent(txtAccNo2)
                    .addComponent(txtUser)
                    .addComponent(dtpDate, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Company, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lb_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBank1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Bank1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Lb_Account2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAccNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Account1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBank2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Bank2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lb_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(dtpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        txtSearch.setBackground(new java.awt.Color(249, 249, 249));
        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addGap(92, 92, 92)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cmbVillages.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbVillages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVillagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lb_District, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lb_Village, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbVillages, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(Lb_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lb_SupplierLao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lb_SupplierEn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpNameEng, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Lb_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(RadMale)
                        .addGap(2, 2, 2)
                        .addComponent(RadFemale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Lb_Province, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Lb_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RadMale)
                            .addComponent(RadFemale))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_SupplierLao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_SupplierEn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpNameEng, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Lb_Province, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_District, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_Village, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbVillages, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinceActionPerformed
         District();
    }//GEN-LAST:event_cmbProvinceActionPerformed

    private void cmbProvinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinceMouseClicked
         
    }//GEN-LAST:event_cmbProvinceMouseClicked

    private void cmbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistrictActionPerformed
        Villages();
    }//GEN-LAST:event_cmbDistrictActionPerformed

    private void cmbVillagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVillagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVillagesActionPerformed

    private void cmbDistrictMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDistrictMouseClicked
//        Villages();
    }//GEN-LAST:event_cmbDistrictMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        ClearText();
        EnableEditText();
    }//GEN-LAST:event_btnNewActionPerformed

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
                int Vill =cmbVillages.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to Save ?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="insert into Suppliers(SupName,SupNameEng,sex,Phone,Email,Street,VID,DistID,ProvID,Company,Bank1,AccNo1,Bank2,AccNo2,Updates,CreateBy)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, txtSpName.getText());
                    p.setString(2, txtSpNameEng.getText());
                    p.setString(3, Sex);
                    p.setString(4, txtMobile.getText());
                    p.setString(5, txtEmail.getText());
                    p.setString(6, txtStreet.getText());
                    p.setString(7, VL.get(Vill).toString());
                    p.setString(8, DS.get(Dis).toString());
                    p.setString(9, pv.get(Pro).toString());
                    p.setString(10, txtCompany.getText());
                    p.setString(11, txtBank1.getText());
                    p.setString(12, txtAccNo1.getText());
                    p.setString(13, txtBank2.getText());
                    p.setString(14, txtAccNo2.getText());
                    p.setString(15, date);
                    p.setString(16, txtUser.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.WARNING_MESSAGE;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                }
            }else{
                if(txtID.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    return;
                }
                int Dis =cmbDistrict.getSelectedIndex();
                int Pro =cmbProvince.getSelectedIndex();
                int Vill =cmbVillages.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to Edit ?","Edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="Update Suppliers set SupName=?,SupNameEng=?,sex=?,Phone=?,Email=?,Street=?,VID=?,DistID=?,ProvID=?,Company=?,Bank1=?,AccNo1=?,Bank2=?,AccNo2=?,Updates=?,CreateBy=? where SupID=?";
                    PreparedStatement p = conn.prepareStatement(sql);
                    p.setString(1, txtSpName.getText());
                    p.setString(2, txtSpNameEng.getText());
                    p.setString(3, Sex);
                    p.setString(4, txtMobile.getText());
                    p.setString(5, txtEmail.getText());
                    p.setString(6, txtStreet.getText());
                    p.setString(7, VL.get(Vill).toString());
                    p.setString(8, DS.get(Dis).toString());
                    p.setString(9, pv.get(Pro).toString());
                    p.setString(10, txtCompany.getText());
                    p.setString(11, txtBank1.getText());
                    p.setString(12, txtAccNo1.getText());
                    p.setString(13, txtBank2.getText());
                    p.setString(14, txtAccNo2.getText());
                    p.setString(15, date);
                    p.setString(16, txtUser.getText());
                    p.setString(17, txtID.getText());
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        SearchData();
        radioSelected();
    }//GEN-LAST:event_btnSearchActionPerformed

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
                sql="Delete from Suppliers where SupID=?";
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
                    txtID.setText(rsAll.getString("SupID"));
                    txtSpName.setText(rsAll.getString("SupName"));
                    txtSpNameEng.setText(rsAll.getString("SupNameEng"));
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
                    txtMobile.setText(rsAll.getString("Phone"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillages.setSelectedItem(rsAll.getString("Village"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtpDate.setDate(rsAll.getDate("Updates"));
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
                    txtID.setText(rsAll.getString("SupID"));
                    txtSpName.setText(rsAll.getString("SupName"));
                    txtSpNameEng.setText(rsAll.getString("SupNameEng"));
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
                    txtMobile.setText(rsAll.getString("Phone"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillages.setSelectedItem(rsAll.getString("Village"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtpDate.setDate(rsAll.getDate("Updates"));
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
                    txtID.setText(rsAll.getString("SupID"));
                    txtSpName.setText(rsAll.getString("SupName"));
                    txtSpNameEng.setText(rsAll.getString("SupNameEng"));
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
                    txtMobile.setText(rsAll.getString("Phone"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillages.setSelectedItem(rsAll.getString("Village"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtpDate.setDate(rsAll.getDate("Updates"));
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
                    txtID.setText(rsAll.getString("SupID"));
                    txtSpName.setText(rsAll.getString("SupName"));
                    txtSpNameEng.setText(rsAll.getString("SupNameEng"));
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
                    txtMobile.setText(rsAll.getString("Phone"));
                    txtEmail.setText(rsAll.getString("Email"));
                    txtStreet.setText(rsAll.getString("Street"));
                    cmbProvince.setSelectedItem(rsAll.getString("ProvName"));
                    cmbDistrict.setSelectedItem(rsAll.getString("DistName"));
                    cmbVillages.setSelectedItem(rsAll.getString("Village"));
                    txtCompany.setText(rsAll.getString("Company"));
                    txtBank1.setText(rsAll.getString("Bank1"));
                    txtAccNo1.setText(rsAll.getString("AccNo1"));
                    txtBank2.setText(rsAll.getString("Bank2"));
                    txtAccNo2.setText(rsAll.getString("AccNo2"));
                    dtpDate.setDate(rsAll.getDate("Updates"));
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
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnVillage_in_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVillage_in_SupplierActionPerformed
        frmVillage e = new frmVillage();
        e.setVisible(true);
    }//GEN-LAST:event_btnVillage_in_SupplierActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Provinces();
        cmbProvince.setSelectedItem(null);
    }//GEN-LAST:event_formInternalFrameOpened

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_Account1;
    private javax.swing.JLabel Lb_Account2;
    private javax.swing.JLabel Lb_Bank1;
    private javax.swing.JLabel Lb_Bank2;
    private javax.swing.JLabel Lb_Company;
    private javax.swing.JLabel Lb_CreateBy;
    private javax.swing.JLabel Lb_District;
    private javax.swing.JLabel Lb_Email;
    private javax.swing.JLabel Lb_ID;
    private javax.swing.JLabel Lb_Mobile;
    private javax.swing.JLabel Lb_Province;
    private javax.swing.JLabel Lb_Street;
    private javax.swing.JLabel Lb_SupplierEn;
    private javax.swing.JLabel Lb_SupplierLao;
    private javax.swing.JLabel Lb_Update;
    private javax.swing.JLabel Lb_Village;
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
    private javax.swing.JButton btnVillage_in_Supplier;
    private javax.swing.JComboBox<String> cmbDistrict;
    private javax.swing.JComboBox<String> cmbProvince;
    private javax.swing.JComboBox<String> cmbVillages;
    private com.toedter.calendar.JDateChooser dtpDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAccNo1;
    private javax.swing.JTextField txtAccNo2;
    private javax.swing.JTextField txtBank1;
    private javax.swing.JTextField txtBank2;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpName;
    private javax.swing.JTextField txtSpNameEng;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
