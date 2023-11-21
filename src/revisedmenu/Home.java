/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisedmenu;

import revisedmenu.users.USER_ACCESS;
import revisedmenu.del_report.DEL_REPORT;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import revisedmenu.dealers_info.MEMBERS;
import revisedmenu.items.ITEMS_DATA_ENTRY_DS;
import revisedmenu.pending.Pending_Identity;

public class Home extends javax.swing.JFrame {
 String s_user, s_pass, s_user_access, s_items, s_items_manila, s_del_rep, s_mem, s_pending;

    public Home(){
     initComponents();

     this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
     this.add(desktopPaneControl, BorderLayout.CENTER);     
     desktopPaneControl.setSize(1370,870);
     desktopPaneControl.setVisible(true);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        desktopPaneControl = new javax.swing.JDesktopPane();
        LoginFrame = new javax.swing.JInternalFrame();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dname = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        IT_ACCESS = new javax.swing.JMenu();
        USER_ACC = new javax.swing.JMenuItem();
        DEAL_INFO = new javax.swing.JMenuItem();
        ITEM = new javax.swing.JMenu();
        ITEM_MANILA = new javax.swing.JMenu();
        PENDING_IDENTITY = new javax.swing.JMenuItem();
        LOST_CHECK = new javax.swing.JMenuItem();
        PAYCARD = new javax.swing.JMenuItem();
        BLOCK_UNBLOCK = new javax.swing.JMenuItem();
        INCOME_VERIFICATION = new javax.swing.JMenuItem();
        GENEALOGY = new javax.swing.JMenuItem();
        REPRINT_OR = new javax.swing.JMenuItem();
        SOLD_ITEMS = new javax.swing.JMenuItem();
        STOCK_STATUS = new javax.swing.JMenuItem();
        DELIVERY_REPORT = new javax.swing.JMenuItem();
        STF_REPORT = new javax.swing.JMenuItem();
        ITEMS_SOLD = new javax.swing.JMenuItem();
        TRANSACTION_SUMMARY = new javax.swing.JMenuItem();
        POWER_PACKS = new javax.swing.JMenuItem();
        SOC_SCQ_FACILITATION = new javax.swing.JMenuItem();
        EXPIRED_SCQ_SOC = new javax.swing.JMenuItem();
        DATA_ENTRY_BA = new javax.swing.JMenuItem();
        BLOCK_VERIFICATION = new javax.swing.JMenuItem();
        IOPS_REPORT = new javax.swing.JMenuItem();
        PROMO = new javax.swing.JMenuItem();
        INSTITUTIONAL_SALES = new javax.swing.JMenuItem();
        TVPS = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        loginForm = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        closeBar = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Vita Plus");

        desktopPaneControl.setBackground(new java.awt.Color(204, 204, 204));
        desktopPaneControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LoginFrame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginFrame.setTitle("System Log-in");
        LoginFrame.setVisible(false);
        desktopPaneControl.removeAll();
        desktopPaneControl.repaint();

        username.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("USERNAME");

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PASSWORD");

        javax.swing.GroupLayout LoginFrameLayout = new javax.swing.GroupLayout(LoginFrame.getContentPane());
        LoginFrame.getContentPane().setLayout(LoginFrameLayout);
        LoginFrameLayout.setHorizontalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginFrameLayout.setVerticalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFrameLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        desktopPaneControl.setLayer(LoginFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneControlLayout = new javax.swing.GroupLayout(desktopPaneControl);
        desktopPaneControl.setLayout(desktopPaneControlLayout);
        desktopPaneControlLayout.setHorizontalGroup(
            desktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneControlLayout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        desktopPaneControlLayout.setVerticalGroup(
            desktopPaneControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneControlLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Logged in As:");

        dname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        IT_ACCESS.setBorder(null);
        IT_ACCESS.setText("IT Access");
        IT_ACCESS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IT_ACCESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IT_ACCESSActionPerformed(evt);
            }
        });

        USER_ACC.setText("User's Access");
        USER_ACC.setEnabled(false);
        USER_ACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_ACCActionPerformed(evt);
            }
        });
        IT_ACCESS.add(USER_ACC);

        DEAL_INFO.setText("Delear's Information");
        DEAL_INFO.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DEAL_INFO.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                DEAL_INFOMouseWheelMoved(evt);
            }
        });
        DEAL_INFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEAL_INFOActionPerformed(evt);
            }
        });
        IT_ACCESS.add(DEAL_INFO);

        ITEM.setText("Items");
        ITEM.setEnabled(false);

        ITEM_MANILA.setText("Manila");
        ITEM_MANILA.setEnabled(false);
        ITEM_MANILA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ITEM_MANILAMouseClicked(evt);
            }
        });
        ITEM.add(ITEM_MANILA);

        IT_ACCESS.add(ITEM);

        PENDING_IDENTITY.setText("Pending Identity");
        PENDING_IDENTITY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PENDING_IDENTITY.setEnabled(false);
        PENDING_IDENTITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PENDING_IDENTITYActionPerformed(evt);
            }
        });
        IT_ACCESS.add(PENDING_IDENTITY);

        LOST_CHECK.setText("Lost Check");
        LOST_CHECK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LOST_CHECK.setEnabled(false);
        IT_ACCESS.add(LOST_CHECK);

        PAYCARD.setText("PayCard(Global)Paymaya/Bank");
        PAYCARD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PAYCARD.setEnabled(false);
        PAYCARD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYCARDActionPerformed(evt);
            }
        });
        IT_ACCESS.add(PAYCARD);

        BLOCK_UNBLOCK.setText("Blocking/Unblock Delear's");
        BLOCK_UNBLOCK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BLOCK_UNBLOCK.setEnabled(false);
        BLOCK_UNBLOCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLOCK_UNBLOCKActionPerformed(evt);
            }
        });
        IT_ACCESS.add(BLOCK_UNBLOCK);

        INCOME_VERIFICATION.setText("Income Verification");
        INCOME_VERIFICATION.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        INCOME_VERIFICATION.setEnabled(false);
        IT_ACCESS.add(INCOME_VERIFICATION);

        GENEALOGY.setText("Genealogy");
        GENEALOGY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        GENEALOGY.setEnabled(false);
        IT_ACCESS.add(GENEALOGY);

        REPRINT_OR.setText("Re Print OR");
        REPRINT_OR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        REPRINT_OR.setEnabled(false);
        REPRINT_OR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPRINT_ORActionPerformed(evt);
            }
        });
        IT_ACCESS.add(REPRINT_OR);

        SOLD_ITEMS.setText("Sold Items(Original DR)");
        SOLD_ITEMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SOLD_ITEMS.setEnabled(false);
        IT_ACCESS.add(SOLD_ITEMS);

        STOCK_STATUS.setText("Stock Status Report");
        STOCK_STATUS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        STOCK_STATUS.setEnabled(false);
        IT_ACCESS.add(STOCK_STATUS);

        DELIVERY_REPORT.setText("Delivery Summary Report");
        DELIVERY_REPORT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DELIVERY_REPORT.setEnabled(false);
        DELIVERY_REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELIVERY_REPORTActionPerformed(evt);
            }
        });
        IT_ACCESS.add(DELIVERY_REPORT);

        STF_REPORT.setText("Pullout/STF Summary Report");
        STF_REPORT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        STF_REPORT.setEnabled(false);
        IT_ACCESS.add(STF_REPORT);

        ITEMS_SOLD.setText("No. of Items Sold");
        ITEMS_SOLD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ITEMS_SOLD.setEnabled(false);
        IT_ACCESS.add(ITEMS_SOLD);

        TRANSACTION_SUMMARY.setText("Transaction Summary");
        TRANSACTION_SUMMARY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TRANSACTION_SUMMARY.setEnabled(false);
        IT_ACCESS.add(TRANSACTION_SUMMARY);

        POWER_PACKS.setText("Advance Power Packs");
        POWER_PACKS.setEnabled(false);
        IT_ACCESS.add(POWER_PACKS);

        SOC_SCQ_FACILITATION.setText("SOC/SCQ Facilitation");
        SOC_SCQ_FACILITATION.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SOC_SCQ_FACILITATION.setEnabled(false);
        IT_ACCESS.add(SOC_SCQ_FACILITATION);

        EXPIRED_SCQ_SOC.setText("Tagging of Expired SCQ/SOC");
        EXPIRED_SCQ_SOC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EXPIRED_SCQ_SOC.setEnabled(false);
        IT_ACCESS.add(EXPIRED_SCQ_SOC);

        DATA_ENTRY_BA.setText("Data Entry of BA c/o Accounting");
        DATA_ENTRY_BA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DATA_ENTRY_BA.setEnabled(false);
        IT_ACCESS.add(DATA_ENTRY_BA);

        BLOCK_VERIFICATION.setText("Block BA Verification");
        BLOCK_VERIFICATION.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BLOCK_VERIFICATION.setEnabled(false);
        IT_ACCESS.add(BLOCK_VERIFICATION);

        IOPS_REPORT.setText("IOPs Reports");
        IOPS_REPORT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IOPS_REPORT.setEnabled(false);
        IT_ACCESS.add(IOPS_REPORT);

        PROMO.setText("Promo Items Data Entry");
        PROMO.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PROMO.setEnabled(false);
        IT_ACCESS.add(PROMO);

        INSTITUTIONAL_SALES.setText("Institutional Sales");
        INSTITUTIONAL_SALES.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        INSTITUTIONAL_SALES.setEnabled(false);
        INSTITUTIONAL_SALES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSTITUTIONAL_SALESActionPerformed(evt);
            }
        });
        IT_ACCESS.add(INSTITUTIONAL_SALES);

        TVPS.setText("Available of Showing TVP's");
        TVPS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TVPS.setEnabled(false);
        IT_ACCESS.add(TVPS);

        menuBar.add(IT_ACCESS);

        jMenu1.setText("Operation");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuBar.add(jMenu1);

        jMenu5.setBorder(null);
        jMenu5.setText("Reports");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu5.add(jMenuItem3);
        jMenu5.add(jMenuItem4);

        menuBar.add(jMenu5);

        jMenu6.setBorder(null);
        jMenu6.setText("Maintenance");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu6.add(jMenuItem5);
        jMenu6.add(jMenuItem6);

        menuBar.add(jMenu6);

        jMenu7.setBorder(null);
        jMenu7.setText("Incentives");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu7.add(jMenuItem7);
        jMenu7.add(jMenuItem8);

        menuBar.add(jMenu7);

        loginForm.setBorder(null);
        loginForm.setText("Login");
        loginForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginFormMouseClicked(evt);
            }
        });
        loginForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginFormKeyPressed(evt);
            }
        });
        menuBar.add(loginForm);

        jMenu8.setBorder(null);
        jMenu8.setText("Others");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu8.add(jMenuItem9);

        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        menuBar.add(jMenu8);

        jMenu11.setBorder(null);
        jMenu11.setText("Window");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuBar.add(jMenu11);

        closeBar.setBorder(null);
        closeBar.setText("Close");
        closeBar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBarMouseClicked(evt);
            }
        });
        menuBar.add(closeBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneControl)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 520, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(dname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(desktopPaneControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBarMouseClicked
       this.dispose();
    }//GEN-LAST:event_closeBarMouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void loginFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFormMouseClicked
       desktopPaneControl.removeAll();
       desktopPaneControl.repaint();
       LoginFrame.pack();
       LoginFrame.setVisible(true);
       desktopPaneControl.add(LoginFrame);
       LoginFrame.setResizable(false);
       LoginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       username.grabFocus();
       Dimension desktopSize = desktopPaneControl.getSize();
       Dimension jInternalFrameSize = LoginFrame.getSize();
       LoginFrame.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
       (desktopSize.height - jInternalFrameSize.height)/3);
      
       username.setText("");
       password.setText("");
       
       
       ITEM.setEnabled(false);
       ITEM_MANILA.setEnabled(false);
       DELIVERY_REPORT.setEnabled(false);
       USER_ACC.setEnabled(false);
       DEAL_INFO.setEnabled(false);
       PENDING_IDENTITY.setEnabled(false);
     
                   
    password.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String Username = null;
            Connection conn_obj = OracleSqlConnect.ConnectDB();

            String sql1 = "SELECT USRNAME FROM REVISED_USERS WHERE USRNAME = ? AND PASWRD = ?";
            PreparedStatement stmt1 = conn_obj.prepareStatement(sql1);
            stmt1.setString(1, username.getText().trim());
            stmt1.setString(2, password.getText().trim());

            ResultSet rs1 = stmt1.executeQuery();

            if (rs1.next()) {
                Username = rs1.getString("USRNAME");
                dname.setText(Username);
            } else {
                // Handle the case where no matching user is found
                // You might want to display an error message or take appropriate action
            }

            rs1.close();
            stmt1.close();
        } catch (SQLException ex) {
            // Handle or log the exception here
            ex.printStackTrace();
        }
    }
});
      
    }//GEN-LAST:event_loginFormMouseClicked

    private void IT_ACCESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IT_ACCESSActionPerformed

    }//GEN-LAST:event_IT_ACCESSActionPerformed

    private void INSTITUTIONAL_SALESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSTITUTIONAL_SALESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INSTITUTIONAL_SALESActionPerformed

    private void DELIVERY_REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELIVERY_REPORTActionPerformed
        desktopPaneControl.removeAll();
        desktopPaneControl.repaint();
        DEL_REPORT dt = new DEL_REPORT();
        dt.pack();
        dt.setVisible(true);
        desktopPaneControl.add(dt);
        dt.setResizable(false);
        dt.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Dimension desktopSize = desktopPaneControl.getSize();
        Dimension jInternalFrameSize = dt.getSize();
        dt.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height - jInternalFrameSize.height)/3);

    }//GEN-LAST:event_DELIVERY_REPORTActionPerformed

    private void REPRINT_ORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPRINT_ORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPRINT_ORActionPerformed

    private void BLOCK_UNBLOCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLOCK_UNBLOCKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BLOCK_UNBLOCKActionPerformed

    private void PAYCARDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYCARDActionPerformed

    }//GEN-LAST:event_PAYCARDActionPerformed

    private void PENDING_IDENTITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PENDING_IDENTITYActionPerformed
        desktopPaneControl.removeAll();
        desktopPaneControl.repaint();
        Pending_Identity P_A = new Pending_Identity();
        P_A.pack();

        P_A.setVisible(true);
        desktopPaneControl.add(P_A);
        P_A.setResizable(false);
        P_A.txtBA.grabFocus();
        P_A.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Dimension desktopSize = desktopPaneControl.getSize();
        Dimension jInternalFrameSize = P_A.getSize();
        P_A.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height - jInternalFrameSize.height)/4);
    }//GEN-LAST:event_PENDING_IDENTITYActionPerformed

    private void USER_ACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_ACCActionPerformed
        desktopPaneControl.removeAll();
        desktopPaneControl.repaint();
        USER_ACCESS U_A = new USER_ACCESS();
        U_A.pack();

        U_A.setVisible(true);
        desktopPaneControl.add(U_A);
        U_A.setResizable(false);
        U_A.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Dimension desktopSize = desktopPaneControl.getSize();
        Dimension jInternalFrameSize = U_A.getSize();
        U_A.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height - jInternalFrameSize.height)/4);
    }//GEN-LAST:event_USER_ACCActionPerformed

    private void ITEM_MANILAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ITEM_MANILAMouseClicked
        desktopPaneControl.removeAll();
        desktopPaneControl.repaint();
        ITEMS_DATA_ENTRY_DS IDED = new ITEMS_DATA_ENTRY_DS();
        IDED.pack();

        IDED.setVisible(true);
        desktopPaneControl.add(IDED);
        IDED.setResizable(false);
        IDED.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        Dimension desktopSize = desktopPaneControl.getSize();
        Dimension jInternalFrameSize = IDED.getSize();
        IDED.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
       (desktopSize.height - jInternalFrameSize.height)/4); 
    }//GEN-LAST:event_ITEM_MANILAMouseClicked

    private void DEAL_INFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEAL_INFOActionPerformed
                final MEMBERS mem = new MEMBERS();
                desktopPaneControl.removeAll();
                desktopPaneControl.repaint();
                desktopPaneControl.revalidate();
                desktopPaneControl.repaint();
                mem.setVisible(true);
                desktopPaneControl.add(mem);
                mem.setResizable(false);
                mem.txtBA.grabFocus();
               
                
                 try {
                    String Username = null;
                    Connection conn_obj = OracleSqlConnect.ConnectDB();

                    String sql1 = "SELECT USRNAME FROM REVISED_USERS WHERE USRNAME = ? AND PASWRD = ?";
                    try (PreparedStatement stmt1 = conn_obj.prepareStatement(sql1)) {
                        stmt1.setString(1, username.getText().trim());
                        stmt1.setString(2, password.getText().trim());
                        try (ResultSet rs1 = stmt1.executeQuery()) {
                            if (rs1.next()) {
                                Username = rs1.getString("USRNAME");
                                mem.Cashier.setText(Username);
                                mem.Cashier.setEditable(false);
                            } else {
                                // Handle the case where no matching user is found
                                // You might want to display an error message or take appropriate action
                            }
                        }
                    }
                } catch (SQLException ex) {
                }

                           
                mem.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                Dimension desktopSize = desktopPaneControl.getSize();
                Dimension jInternalFrameSize = mem.getSize();
                mem.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 20 );
                
                           /*
               Component[] components = desktopPaneControl.getComponents();
               for (Component component : components) {
                   if (component != jScrollPane1 ) {
                       desktopPaneControl.remove(component);
                   }
               }
               */

    }//GEN-LAST:event_DEAL_INFOActionPerformed

    private void DEAL_INFOMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_DEAL_INFOMouseWheelMoved
      
        
    }//GEN-LAST:event_DEAL_INFOMouseWheelMoved

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();

        s_user = username.getText();
        s_pass = password.getText();

        try{
            String pass_sql = "SELECT * FROM REVISED_USERS WHERE USRNAME = '"+s_user+"' AND PASWRD = '"+s_pass+"'";

            PreparedStatement pass_stmt = conn_obj.prepareStatement(pass_sql);
            ResultSet pass_rs = pass_stmt.executeQuery();

            int l = 0;
            while(pass_rs.next()){
                l++;
                s_user_access = pass_rs.getString("D_USERS");
                s_items = pass_rs.getString("D_ITEM");
                s_items_manila = pass_rs.getString("D_ITEM_MLA");
                s_del_rep = pass_rs.getString("R_DEL_REP");
                s_mem = pass_rs.getString("D_MEM");
                s_pending = pass_rs.getString("D_PENDING_IDENTITY");

            }

            if(l > 0){
                JOptionPane.showMessageDialog(null,"LOGGED IN SUCCESFULLY!","WELCOME!", JOptionPane.INFORMATION_MESSAGE);

                if("T".equals(s_user_access)){
                    USER_ACC.setEnabled(true);
                }
                else{
                    USER_ACC.setEnabled(false);
                }
                if("T".equals(s_items)){
                    ITEM.setEnabled(true);
                }
                else{
                    ITEM.setEnabled(false);
                }
                if("T".equals(s_items_manila)){
                    ITEM_MANILA.setEnabled(true);
                }
                else{
                    ITEM_MANILA.setEnabled(false);
                }
                if("T".equals(s_del_rep)){
                    DELIVERY_REPORT.setEnabled(true);
                }
                else{
                    DELIVERY_REPORT.setEnabled(false);
                }
                if("T".equals(s_mem)){
                    DEAL_INFO.setEnabled(true);
                }
                else{
                    DEAL_INFO.setEnabled(false);
                }
                if("T".equals(s_pending)){
                    PENDING_IDENTITY.setEnabled(true);
                }
                else{
                    PENDING_IDENTITY.setEnabled(false);
                }
                LoginFrame.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"INVALID PASSWORD!","WARNING",JOptionPane.OK_OPTION);
                password.setText("");
                password.grabFocus();
            }

            {
                pass_rs.close();
                conn_obj.close();
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"NO CONNECTION!","WARNING",JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        int pos = username.getCaretPosition();
        username.setText(username.getText().toUpperCase());
        username.setCaretPosition(pos);

        if(evt.getKeyCode() == 8);{
            if(evt.getKeyCode() == 27){
                int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to EXIT WINDOW?","Close?",0);
                if(reply == 0){
                    System.exit(0);
                }
            }
           }
    }//GEN-LAST:event_usernameKeyReleased

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        s_user = username.getText();

        try{
            String user_sql = "SELECT USRNAME,PASWRD FROM REVISED_USERS WHERE USRNAME = '"+s_user+"'";

            PreparedStatement user_stmt = conn_obj.prepareStatement(user_sql);
            ResultSet user_rs = user_stmt.executeQuery();

            int l = 0;
            while(user_rs.next()){
                l++;
            }
            if(l > 0 ){
                password.grabFocus();
            }

            else{
                JOptionPane.showMessageDialog(null,"INVALID USERNAME!","WARNING",JOptionPane.OK_OPTION);
                username.setText("");
                username.grabFocus();
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"NO CONNECTION!","WARNING",JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_usernameActionPerformed

    private void loginFormKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginFormKeyPressed
      
                // TODO add your handling code here:
    }//GEN-LAST:event_loginFormKeyPressed
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BLOCK_UNBLOCK;
    private javax.swing.JMenuItem BLOCK_VERIFICATION;
    private javax.swing.JMenuItem DATA_ENTRY_BA;
    private javax.swing.JMenuItem DEAL_INFO;
    private javax.swing.JMenuItem DELIVERY_REPORT;
    private javax.swing.JMenuItem EXPIRED_SCQ_SOC;
    private javax.swing.JMenuItem GENEALOGY;
    private javax.swing.JMenuItem INCOME_VERIFICATION;
    private javax.swing.JMenuItem INSTITUTIONAL_SALES;
    private javax.swing.JMenuItem IOPS_REPORT;
    private javax.swing.JMenu ITEM;
    private javax.swing.JMenuItem ITEMS_SOLD;
    private javax.swing.JMenu ITEM_MANILA;
    public javax.swing.JMenu IT_ACCESS;
    private javax.swing.JMenuItem LOST_CHECK;
    public javax.swing.JInternalFrame LoginFrame;
    private javax.swing.JMenuItem PAYCARD;
    public javax.swing.JMenuItem PENDING_IDENTITY;
    private javax.swing.JMenuItem POWER_PACKS;
    private javax.swing.JMenuItem PROMO;
    private javax.swing.JMenuItem REPRINT_OR;
    private javax.swing.JMenuItem SOC_SCQ_FACILITATION;
    private javax.swing.JMenuItem SOLD_ITEMS;
    private javax.swing.JMenuItem STF_REPORT;
    private javax.swing.JMenuItem STOCK_STATUS;
    private javax.swing.JMenuItem TRANSACTION_SUMMARY;
    private javax.swing.JMenuItem TVPS;
    public javax.swing.JMenuItem USER_ACC;
    private javax.swing.JMenu closeBar;
    private javax.swing.JDesktopPane desktopPaneControl;
    private javax.swing.JLabel dname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public javax.swing.JMenu loginForm;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables



   
   
}
