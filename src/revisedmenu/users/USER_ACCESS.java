
package revisedmenu.users;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import revisedmenu.OracleSqlConnect;




public class USER_ACCESS extends javax.swing.JInternalFrame {
String s_username, s_fullname, s_userlevel, s_ulvl, spassword, s_cpassword, s_department, s_dept, s_deptcode, s_dc, s_branch, usr_lvl, dept, dptcode,
       s_special, s_its, s_user_access, s_items, s_items_manila, s_del_rep, s_mem, s_pending;
 


    public USER_ACCESS() {
        initComponents();

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        full_name = new javax.swing.JTextField();
        user_level = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        c_password = new javax.swing.JPasswordField();
        dept_code = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sysad = new javax.swing.JCheckBox();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        user_name1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        full_name1 = new javax.swing.JTextField();
        user_level1 = new javax.swing.JComboBox<>();
        password1 = new javax.swing.JPasswordField();
        c_password1 = new javax.swing.JPasswordField();
        dept_code1 = new javax.swing.JComboBox<>();
        department1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        branch1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        spec = new javax.swing.JCheckBox();
        SAVE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        it_delivery_report = new javax.swing.JCheckBox();
        it_items = new javax.swing.JCheckBox();
        it_user_access = new javax.swing.JCheckBox();
        it_items_manila = new javax.swing.JCheckBox();
        it_del_info = new javax.swing.JCheckBox();
        it_pending_identity = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        CLOSE = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("USER'S ACCESS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USERS");

        user_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "USER", "SUPERVISOR", "ADMINISTRATOR" }));

        c_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_passwordActionPerformed(evt);
            }
        });

        dept_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "MANILA", "IOPS", "IMIN" }));
        dept_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_codeActionPerformed(evt);
            }
        });

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ACCOUNTING", "ADMIN SUPPORT", "CASHIER", "CHECK RELEASING", "DIGITAL", "DIRECT SELLING", "IOPS", "IOPS MINDANAO", "IT", "RM", "WAREHOUSE" }));
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("USER LEVEL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("FULL NAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("DEPARTMENT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("CONFIRM PASSWORD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("BRANCH");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("DEPARTMENT CODE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("PASSWORD");

        sysad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sysad.setText(" IT SYSTEM ADMIN");

        jInternalFrame1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.setTitle("USER'S ACCESS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("USERS");

        user_level1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dept_code1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        department1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("USERNAME");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("USER LEVEL");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("FULL NAME");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("DEPARTMENT");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CONFIRM PASSWORD");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("BRANCH");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("DEPARTMENT CODE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("PASSWORD");

        jCheckBox2.setText("jCheckBox1");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(c_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(department1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(full_name1))
                                .addGap(18, 18, 18)))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dept_code1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_level1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branch1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(full_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_level1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept_code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spec.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        spec.setText(" IS SPECIAL");

        SAVE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SAVE.setText("SAVE");
        SAVE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        DELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        it_delivery_report.setText("Delivery Report");

        it_items.setText("Items");

        it_user_access.setText("User's Access");

        it_items_manila.setText("Manila");

        it_del_info.setText("Delear's Information");

        it_pending_identity.setText("Pending Identity");
        it_pending_identity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_pending_identityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(it_user_access)
                    .addComponent(it_items)
                    .addComponent(it_delivery_report)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(it_items_manila))
                    .addComponent(it_del_info)
                    .addComponent(it_pending_identity))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(it_user_access)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(it_del_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(it_items)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(it_items_manila)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(it_delivery_report)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(it_pending_identity)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("IT ", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("OPERATIONS", jPanel7);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("REPORTS", jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("INCENTIVE", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("MAINTENANCE", jPanel5);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("OTHERS", jPanel8);

        CLOSE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CLOSE.setText("CLOSE");
        CLOSE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(c_password, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spec))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sysad)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(81, 81, 81))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(10, 10, 10)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dept_code, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_level, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 394, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 394, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(full_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spec)
                    .addComponent(sysad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELETE)
                    .addComponent(SAVE)
                    .addComponent(CLOSE))
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 256, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 256, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
       Connection conn_obj = OracleSqlConnect.ConnectDB();      
       
        char[] pass = password.getPassword();
        char[] c_pass = c_password.getPassword();
        String Strpassword = new String(pass);
        String Strcpassword = new String(c_pass); 
        s_username = username.getText().trim();
        s_fullname = full_name.getText().trim();
        s_userlevel = user_level.getSelectedItem().toString().trim();
        spassword=password.getText().trim();
        s_cpassword=c_password.getText().trim();
        s_department = department.getSelectedItem().toString().trim();
        s_deptcode = dept_code.getSelectedItem().toString().trim();
        s_branch=branch.getText().trim();
        
        try{
            String search_sql = "SELECT * FROM REVISED_USERS WHERE USRNAME = '"+s_username+"'";
            PreparedStatement stmt_search = conn_obj.prepareStatement(search_sql);
            ResultSet rs_search = stmt_search.executeQuery();
            int s = 0;
            while(rs_search.next()){
                s++;
            }
      
           
                if( "USER".equals(s_userlevel)){
                    s_ulvl = "USER";
                }else if("SUPERVISOR".equals(s_userlevel)){
                    s_ulvl = "SUPERVISOR";
                }
                else if("ADMINISTRATOR".equals(s_userlevel)){
                    s_ulvl = "ADMINISTRATOR";
                }
                else{
                  s_ulvl = null;
                }

                //PASS CONPASS
                if (Strpassword.equals(Strcpassword)) {
                } 
                else
                {
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
                }

                //PROCEED TO IF ELSE 

                if("ACCOUNTING".equals(s_department)){
                   s_dept = "ACCOUNTING";
                }
                else if("ADMIN SUPPORT".equals(s_department)){
                  s_dept = "ADMIN SUPPORT";  
                }
                else if("CASHIER".equals(s_department)){
                  s_dept = "CASHIER";  
                }
                else if("CHECK RELEASING".equals(s_department)){
                  s_dept = "CHECK RELEASING";  
                }
                else if("DIGITAL".equals(s_department)){
                  s_dept = "DIGITAL";  
                }
                else if("DIRECT SELLING".equals(s_department)){
                  s_dept = "DIRECT SELLING";  
                }
                else if("IOPS".equals(s_department)){
                  s_dept = "IOPS";  
                }
                else if("IOPS MINDANAO".equals(s_department)){
                  s_dept = "IOPS MINDANAO";  
                }
                else if("IT".equals(s_department)){
                  s_dept = "IT";  
                }
                else if("RM".equals(s_department)){
                  s_dept = "RM";  
                }
                else if("WAREHOUSE".equals(s_department)){
                  s_dept = "WAREHOUSE";  
                }
                else{
                  s_dept = null;
                }
                
                if("MANILA".equals(s_deptcode)){
                 s_dc = "MANILA";
                }
                else if("IOPS".equals(s_deptcode)){
                  s_dc = "IOPS";  
                }
                else if("IMIN".equals(s_deptcode)){
                  s_dc = "IMIN";  
                }
                else{
                  s_dc = null;
                }
               //END OF COMBO BOX

               //Access Check Box Menu  
                if(spec.isSelected())
                {
                  s_special = "T"; 
                }
                else
                {
                  s_special = "F"; 
                }
                if(sysad.isSelected())
                {
                  s_its = "T"; 
                }
                else
                {
                  s_its = "F"; 
                }

              //USER ACCESS CHECK BOX
                if(it_user_access.isSelected())
                {
                  s_user_access = "T"; 
                }
                else
                {
                  s_user_access = "F"; 
                }
                if(it_items.isSelected())
                {
                  s_items = "T"; 
                }
                else
                {
                  s_items = "F"; 
                }
                 if(it_items_manila.isSelected())
                {
                  s_items_manila = "T"; 
                }
                else
                {
                  s_items_manila = "F"; 
                }
                if(it_delivery_report.isSelected())
                {
                  s_del_rep = "T"; 
                }
                else
                {
                  s_del_rep = "F"; 
                }
                if(it_del_info.isSelected())
                {
                  s_mem = "T"; 
                }
                else
                {
                  s_mem = "F"; 
                }
                if(it_pending_identity.isSelected())
                {
                  s_pending = "T"; 
                }
                else
                {
                  s_pending = "F"; 
                }
         if(s > 0){
                String update_sql = "UPDATE REVISED_USERS SET USRNAME= '"+s_username+"', FULNME = '"+s_fullname+"', "
                + " USRLEV ='"+s_ulvl+"', PASWRD= '"+spassword+"', CONPAS ='"+s_cpassword+"', DEPT = '"+s_dept+"', "
                + " DEPT_CODE = '"+s_dc+"', BRANCH = '"+s_branch+"', SPECIAL = '"+s_special+"', IT_SYSADMIN = '"+s_its+"', "
                + " D_USERS = '"+s_user_access+"', D_ITEM = '"+s_items+"', R_DEL_REP = '"+s_del_rep+"', D_ITEM_MLA = '"+s_items_manila+"',"
                + " D_MEM = '"+s_mem+"', D_PENDING_IDENTITY = '"+s_pending+"'"
                + " WHERE USRNAME = '"+s_username+"'";
                PreparedStatement stmt_save = conn_obj.prepareStatement(update_sql);
                ResultSet rs_save = stmt_save.executeQuery();
                
                }
         else{
                String insert_sql = "INSERT INTO REVISED_USERS (USRNAME, FULNME, USRLEV, PASWRD, CONPAS, DEPT, DEPT_CODE, BRANCH, "
                + "SPECIAL, IT_SYSADMIN, D_USERS, D_ITEM, R_DEL_REP, D_ITEM_MLA, D_MEM, D_PENDING_IDENTITY) "
                + "VALUES ('"+s_username+"','"+s_fullname+"','"+s_ulvl+"',"
                + "'"+spassword+"','"+s_cpassword+"','"+s_dept+"','"+s_dc+"','"+s_branch+"','"+s_special+"','"+s_its+"',"
                + "'"+s_user_access+"','"+s_items+"', '"+s_del_rep+"','"+s_items_manila+"','"+s_mem+"','"+s_pending+"')";
                PreparedStatement stmt_insert = conn_obj.prepareStatement(insert_sql);
                ResultSet rs_insert = stmt_insert.executeQuery();  
                
                }  
                
                username.setText("");
                full_name.setText("");
                user_level.setSelectedItem(null);
                password.setText("");
                c_password.setText("");
                department.setSelectedItem(null);
                dept_code.setSelectedItem(null);
                branch.setText("");
                spec.setSelected(false);
                sysad.setSelected(false);
                it_user_access.setSelected(false);
                it_items.setSelected(false);
                it_items_manila.setSelected(false);
                it_delivery_report.setSelected(false);
                it_del_info.setSelected(false);
                it_pending_identity.setSelected(false);
             
    } catch (SQLException ex) {
        Logger.getLogger(USER_ACCESS.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SAVEActionPerformed
    
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
       Connection conn_obj = OracleSqlConnect.ConnectDB();       
       
         s_username = username.getText().trim();
 
       try{
       String search_sql = " SELECT * FROM REVISED_USERS WHERE USRNAME = '"+s_username+"'";
       
       PreparedStatement stmt_search = conn_obj.prepareStatement(search_sql);
       ResultSet rs_search = stmt_search.executeQuery();  
       
        int s = 0;
        while (rs_search.next()){
           s++;
           
             s_username = rs_search.getString("USRNAME");
             s_fullname = rs_search.getString("FULNME");
             s_userlevel = rs_search.getString("USRLEV");
             spassword = rs_search.getString("PASWRD");
             s_cpassword = rs_search.getString("CONPAS");
             s_department = rs_search.getString("DEPT");
             s_deptcode = rs_search.getString("DEPT_CODE");
             s_branch = rs_search.getString("BRANCH");
             s_special = rs_search.getString("SPECIAL");
             s_its = rs_search.getString("IT_SYSADMIN");
             s_user_access = rs_search.getString("D_USERS");
             s_items = rs_search.getString("D_ITEM");
             s_items_manila = rs_search.getString("D_ITEM_MLA");
             s_del_rep = rs_search.getString("R_DEL_REP");
             s_mem = rs_search.getString("D_MEM");
             s_pending = rs_search.getString("D_PENDING_IDENTITY");
        }
       //USERS 
        if(s > 0){
                username.setText(s_username);
                full_name.setText(s_fullname);
                user_level.setSelectedItem(s_userlevel);
                password.setText(spassword);
                c_password.setText(s_cpassword);
                department.setSelectedItem(s_department);
                dept_code.setSelectedItem(s_deptcode);
                branch.setText(s_branch);
               if ("T".equals(s_special)) {
                   spec.setSelected(true);
                 }
               else{
                   spec.setSelected(false);
               }
               if ("T".equals(s_its)) {
                   sysad.setSelected(true);
                 }
               else{
                   sysad.setSelected(false);
               }      
         }
        //TABBED CHECK BOX
             if ("T".equals(s_user_access)) {
                  it_user_access.setSelected(true);
                 }
               else{
                  it_user_access.setSelected(false);
               }
             if ("T".equals(s_items)) {
                   it_items.setSelected(true);
                 }
               else{
                   it_items.setSelected(false);
               }  
             if ("T".equals(s_items_manila)) {
                   it_items_manila.setSelected(true);
                 }
               else{
                  it_items_manila.setSelected(false);
               }   
             if ("T".equals(s_del_rep)) {
                   it_delivery_report.setSelected(true);
                 }
               else{
                   it_delivery_report.setSelected(false);
               }
             if ("T".equals(s_mem)) {
                   it_del_info.setSelected(true);
                 }
               else{
                    it_del_info.setSelected(false);
               }   
             if ("T".equals(s_pending)) {
                   it_pending_identity.setSelected(true);
                 }
               else{
                   it_pending_identity.setSelected(false);
               }  

              {
                rs_search.close();
                stmt_search.close();
                conn_obj.close();
              }
              
                username.grabFocus();
       } catch (SQLException ex) {
        Logger.getLogger(USER_ACCESS.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_usernameActionPerformed

    private void dept_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_codeActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CLOSEActionPerformed

    private void c_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_passwordActionPerformed
     
   
              
    }//GEN-LAST:event_c_passwordActionPerformed

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
      Connection conn_obj = OracleSqlConnect.ConnectDB();       
          
     
      try{
          String delete_sql = "DELETE FROM REVISED_USERS WHERE USRNAME = ? ";
          s_username = username.getText(); 
    
         
          int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

          if (confirmDelete == JOptionPane.YES_OPTION) {
            PreparedStatement stmt_delete = conn_obj.prepareStatement(delete_sql);
            stmt_delete.setString(1, s_username);
          
          int rowsDeleted = stmt_delete.executeUpdate();
   
          if (rowsDeleted > 0) {
          JOptionPane.showMessageDialog(null, "Successfully Deleted", "WELCOME!", JOptionPane.INFORMATION_MESSAGE);
            username.setText("");
            full_name.setText("");
            user_level.setSelectedItem(null);
            password.setText("");
            c_password.setText("");
            department.setSelectedItem(null);
            dept_code.setSelectedItem(null);
            branch.setText("");
            spec.setSelected(false);
            sysad.setSelected(false);
            it_user_access.setSelected(false);
            it_items.setSelected(false);
            it_items_manila.setSelected(false);
            it_delivery_report.setSelected(false);
            it_del_info.setSelected(false);
            it_pending_identity.setSelected(false);
          } 
          else 
          {
          JOptionPane.showMessageDialog(null, "NO RECORD FOUND!", "WARNING", JOptionPane.OK_OPTION);
          }
          {
          conn_obj.close();
          stmt_delete.close();
          }
          
    }
           
      } catch (SQLException ex) {
        Logger.getLogger(USER_ACCESS.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }//GEN-LAST:event_DELETEActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        int pos = username.getCaretPosition();
        username.setText(username.getText().toUpperCase());
        username.setCaretPosition(pos);

    }//GEN-LAST:event_usernameKeyReleased

    private void it_pending_identityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_pending_identityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_it_pending_identityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField branch;
    private javax.swing.JTextField branch1;
    private javax.swing.JPasswordField c_password;
    private javax.swing.JPasswordField c_password1;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> department1;
    private javax.swing.JComboBox<String> dept_code;
    private javax.swing.JComboBox<String> dept_code1;
    private javax.swing.JTextField full_name;
    private javax.swing.JTextField full_name1;
    private javax.swing.JCheckBox it_del_info;
    private javax.swing.JCheckBox it_delivery_report;
    private javax.swing.JCheckBox it_items;
    private javax.swing.JCheckBox it_items_manila;
    private javax.swing.JCheckBox it_pending_identity;
    private javax.swing.JCheckBox it_user_access;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JCheckBox spec;
    private javax.swing.JCheckBox sysad;
    private javax.swing.JComboBox<String> user_level;
    private javax.swing.JComboBox<String> user_level1;
    private javax.swing.JTextField user_name1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
