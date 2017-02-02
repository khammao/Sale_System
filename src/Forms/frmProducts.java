
package Forms;

import static Forms.ChangeLanguage.getLabel;
import com.placeholder.PlaceHolder;
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
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class frmProducts extends javax.swing.JInternalFrame {
    Connection con=ConnectDB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    ArrayList cat = new ArrayList();
    ArrayList un = new ArrayList();
    public frmProducts() {
        initComponents();
        PlaceHolder txt1 = new PlaceHolder(txtSearch,"Please! enter SKU or product name");
         model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.PLAIN, 12));
        Lb_Barcode.setText(getLabel("Lb_Barcode"));
        Lb_ProductName.setText(getLabel("Lb_ProductName"));
        Lb_ProductNameEn.setText(getLabel("Lb_ProductNameEn"));
        Lb_UnitName.setText(getLabel("Lb_UnitName"));
        Lb_Cost.setText(getLabel("Lb_Cost"));
        Lb_LAK.setText(getLabel("Lb_LAK"));
        Lb_Tax.setText(getLabel("Lb_Tax"));
        Lb_Margin.setText(getLabel("Lb_Margin"));
        Lb_PriceA.setText(getLabel("Lb_PriceA"));
        Lb_PriceB.setText(getLabel("Lb_PriceB"));
        Lb_PriceC.setText(getLabel("Lb_PriceC"));
        Lb_Category.setText(getLabel("Lb_Category"));
        Lb_Update.setText(getLabel("Lb_Update"));
        Lb_CreateBy.setText(getLabel("Lb_CreateBy"));
        btnNew.setText(getLabel("btnNew"));
        btnSave.setText(getLabel("btnSave"));
        btnDelete.setText(getLabel("btnDelete"));
        btnExit.setText(getLabel("btnExit"));
        chShowData.setText(getLabel("chShowData"));
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
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        Lb_Barcode = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Lb_ProductName = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtbar = new javax.swing.JTextField();
        txtProductEng = new javax.swing.JTextField();
        Lb_ProductNameEn = new javax.swing.JLabel();
        Lb_UnitName = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox<String>();
        Lb_Cost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        Lb_LAK = new javax.swing.JLabel();
        Lb_Tax = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        Lb_Margin = new javax.swing.JLabel();
        txtMargin = new javax.swing.JTextField();
        Lb_PriceA = new javax.swing.JLabel();
        txtPriceA = new javax.swing.JTextField();
        Lb_PriceB = new javax.swing.JLabel();
        txtPriceB = new javax.swing.JTextField();
        Lb_PriceC = new javax.swing.JLabel();
        txtPriceC = new javax.swing.JTextField();
        cmbCate = new javax.swing.JComboBox<String>();
        Lb_Category = new javax.swing.JLabel();
        Lb_Update = new javax.swing.JLabel();
        dtpDate = new com.toedter.calendar.JDateChooser();
        txtUser = new javax.swing.JTextField();
        Lb_CreateBy = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        chShowData = new javax.swing.JCheckBox();
        btnExit1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnNew.setText("ເພີ່ມໃໝ່");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnNew);

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

        btnExit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/switch-512.png"))); // NOI18N
        btnExit.setText("ອອກ");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel5.add(btnExit);

        Lb_Barcode.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Barcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Barcode.setText("Barcode:");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID.setEnabled(false);

        Lb_ProductName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_ProductName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_ProductName.setText("ຊື່ສິນຄ້າ:");

        txtProduct.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtbar.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtProductEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_ProductNameEn.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_ProductNameEn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_ProductNameEn.setText("ຊື່ສິນຄ້າ Eng:");

        Lb_UnitName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_UnitName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_UnitName.setText("ຫົວໜ່ວຍ:");

        cmbUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUnitMouseClicked(evt);
            }
        });

        Lb_Cost.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Cost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Cost.setText("ລາຄາຊື້:");

        txtCost.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Lb_LAK.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_LAK.setText("ກີບ");

        Lb_Tax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Tax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Tax.setText("ພາສີ:");

        txtTax.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Lb_Margin.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Margin.setText("ອັດຕາກຳໄລ:");

        txtMargin.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtMargin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Lb_PriceA.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_PriceA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_PriceA.setText("ລາຄາຂາຍ A:");

        txtPriceA.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPriceA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Lb_PriceB.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_PriceB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_PriceB.setText("ລາຄາຂາຍ B:");

        txtPriceB.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPriceB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Lb_PriceC.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_PriceC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_PriceC.setText("ລາຄາຂາຍ C:");

        txtPriceC.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPriceC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cmbCate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCateMouseClicked(evt);
            }
        });

        Lb_Category.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Category.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Category.setText("ປະເພດ:");

        Lb_Update.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_Update.setText("ວັນທີປັບປຸງ:");

        dtpDate.setDateFormatString("yyyy-MM-dd");
        dtpDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        Lb_CreateBy.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_CreateBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lb_CreateBy.setText("ຜູ້ປັບປຸງ:");

        jLabel11.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel11.setText("%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lb_ProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lb_ProductNameEn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_UnitName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductEng, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Lb_LAK, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_PriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_PriceC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtPriceC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cmbCate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lb_Tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_PriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(Lb_Margin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtMargin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Lb_Barcode)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Lb_UnitName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductEng, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_ProductNameEn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_LAK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Margin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMargin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_PriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_PriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_PriceC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_CreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 102), 2, true));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "LbT_ID", "LbT_Barcode", "LbT_ProductNameLao", "LbT_ProductNameEn", "LbT_Unit", "LbT_Cost", "LbT_Tax", "LbT_Margin", "LbT_PriceA", "LbT_PriceB", "LbT_PriceC", "LbT_CateName", "LbT_Updates", "LbT_CreateBy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(150);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        chShowData.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        chShowData.setText("ສະແດງຂໍ້ມູນ");
        chShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chShowDataActionPerformed(evt);
            }
        });

        btnExit1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnExit1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chShowData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chShowData)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        ClearText();
        EnableEditText();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            if(txtID.getText().equals("Auto")){
                if(txtbar.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int c = cmbCate.getSelectedIndex();
                int u = cmbUnit.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to save?","Save",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="insert into Products(SKU,ProName,ProNameEng,UnitID,Stdcost,Tax,margin,Price,Price1,Price2,CatID,Updates,CreateBy)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtbar.getText());
                    p.setString(2,txtProduct.getText());
                    p.setString(3,txtProductEng.getText());
                    p.setString(4,un.get(u).toString());
                    p.setFloat(5,Float.parseFloat(txtCost.getText()));
                    p.setFloat(6,Float.parseFloat(txtTax.getText()));
                    p.setFloat(7,Float.parseFloat(txtMargin.getText()));
                    p.setFloat(8,Float.parseFloat(txtPriceA.getText()));
                    p.setFloat(9,Float.parseFloat(txtPriceB.getText()));
                    p.setFloat(10,Float.parseFloat(txtPriceC.getText()));
                    p.setString(11,cat.get(c).toString());
                    p.setString(12,date);
                    p.setString(13,txtUser.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.OK_OPTION;
                        String a = "Finished";
                        String b = "Save";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                ClearText();
                ShowData();
                }
            }else{
                if(txtbar.getText().equals("")){
                    int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Please check your data again.";
                    String b = "Error";
                    JOptionPane.showMessageDialog(null,a, b,type);
                    return;
                }
                int c = cmbCate.getSelectedIndex();
                int u = cmbUnit.getSelectedIndex();
                if(JOptionPane.showConfirmDialog(null,"Do you like to edit?","Edit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = (String) df.format(dtpDate.getDate());
                    sql="Update Products set SKU=?,ProName=?,ProNameEng=?,UnitID=?,Stdcost=?,Tax=?,margin=?,Price=?,Price1=?,Price2=?,CatID=?,Updates=?,CreateBy=? where ProID=(?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1,txtbar.getText());
                    p.setString(2,txtProduct.getText());
                    p.setString(3,txtProductEng.getText());
                    p.setString(4,un.get(u).toString());
                    p.setFloat(5,Float.parseFloat(txtCost.getText()));
                    p.setFloat(6,Float.parseFloat(txtTax.getText()));
                    p.setFloat(7,Float.parseFloat(txtMargin.getText()));
                    p.setFloat(8,Float.parseFloat(txtPriceA.getText()));
                    p.setFloat(9,Float.parseFloat(txtPriceB.getText()));
                    p.setFloat(10,Float.parseFloat(txtPriceC.getText()));
                    p.setString(11,cat.get(c).toString());
                    p.setString(12,date);
                    p.setString(13,txtUser.getText());
                    p.setString(14,txtID.getText());
                    if(p.executeUpdate()!=-1){
                        int type = JOptionPane.OK_OPTION;
                        String a = "Finished";
                        String b = "Edit";
                        JOptionPane.showMessageDialog(null,a, b,type);
                    }
                    ClearText();
                    ShowData();
                 }
                }
        }catch(Exception e){
            //e.getMessage();
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            if(txtID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Please select your data.";
                String b = "Message";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Delete?","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                sql="Delete from Products where ProID=?";
                PreparedStatement p = con.prepareStatement(sql);
                p.setString(1,txtID.getText());
                if(p.executeUpdate()!=-1){
                   int type = JOptionPane.OK_OPTION;
                   String a = "Finished";
                   String b = "Message";
                   JOptionPane.showMessageDialog(null,a, b,type);
                }
                ClearText();
                ShowData();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try{
           // FilterData();
        }catch(Exception e){}
    }//GEN-LAST:event_btnExitActionPerformed

    private void cmbUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUnitMouseClicked
        ShowUint();
    }//GEN-LAST:event_cmbUnitMouseClicked

    private void cmbCateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCateMouseClicked
        ShowCate();
    }//GEN-LAST:event_cmbCateMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       DisableEditText();
       Date date = new Date();
        dtpDate.setDate(date);
    }//GEN-LAST:event_formInternalFrameOpened

    private void chShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chShowDataActionPerformed
       if(chShowData.isSelected()==true){
           ShowData();
       }else if(chShowData.isSelected()==false){
           model.setRowCount(0);
       }
    }//GEN-LAST:event_chShowDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            if(evt.getClickCount()==1){
                int index=jTable1.getSelectedRow();
                String id = jTable1.getValueAt(index, 0).toString();
                String bar = jTable1.getValueAt(index,1).toString();
                String name1 = jTable1.getValueAt(index,2).toString();
                String name2 = jTable1.getValueAt(index,3).toString();
                String u1 = jTable1.getValueAt(index,4).toString();
                String cost = jTable1.getValueAt(index,5).toString();
                String tax = jTable1.getValueAt(index,6).toString();
                String m = jTable1.getValueAt(index,7).toString();
                String pa = jTable1.getValueAt(index,8).toString();
                String pb = jTable1.getValueAt(index,9).toString();
                String pc = jTable1.getValueAt(index,10).toString();
                String cat = jTable1.getValueAt(index,11).toString();
                //String dt = jTable1.getValueAt(index,12).toString();
                String user = jTable1.getValueAt(index,13).toString();
                txtID.setText(id);
                txtbar.setText(bar);
                txtProduct.setText(name1);
                txtProductEng.setText(name2);
                cmbUnit.setSelectedItem(u1);
                txtCost.setText(cost);
                txtTax.setText(tax);
                txtMargin.setText(m);
                txtPriceA.setText(pa);
                txtPriceB.setText(pb);
                txtPriceC.setText(pc);
                cmbCate.setSelectedItem(cat);
                //dtpDate.setDateFormatString(dt);
                txtUser.setText(user);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        FilterData();
    }//GEN-LAST:event_btnExit1ActionPerformed
    public void ShowData(){
        try{
            int index = jTable1.getRowCount()-1;
            while(index > -1){
                model.removeRow(index--);
            }
            sql="Select * from vw_Product";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("ProID"));
                v.add(rs.getString("SKU"));
                v.add(rs.getString("ProName"));
                v.add(rs.getString("ProNameEng"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getFloat("Stdcost"));
                v.add(rs.getFloat("Tax"));
                v.add(rs.getFloat("margin"));
                v.add(rs.getFloat("Price"));
                v.add(rs.getFloat("Price1"));
                v.add(rs.getFloat("Price2"));
                v.add(rs.getString("CatName"));
                v.add(rs.getDate("Updates"));
                v.add(rs.getString("CreateBy"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        }catch(Exception p){}
    }
    public void FilterData(){
        try{
            int index = jTable1.getRowCount()-1;
            while(index > -1){
                model.removeRow(index--);
            }
            sql="Select * from vw_Product where SKU='"+ txtSearch.getText() +"' or ProName like N'%"+ txtSearch.getText() +"%' or ProNameEng like N'%"+ txtSearch.getText() +"%'";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("ProID"));
                v.add(rs.getString("SKU"));
                v.add(rs.getString("ProName"));
                v.add(rs.getString("ProNameEng"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getFloat("Stdcost"));
                v.add(rs.getFloat("Tax"));
                v.add(rs.getFloat("margin"));
                v.add(rs.getFloat("Price"));
                v.add(rs.getFloat("Price1"));
                v.add(rs.getFloat("Price2"));
                v.add(rs.getString("CatName"));
                v.add(rs.getDate("Updates"));
                v.add(rs.getString("CreateBy"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        }catch(Exception p){}
    }
    public void ShowCate(){
        try{
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select CatID, CatName from Categorys";
            mode.removeAllElements();
            cat.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                cat.add(rs.getString("CatID"));
                mode.addElement(rs.getString("CatName"));
            }
             cmbCate.setModel(mode);
        }catch(Exception e){}
    }
    public void ShowUint(){
        try{
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql="Select UnitID, UnitName from Unit";
            mode.removeAllElements();
            un.clear();
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){
                un.add(rs.getString("UnitID"));
                mode.addElement(rs.getString("UnitName"));
            }
             cmbUnit.setModel(mode);
        }catch(Exception e){}
    }
    public void EnableEditText(){
        txtbar.setEditable(true);
        txtProduct.setEditable(true);
        txtProductEng.setEditable(true);
        txtCost.setEditable(true);
        txtTax.setEditable(true);
        txtMargin.setEditable(true);
        txtPriceA.setEditable(true);
        txtPriceB.setEditable(true);
        txtPriceC.setEditable(true);
        txtUser.setEditable(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
        editor.setEditable(true);
    }
    public void DisableEditText(){
        txtbar.setEditable(false);
        txtProduct.setEditable(false);
        txtProductEng.setEditable(false);
        txtCost.setEditable(false);
        txtTax.setEditable(false);
        txtMargin.setEditable(false);
        txtPriceA.setEditable(false);
        txtPriceB.setEditable(false);
        txtPriceC.setEditable(false);
        txtUser.setEditable(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dtpDate.getDateEditor();
        editor.setEditable(false);
    }
    public void ClearText(){
        txtbar.setText("");
        txtProduct.setText("");
        txtProductEng.setText("");
        txtCost.setText("");
        txtTax.setText("");
        txtMargin.setText("");
        txtPriceA.setText("");
        txtPriceB.setText("");
        txtPriceC.setText("");
        txtUser.setText("");
        txtID.setText("Auto");
        Date date = new Date();
        dtpDate.setDate(date);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_Barcode;
    private javax.swing.JLabel Lb_Category;
    private javax.swing.JLabel Lb_Cost;
    private javax.swing.JLabel Lb_CreateBy;
    private javax.swing.JLabel Lb_LAK;
    private javax.swing.JLabel Lb_Margin;
    private javax.swing.JLabel Lb_PriceA;
    private javax.swing.JLabel Lb_PriceB;
    private javax.swing.JLabel Lb_PriceC;
    private javax.swing.JLabel Lb_ProductName;
    private javax.swing.JLabel Lb_ProductNameEn;
    private javax.swing.JLabel Lb_Tax;
    private javax.swing.JLabel Lb_UnitName;
    private javax.swing.JLabel Lb_Update;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chShowData;
    private javax.swing.JComboBox<String> cmbCate;
    private javax.swing.JComboBox<String> cmbUnit;
    private com.toedter.calendar.JDateChooser dtpDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMargin;
    private javax.swing.JTextField txtPriceA;
    private javax.swing.JTextField txtPriceB;
    private javax.swing.JTextField txtPriceC;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtProductEng;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtbar;
    // End of variables declaration//GEN-END:variables
}
