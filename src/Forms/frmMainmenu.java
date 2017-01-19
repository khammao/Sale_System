

package Forms;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmMainmenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMainmenu
     */
    public frmMainmenu() {
         this.setUndecorated(true);
       //this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize=(int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jPanel5 = new javax.swing.JPanel();
        lbimage = new javax.swing.JLabel();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink1 = new com.xzq.osc.JocHyperlink();
        jocHyperlink2 = new com.xzq.osc.JocHyperlink();
        jocHyperlink3 = new com.xzq.osc.JocHyperlink();
        jocHyperlink4 = new com.xzq.osc.JocHyperlink();
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
        jocHyperlink14 = new com.xzq.osc.JocHyperlink();
        jocHyperlink15 = new com.xzq.osc.JocHyperlink();
        jocHyperlink16 = new com.xzq.osc.JocHyperlink();
        jocHyperlink21 = new com.xzq.osc.JocHyperlink();
        jocHyperlink17 = new com.xzq.osc.JocHyperlink();
        jocHyperlink18 = new com.xzq.osc.JocHyperlink();
        jocHyperlink19 = new com.xzq.osc.JocHyperlink();
        jocHyperlink6 = new com.xzq.osc.JocHyperlink();
        jocHyperlink23 = new com.xzq.osc.JocHyperlink();
        jocHyperlink24 = new com.xzq.osc.JocHyperlink();
        jocHyperlink25 = new com.xzq.osc.JocHyperlink();
        jocHyperlink20 = new com.xzq.osc.JocHyperlink();
        jocHyperlink22 = new com.xzq.osc.JocHyperlink();
        btnExit = new com.xzq.osc.JocHyperlink();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204), 5));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setToolTipText("");

        lbimage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbimage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbimage, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbimage, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jTaskPane1.add(jPanel5);

        jTaskPaneGroup1.setTitle("ການຂາຍ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 20)); // NOI18N

        jocHyperlink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink1.setText("ການຂາຍ");
        jocHyperlink1.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink1ActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(jocHyperlink1);

        jocHyperlink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit-9-xxl.png"))); // NOI18N
        jocHyperlink2.setText("ແກ້ໄຂການຂາຍ");
        jocHyperlink2.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink2);

        jocHyperlink3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/salary-icon-17.png"))); // NOI18N
        jocHyperlink3.setText("ການສຳລະເງິນ");
        jocHyperlink3.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink3);

        jocHyperlink4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-service3.png"))); // NOI18N
        jocHyperlink4.setText("ປີດເງິນສົດ");
        jocHyperlink4.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink4);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup2.setExpanded(false);
        jTaskPaneGroup2.setTitle("ບໍລິການ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 20)); // NOI18N

        jocHyperlink8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink8.setText("ສັ່ງສິນຄ້າ");
        jocHyperlink8.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink8);

        jocHyperlink13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink13.setText("ຮັບສິນຄ້າ");
        jocHyperlink13.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink13);

        jocHyperlink7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/asda.png"))); // NOI18N
        jocHyperlink7.setText("Adjust");
        jocHyperlink7.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink7);

        jocHyperlink9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/preferences_settings_tools-512.png"))); // NOI18N
        jocHyperlink9.setText("ການຕັ້ງຄ່າ");
        jocHyperlink9.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink9);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup3.setExpanded(false);
        jTaskPaneGroup3.setTitle("ລາຍງານ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 20)); // NOI18N

        jocHyperlink10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/asda.png"))); // NOI18N
        jocHyperlink10.setText("ສິນຄ້າໃນສາງ");
        jocHyperlink10.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink10);

        jocHyperlink12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/newsletter-icon.png"))); // NOI18N
        jocHyperlink12.setText("ປະເພດສິນຄ້າ");
        jocHyperlink12.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink12);

        jocHyperlink11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/report-icon-blue_247217.png"))); // NOI18N
        jocHyperlink11.setText("ກຸ່ມສິນຄ້າ");
        jocHyperlink11.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink11);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setExpanded(false);
        jTaskPaneGroup4.setTitle("ຈັດການລະບົບ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 20)); // NOI18N

        jocHyperlink14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cube.png"))); // NOI18N
        jocHyperlink14.setText("ກຸ່ມສິນຄ້າ");
        jocHyperlink14.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink14ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink14);

        jocHyperlink15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink15.setText("ປະເພດສິນຄ້າ");
        jocHyperlink15.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink15ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink15);

        jocHyperlink16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product-review.png"))); // NOI18N
        jocHyperlink16.setText("ລາຍການສິນຄ້າ");
        jocHyperlink16.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink16ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink16);

        jocHyperlink21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        jocHyperlink21.setText("ຫົວໜ່ວຍສິນຄ້າ");
        jocHyperlink21.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink21ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink21);

        jocHyperlink17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_inventory.png"))); // NOI18N
        jocHyperlink17.setText("ຜູ້ສະໜອງ");
        jocHyperlink17.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink17ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink17);

        jocHyperlink18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        jocHyperlink18.setText("ພະນັກງານ");
        jocHyperlink18.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink18ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink18);

        jocHyperlink19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house-xxl.png"))); // NOI18N
        jocHyperlink19.setText("ຂໍ້ມູນຮ້ານ");
        jocHyperlink19.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink19);

        jocHyperlink6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-multi_users-blue.png"))); // NOI18N
        jocHyperlink6.setText("ລູກຄ້າ");
        jocHyperlink6.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink6);

        jocHyperlink23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/church-xxl.png"))); // NOI18N
        jocHyperlink23.setText("ແຂວງ");
        jocHyperlink23.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink23ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink23);

        jocHyperlink24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/may_-_how_to_get_rid_of_ants_in_the_house.png"))); // NOI18N
        jocHyperlink24.setText("ເມືອງ");
        jocHyperlink24.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink24ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink24);

        jocHyperlink25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house-xxl.png"))); // NOI18N
        jocHyperlink25.setText("ບ້ານ");
        jocHyperlink25.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink25ActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(jocHyperlink25);

        jocHyperlink20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user-permissions.png"))); // NOI18N
        jocHyperlink20.setText("ສິດທິການໃຊ້ງານ");
        jocHyperlink20.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink20);

        jocHyperlink22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/settings-9-xxl.png"))); // NOI18N
        jocHyperlink22.setText("ຕັ້ງຄ່າລະບົບ");
        jocHyperlink22.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        jocHyperlink22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink22);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/switch-512.png"))); // NOI18N
        btnExit.setText("ອອກຈາກລະບົບ");
        btnExit.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jTaskPaneGroup4.getContentPane().add(btnExit);

        jTaskPane1.add(jTaskPaneGroup4);

        jScrollPane1.setViewportView(jTaskPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N

        jMenu1.setText("Sale Management");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("------------------------->");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jocHyperlink14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink14ActionPerformed
        frmProductGroup e = new frmProductGroup();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink14ActionPerformed

    private void jocHyperlink15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink15ActionPerformed
        frmCategory e = new frmCategory();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink15ActionPerformed

    private void jocHyperlink16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink16ActionPerformed
        frmProducts e = new frmProducts();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink16ActionPerformed

    private void jocHyperlink21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink21ActionPerformed
        frmUnit e = new frmUnit();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink21ActionPerformed

    private void jocHyperlink17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink17ActionPerformed
        frmSuppliers e = new frmSuppliers();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink17ActionPerformed

    private void jocHyperlink18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink18ActionPerformed
        frmEmplyee e = new frmEmplyee();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink18ActionPerformed

    private void jocHyperlink23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink23ActionPerformed
        frmProvince e = new frmProvince();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink23ActionPerformed

    private void jocHyperlink24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink24ActionPerformed
        frmDistrict e = new frmDistrict();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink24ActionPerformed

    private void jocHyperlink25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink25ActionPerformed
        frmVillage e = new frmVillage();
        e.setVisible(true);
        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink25ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int reply= JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Close?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(reply == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed
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

            Image im = new ImageIcon("src/icon/FlagLaos.jpg").getImage();
            Image icon = ResizeSccall(im, lbimage.getWidth(), lbimage.getHeight());
            lbimage.setIcon(new ImageIcon(icon));     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jocHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink1ActionPerformed
//         frmTest e = new frmTest();
//        e.setVisible(true);
//        jDesktopPane1.add(e);
    }//GEN-LAST:event_jocHyperlink1ActionPerformed

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
    private com.xzq.osc.JocHyperlink btnExit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.xzq.osc.JocHyperlink jocHyperlink1;
    private com.xzq.osc.JocHyperlink jocHyperlink10;
    private com.xzq.osc.JocHyperlink jocHyperlink11;
    private com.xzq.osc.JocHyperlink jocHyperlink12;
    private com.xzq.osc.JocHyperlink jocHyperlink13;
    private com.xzq.osc.JocHyperlink jocHyperlink14;
    private com.xzq.osc.JocHyperlink jocHyperlink15;
    private com.xzq.osc.JocHyperlink jocHyperlink16;
    private com.xzq.osc.JocHyperlink jocHyperlink17;
    private com.xzq.osc.JocHyperlink jocHyperlink18;
    private com.xzq.osc.JocHyperlink jocHyperlink19;
    private com.xzq.osc.JocHyperlink jocHyperlink2;
    private com.xzq.osc.JocHyperlink jocHyperlink20;
    private com.xzq.osc.JocHyperlink jocHyperlink21;
    private com.xzq.osc.JocHyperlink jocHyperlink22;
    private com.xzq.osc.JocHyperlink jocHyperlink23;
    private com.xzq.osc.JocHyperlink jocHyperlink24;
    private com.xzq.osc.JocHyperlink jocHyperlink25;
    private com.xzq.osc.JocHyperlink jocHyperlink3;
    private com.xzq.osc.JocHyperlink jocHyperlink4;
    private com.xzq.osc.JocHyperlink jocHyperlink6;
    private com.xzq.osc.JocHyperlink jocHyperlink7;
    private com.xzq.osc.JocHyperlink jocHyperlink8;
    private com.xzq.osc.JocHyperlink jocHyperlink9;
    private javax.swing.JLabel lbimage;
    // End of variables declaration//GEN-END:variables
}
