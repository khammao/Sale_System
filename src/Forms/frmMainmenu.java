

package Forms;

import static Forms.ChangeLanguage.LangType;
import static Forms.ChangeLanguage.getLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class frmMainmenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMainmenu
     */
   

    private String Acc;
    private String Per;
    public frmMainmenu() {
//        this.setUndecorated(true);
//      // this.setAlwaysOnTop(true);
//        this.setResizable(false);
//        this.setVisible(true);
        initComponents();
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize=(int) tk.getScreenSize().getWidth();
//        int ysize=(int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
        
        Acc=frmLogin.user_name.toString();
        LB_Account.setText(Acc);
        Per=frmLogin.permission.toString();
        LB_Permission.setText(Per);

       
// Create class Start datetime
        final DateFormat timeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Date date = new Date();
                String time = timeFormat.format(date);
                LB_Date.setText(time);
            }
        };
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
        try {
            ImageIcon icon = new ImageIcon("src/Icon/Backgroud.png");
            JLabel label = new JLabel(icon);
            label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());

            jDesktopPane1.add(label, new Integer(Integer.MIN_VALUE));
         
        } catch(Exception e) {
            System.out.println(e);
        }
      // LangType="Lao";
    }
    public void showLang(){
         try {
             frmLogin f =new frmLogin(this, rootPaneCheckingEnabled);
             if(f.RadLao.isSelected()==true){
                LangType="Lao";
             }else if(f.RadEng.isSelected()==true) {
                LangType="Eng";
             }
             //Lb_Programe_Title.setText(getLabel("Lb_Programe_Title"));
            jTaskPaneGroup1.setText(getLabel("jTaskPaneGroup1"));
            jTaskPaneGroup2.setText(getLabel("jTaskPaneGroup2"));
            jTaskPaneGroup3.setText(getLabel("jTaskPaneGroup3"));
            jTaskPaneGroup4.setText(getLabel("jTaskPaneGroup4"));
            Lb_Sales.setText(getLabel("Lb_Sales"));
            Lb_Edit_Sales.setText(getLabel("Lb_Edit_Sales"));
            Lb_Payment.setText(getLabel("Lb_Payment"));
            Lb_Close_Maney.setText(getLabel("Lb_Close_Maney"));
            Lb_Group.setText(getLabel("Lb_Group"));
            Lb_Cat.setText(getLabel("Lb_Cat"));
            Lb_Products.setText(getLabel("Lb_Products"));
            Lb_Unit.setText(getLabel("Lb_Unit"));
            Lb_Supplier.setText(getLabel("Lb_Supplier"));
            Lb_Employee.setText(getLabel("Lb_Employee"));
            Lb_Store.setText(getLabel("Lb_Store"));
            Lb_Customers.setText(getLabel("Lb_Customers"));
            Lb_Provinces.setText(getLabel("Lb_Provinces"));
            Lb_Districts.setText(getLabel("Lb_Districts"));
            Lb_Villages.setText(getLabel("Lb_Villages"));
            Lb_Promission.setText(getLabel("Lb_Promission"));
            Lb_Setting.setText(getLabel("Lb_Setting"));
            Lb_Close.setText(getLabel("Lb_Close"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        Lb_Sales = new com.xzq.osc.JocHyperlink();
        Lb_Edit_Sales = new com.xzq.osc.JocHyperlink();
        Lb_Payment = new com.xzq.osc.JocHyperlink();
        Lb_Close_Maney = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink8 = new com.xzq.osc.JocHyperlink();
        jocHyperlink13 = new com.xzq.osc.JocHyperlink();
        jocHyperlink7 = new com.xzq.osc.JocHyperlink();
        jocHyperlink9 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink10 = new com.xzq.osc.JocHyperlink();
        jocHyperlink12 = new com.xzq.osc.JocHyperlink();
        jocHyperlink11 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup4 = new com.l2fprod.common.swing.JTaskPaneGroup();
        Lb_Group = new com.xzq.osc.JocHyperlink();
        Lb_Cat = new com.xzq.osc.JocHyperlink();
        Lb_Products = new com.xzq.osc.JocHyperlink();
        Lb_Unit = new com.xzq.osc.JocHyperlink();
        Lb_Supplier = new com.xzq.osc.JocHyperlink();
        Lb_Employee = new com.xzq.osc.JocHyperlink();
        Lb_Store = new com.xzq.osc.JocHyperlink();
        Lb_Customers = new com.xzq.osc.JocHyperlink();
        Lb_Provinces = new com.xzq.osc.JocHyperlink();
        Lb_Districts = new com.xzq.osc.JocHyperlink();
        Lb_Villages = new com.xzq.osc.JocHyperlink();
        Lb_Promission = new com.xzq.osc.JocHyperlink();
        Lb_Setting = new com.xzq.osc.JocHyperlink();
        Lb_Close = new com.xzq.osc.JocHyperlink();
        LB_Account = new javax.swing.JLabel();
        LB_Permission = new javax.swing.JLabel();
        LB_Date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 5));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(229, 701));

        jScrollPane1.setToolTipText("");

        jTaskPaneGroup1.setExpanded(false);
        jTaskPaneGroup1.setTitle("ການຂາຍ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        Lb_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        Lb_Sales.setText("ການຂາຍ");
        Lb_Sales.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_SalesActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(Lb_Sales);

        Lb_Edit_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit-9-xxl.png"))); // NOI18N
        Lb_Edit_Sales.setText("ແກ້ໄຂການຂາຍ");
        Lb_Edit_Sales.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Edit_Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(Lb_Edit_Sales);

        Lb_Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/salary-icon-17.png"))); // NOI18N
        Lb_Payment.setText("ການສຳລະເງິນ");
        Lb_Payment.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Payment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(Lb_Payment);

        Lb_Close_Maney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-service3.png"))); // NOI18N
        Lb_Close_Maney.setText("ປີດເງິນສົດ");
        Lb_Close_Maney.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Close_Maney.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(Lb_Close_Maney);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup2.setExpanded(false);
        jTaskPaneGroup2.setTitle("ຂໍ້ມູນສິນຄ້າ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink8.setText("ສັ່ງສິນຄ້າ");
        jocHyperlink8.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink8);

        jocHyperlink13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink13.setText("ຮັບສິນຄ້າ");
        jocHyperlink13.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink13);

        jocHyperlink7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/asda.png"))); // NOI18N
        jocHyperlink7.setText("Adjust");
        jocHyperlink7.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink7);

        jocHyperlink9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/preferences_settings_tools-512.png"))); // NOI18N
        jocHyperlink9.setText("ການຕັ້ງຄ່າ");
        jocHyperlink9.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink9);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup3.setExpanded(false);
        jTaskPaneGroup3.setTitle("ລາຍງານ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        jocHyperlink10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/asda.png"))); // NOI18N
        jocHyperlink10.setText("ສິນຄ້າໃນສາງ");
        jocHyperlink10.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink10);

        jocHyperlink12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/newsletter-icon.png"))); // NOI18N
        jocHyperlink12.setText("ປະເພດສິນຄ້າ");
        jocHyperlink12.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink12);

        jocHyperlink11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/report-icon-blue_247217.png"))); // NOI18N
        jocHyperlink11.setText("ກຸ່ມສິນຄ້າ");
        jocHyperlink11.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jocHyperlink11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink11);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setTitle("ຈັດການລະບົບ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        Lb_Group.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cube.png"))); // NOI18N
        Lb_Group.setText("ກຸ່ມສິນຄ້າ");
        Lb_Group.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Group.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_GroupActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Group);

        Lb_Cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        Lb_Cat.setText("ປະເພດສິນຄ້າ");
        Lb_Cat.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Cat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_CatActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Cat);

        Lb_Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product-review.png"))); // NOI18N
        Lb_Products.setText("ລາຍການສິນຄ້າ");
        Lb_Products.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Products.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_ProductsActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Products);

        Lb_Unit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        Lb_Unit.setText("ຫົວໜ່ວຍສິນຄ້າ");
        Lb_Unit.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Unit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_UnitActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Unit);

        Lb_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_inventory.png"))); // NOI18N
        Lb_Supplier.setText("ຜູ້ສະໜອງ");
        Lb_Supplier.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_SupplierActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Supplier);

        Lb_Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        Lb_Employee.setText("ພະນັກງານ");
        Lb_Employee.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Employee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_EmployeeActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Employee);

        Lb_Store.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house-xxl.png"))); // NOI18N
        Lb_Store.setText("ຂໍ້ມູນຮ້ານ");
        Lb_Store.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Store.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_StoreActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Store);

        Lb_Customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-multi_users-blue.png"))); // NOI18N
        Lb_Customers.setText("ລູກຄ້າ");
        Lb_Customers.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Customers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_CustomersActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Customers);

        Lb_Provinces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/church-xxl.png"))); // NOI18N
        Lb_Provinces.setText("ແຂວງ");
        Lb_Provinces.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Provinces.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Provinces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_ProvincesActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Provinces);

        Lb_Districts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/may_-_how_to_get_rid_of_ants_in_the_house.png"))); // NOI18N
        Lb_Districts.setText("ເມືອງ");
        Lb_Districts.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Districts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Districts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_DistrictsActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Districts);

        Lb_Villages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house-xxl.png"))); // NOI18N
        Lb_Villages.setText("ບ້ານ");
        Lb_Villages.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Villages.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Villages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_VillagesActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Villages);

        Lb_Promission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user-permissions.png"))); // NOI18N
        Lb_Promission.setText("ສິດທິການໃຊ້ງານ");
        Lb_Promission.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Promission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(Lb_Promission);

        Lb_Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/settings-9-xxl.png"))); // NOI18N
        Lb_Setting.setText("ຕັ້ງຄ່າລະບົບ");
        Lb_Setting.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Setting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(Lb_Setting);

        Lb_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/switch-512.png"))); // NOI18N
        Lb_Close.setText("ອອກຈາກລະບົບ");
        Lb_Close.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        Lb_Close.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lb_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lb_CloseActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(Lb_Close);

        jTaskPane1.add(jTaskPaneGroup4);

        jScrollPane1.setViewportView(jTaskPane1);

        LB_Account.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        LB_Account.setForeground(new java.awt.Color(51, 102, 255));
        LB_Account.setText("UserLogin");

        LB_Permission.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        LB_Permission.setForeground(new java.awt.Color(51, 102, 255));
        LB_Permission.setText("Permission");

        LB_Date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LB_Date.setForeground(new java.awt.Color(255, 51, 102));
        LB_Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Date.setText("Datetime");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_Account, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LB_Permission, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(LB_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_Permission)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_Date)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lb_GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_GroupActionPerformed
        frmProductGroup e = new frmProductGroup();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_GroupActionPerformed

    private void Lb_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_CatActionPerformed
        frmCategory e = new frmCategory();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_CatActionPerformed

    private void Lb_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_ProductsActionPerformed
        frmProducts e = new frmProducts();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_ProductsActionPerformed

    private void Lb_UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_UnitActionPerformed
        frmUnit e = new frmUnit();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_UnitActionPerformed

    private void Lb_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_SupplierActionPerformed
        frmSuppliers e = new frmSuppliers();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_SupplierActionPerformed

    private void Lb_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_EmployeeActionPerformed
        frmEmplyee e = new frmEmplyee();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_EmployeeActionPerformed

    private void Lb_ProvincesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_ProvincesActionPerformed
        frmProvince e = new frmProvince();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_ProvincesActionPerformed

    private void Lb_DistrictsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_DistrictsActionPerformed
        frmDistrict e = new frmDistrict();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_DistrictsActionPerformed

    private void Lb_VillagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_VillagesActionPerformed
        frmVillage e = new frmVillage();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_VillagesActionPerformed

    private void Lb_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_CloseActionPerformed
        int reply= JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Close?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(reply == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_Lb_CloseActionPerformed
 private BufferedImage ResizeSccall(Image im, int w, int h){
        try {
            BufferedImage buff = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = buff.createGraphics();
            g.drawImage(im, 0, 0, w, h, null);
            g.dispose();
            return buff;
            
        } catch (Exception e) {
        }
        return null;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            
//            Image im = new ImageIcon("src/icon/FlagLaos.jpg").getImage();
//            Image icon = ResizeSccall(im, lbimage.getWidth(), lbimage.getHeight());
//            lbimage.setIcon(new ImageIcon(icon));     
            showLang();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void Lb_SalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_SalesActionPerformed
//         frmTest e = new frmTest();
//        e.setVisible(true);
//        jDesktopPane1.add(e);
    }//GEN-LAST:event_Lb_SalesActionPerformed

    private void Lb_StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_StoreActionPerformed
        frmStore e = new frmStore();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_StoreActionPerformed

    private void Lb_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lb_CustomersActionPerformed
        frmCustomer e = new frmCustomer();
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_Lb_CustomersActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         int reply= JOptionPane.showConfirmDialog(null,"Are you sure close?","Close?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(reply == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(frmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainmenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Account;
    private javax.swing.JLabel LB_Date;
    private javax.swing.JLabel LB_Permission;
    private com.xzq.osc.JocHyperlink Lb_Cat;
    private com.xzq.osc.JocHyperlink Lb_Close;
    private com.xzq.osc.JocHyperlink Lb_Close_Maney;
    private com.xzq.osc.JocHyperlink Lb_Customers;
    private com.xzq.osc.JocHyperlink Lb_Districts;
    private com.xzq.osc.JocHyperlink Lb_Edit_Sales;
    private com.xzq.osc.JocHyperlink Lb_Employee;
    private com.xzq.osc.JocHyperlink Lb_Group;
    private com.xzq.osc.JocHyperlink Lb_Payment;
    private com.xzq.osc.JocHyperlink Lb_Products;
    private com.xzq.osc.JocHyperlink Lb_Promission;
    private com.xzq.osc.JocHyperlink Lb_Provinces;
    private com.xzq.osc.JocHyperlink Lb_Sales;
    private com.xzq.osc.JocHyperlink Lb_Setting;
    private com.xzq.osc.JocHyperlink Lb_Store;
    private com.xzq.osc.JocHyperlink Lb_Supplier;
    private com.xzq.osc.JocHyperlink Lb_Unit;
    private com.xzq.osc.JocHyperlink Lb_Villages;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.xzq.osc.JocHyperlink jocHyperlink10;
    private com.xzq.osc.JocHyperlink jocHyperlink11;
    private com.xzq.osc.JocHyperlink jocHyperlink12;
    private com.xzq.osc.JocHyperlink jocHyperlink13;
    private com.xzq.osc.JocHyperlink jocHyperlink7;
    private com.xzq.osc.JocHyperlink jocHyperlink8;
    private com.xzq.osc.JocHyperlink jocHyperlink9;
    // End of variables declaration//GEN-END:variables
}
