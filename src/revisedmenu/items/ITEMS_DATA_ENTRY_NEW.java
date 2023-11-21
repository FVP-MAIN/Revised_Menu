
package revisedmenu.items;




import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import revisedmenu.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class ITEMS_DATA_ENTRY_NEW extends javax.swing.JInternalFrame {

String itm_code, date_enc, gtin, vtype, itm_cat, msvita, des, supp, prods, cat,
         unit, colors, size, kg, dscnt, qon, sel_prc, unit1, phase, name, listmodel, promo, tcode;



 Integer sp, discount,qty, wght;
 
 Date Date_Input;
 
    public ITEMS_DATA_ENTRY_NEW() { 
        initComponents();   
       setEditable(false);
    }
    
    private void setEditable(boolean editable){
        JTextField[] textFields = {
        jitem_code, jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup, jprod, jcat, jcolors, jsize,
        jkg, jsp, jdsc, jqon     
        };
    
        for (JTextField textField : textFields) {
          if (textField != jitem_code) {
           textField.setText("");
            textField.setEditable(editable);
             }else {
                textField.setText(""); // Optional, to clear the text in txtBA
                  textField.setEditable(true);
               }
         }
        junit.setEnabled(false);
        c_phaseout.setEnabled(false);      
    }
    
  private void handleNonExistingItemCode() {
    if (jitem_code.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Add Item Code!");
    }
}
     public void updateVTypeList() {     
       Connection conn_obj = OracleSqlConnect.ConnectDB();
        try {       
            DefaultListModel vt_model = new DefaultListModel();      
            String sql_list1 = "SELECT DISTINCT VTYPE FROM ITEMS";
            PreparedStatement stmt_list1 = conn_obj.prepareStatement(sql_list1);
            ResultSet rs_list1 = stmt_list1.executeQuery();

            while (rs_list1.next()) {
                String vtValue = rs_list1.getString("VTYPE");
                vt_model.addElement(vtValue);
            }

            vt_list.setModel(vt_model);
            {
                conn_obj.close();  
                rs_list1.close();
                stmt_list1.close();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }

            }
              
      public void updateITEM_CATypeList() {
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        try {
                    DefaultListModel item_cat_model = new DefaultListModel();
                    String sql_list2 = "SELECT DISTINCT ITMCATEGORY FROM ITEMS";
                    PreparedStatement stmt_list2 = conn_obj.prepareStatement(sql_list2);
                    ResultSet rs_list2 = stmt_list2.executeQuery();
                  
                    while (rs_list2.next()) {
                    String itemValue = rs_list2.getString("ITMCATEGORY");                
                    item_cat_model.addElement(itemValue);
                    }
                    item_list.setModel(item_cat_model);                  
                    {
                rs_list2.close();
                conn_obj.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
    } 
       public void updatePRODTypeList() {
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        try {
                    DefaultListModel prod_model = new DefaultListModel();
                    String sql_list3 = "SELECT DISTINCT PRDUCTS FROM ITEMS WHERE FORSALE = 'T'";
                    PreparedStatement stmt_list3 = conn_obj.prepareStatement(sql_list3);
                    ResultSet rs_list3 = stmt_list3.executeQuery();
                  
                    while (rs_list3.next()) {
                    String prodValue = rs_list3.getString("PRDUCTS");                
                    prod_model.addElement(prodValue);
                    }
                   prod_list.setModel(prod_model);
                    {
                rs_list3.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
    } 
       
    public void updateCOLORTypeList() {
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        try {
                    DefaultListModel color_model = new DefaultListModel();
                    String sql_list4 = "SELECT DISTINCT CLORS FROM ITEMS";
                    PreparedStatement stmt_list4 = conn_obj.prepareStatement(sql_list4);
                    ResultSet rs_list4 = stmt_list4.executeQuery();
                  
                    while (rs_list4.next()) {
                    String colorValue = rs_list4.getString("CLORS");                
                    color_model.addElement(colorValue);
                    }
                    color_list.setModel(color_model);
                    
                    
                    {
                rs_list4.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    } 
    public void updateSIZETypeList() {
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        try {
                    DefaultListModel size_model = new DefaultListModel();
                    String sql_list5 = "SELECT DISTINCT SZES FROM ITEMS";
                    PreparedStatement stmt_list5 = conn_obj.prepareStatement(sql_list5);
                    ResultSet rs_list5 = stmt_list5.executeQuery();
                  
                    while (rs_list5.next()) {
                    String sizeValue = rs_list5.getString("SZES");                
                    size_model.addElement(sizeValue);
                    }
                    size_list.setModel(size_model);
                  
                   {
                rs_list5.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        var_type = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        vt_list = new javax.swing.JList<>();
        close1 = new javax.swing.JButton();
        okayVT = new javax.swing.JButton();
        VarSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        item_cat = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        item_list = new javax.swing.JList<>();
        close2 = new javax.swing.JButton();
        okayITEM = new javax.swing.JButton();
        ItemSearch = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        supplier = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        sup_list = new javax.swing.JList<>();
        close5 = new javax.swing.JButton();
        okaySUP = new javax.swing.JButton();
        txtSearch4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        products = new javax.swing.JInternalFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        prod_list = new javax.swing.JList<>();
        close7 = new javax.swing.JButton();
        okayPROD = new javax.swing.JButton();
        ProdSearch = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        color = new javax.swing.JInternalFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        color_list = new javax.swing.JList<>();
        close8 = new javax.swing.JButton();
        okayCOLOR = new javax.swing.JButton();
        ColorSearch = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Sizes = new javax.swing.JInternalFrame();
        jScrollPane9 = new javax.swing.JScrollPane();
        size_list = new javax.swing.JList<>();
        close9 = new javax.swing.JButton();
        okaySize = new javax.swing.JButton();
        SizeSearch = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jsp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jdate = new javax.swing.JTextField();
        jsup = new javax.swing.JTextField();
        jdsc = new javax.swing.JTextField();
        jitem_code = new javax.swing.JTextField();
        jqon = new javax.swing.JTextField();
        jvt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        c_phaseout = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jvita = new javax.swing.JTextField();
        jitem_cat = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jdes = new javax.swing.JTextField();
        jprod = new javax.swing.JTextField();
        junit = new javax.swing.JComboBox<>();
        jcolors = new javax.swing.JTextField();
        jsize = new javax.swing.JTextField();
        jkg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CLOSE = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jgtin = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        DisplayName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jcat = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Item Data Entry");

        var_type.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        var_type.setClosable(true);
        var_type.setResizable(true);
        var_type.setTitle("Variation Type");
        var_type.setVisible(false);

        vt_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vt_listMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(vt_list);

        close1.setText("CLOSE");
        close1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });

        okayVT.setText("OK");
        okayVT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okayVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayVTActionPerformed(evt);
            }
        });

        VarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarSearchActionPerformed(evt);
            }
        });
        VarSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VarSearchKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Search:");

        javax.swing.GroupLayout var_typeLayout = new javax.swing.GroupLayout(var_type.getContentPane());
        var_type.getContentPane().setLayout(var_typeLayout);
        var_typeLayout.setHorizontalGroup(
            var_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(var_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(var_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, var_typeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okayVT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, var_typeLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VarSearch)))
                .addContainerGap())
        );
        var_typeLayout.setVerticalGroup(
            var_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(var_typeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(var_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(var_typeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close1)
                    .addComponent(okayVT))
                .addGap(5, 5, 5))
        );

        item_cat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_cat.setClosable(true);
        item_cat.setResizable(true);
        item_cat.setTitle("Item Category");
        item_cat.setVisible(false);

        item_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_listMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(item_list);

        close2.setText("CLOSE");
        close2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close2ActionPerformed(evt);
            }
        });

        okayITEM.setText("OK");
        okayITEM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okayITEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayITEMActionPerformed(evt);
            }
        });

        ItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSearchActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Search:");

        javax.swing.GroupLayout item_catLayout = new javax.swing.GroupLayout(item_cat.getContentPane());
        item_cat.getContentPane().setLayout(item_catLayout);
        item_catLayout.setHorizontalGroup(
            item_catLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_catLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item_catLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_catLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okayITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_catLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItemSearch)))
                .addContainerGap())
        );
        item_catLayout.setVerticalGroup(
            item_catLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_catLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item_catLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(item_catLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close2)
                    .addComponent(okayITEM))
                .addGap(5, 5, 5))
        );

        supplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        supplier.setClosable(true);
        supplier.setResizable(true);
        supplier.setTitle("Supplier");
        supplier.setVisible(false);

        sup_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SIR KALOYS HEALTH CAFE", "FVP", "FQPI2", "HERBAL BLESSING", "THE SOAP FACTORY (TSF)", "PATRICE", "OTHERS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sup_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sup_listMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(sup_list);

        close5.setText("CLOSE");
        close5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close5ActionPerformed(evt);
            }
        });

        okaySUP.setText("OK");
        okaySUP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okaySUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okaySUPActionPerformed(evt);
            }
        });

        txtSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch4ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Search:");

        javax.swing.GroupLayout supplierLayout = new javax.swing.GroupLayout(supplier.getContentPane());
        supplier.getContentPane().setLayout(supplierLayout);
        supplierLayout.setHorizontalGroup(
            supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okaySUP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch4)))
                .addContainerGap())
        );
        supplierLayout.setVerticalGroup(
            supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close5)
                    .addComponent(okaySUP)))
        );

        products.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        products.setClosable(true);
        products.setResizable(true);
        products.setTitle("Products");
        products.setVisible(false);

        prod_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prod_listMouseEntered(evt);
            }
        });
        jScrollPane7.setViewportView(prod_list);

        close7.setText("CLOSE");
        close7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close7ActionPerformed(evt);
            }
        });

        okayPROD.setText("OK");
        okayPROD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okayPROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayPRODActionPerformed(evt);
            }
        });

        ProdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdSearchActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Search:");

        javax.swing.GroupLayout productsLayout = new javax.swing.GroupLayout(products.getContentPane());
        products.getContentPane().setLayout(productsLayout);
        productsLayout.setHorizontalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okayPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productsLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProdSearch)))
                .addContainerGap())
        );
        productsLayout.setVerticalGroup(
            productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close7)
                    .addComponent(okayPROD))
                .addGap(5, 5, 5))
        );

        color.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        color.setClosable(true);
        color.setResizable(true);
        color.setTitle("Colors");
        color.setVisible(false);

        color_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color_listMouseEntered(evt);
            }
        });
        jScrollPane8.setViewportView(color_list);

        close8.setText("CLOSE");
        close8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close8ActionPerformed(evt);
            }
        });

        okayCOLOR.setText("OK");
        okayCOLOR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okayCOLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayCOLORActionPerformed(evt);
            }
        });

        ColorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorSearchActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Search:");

        javax.swing.GroupLayout colorLayout = new javax.swing.GroupLayout(color.getContentPane());
        color.getContentPane().setLayout(colorLayout);
        colorLayout.setHorizontalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okayCOLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorSearch)))
                .addContainerGap())
        );
        colorLayout.setVerticalGroup(
            colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close8)
                    .addComponent(okayCOLOR)))
        );

        Sizes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sizes.setClosable(true);
        Sizes.setResizable(true);
        Sizes.setTitle("Size");
        Sizes.setVisible(false);

        size_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                size_listMouseEntered(evt);
            }
        });
        jScrollPane9.setViewportView(size_list);

        close9.setText("CLOSE");
        close9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close9ActionPerformed(evt);
            }
        });

        okaySize.setText("OK");
        okaySize.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okaySize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okaySizeActionPerformed(evt);
            }
        });

        SizeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeSearchActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Search:");

        javax.swing.GroupLayout SizesLayout = new javax.swing.GroupLayout(Sizes.getContentPane());
        Sizes.getContentPane().setLayout(SizesLayout);
        SizesLayout.setHorizontalGroup(
            SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SizesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okaySize, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SizesLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SizeSearch)))
                .addContainerGap())
        );
        SizesLayout.setVerticalGroup(
            SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SizeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close9)
                    .addComponent(okaySize))
                .addGap(5, 5, 5))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel5.setText("ITEM CATEGORY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel15.setText("WEIGHT IN KG");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel3.setText("GTIN");

        jsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jspActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel4.setText("VARIATION TYPE");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel13.setText("COLORS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel1.setText("ITEM CODE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel14.setText("SIZE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel2.setText("DATE ENCODED");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel16.setText("SELLING PRICE");

        jsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsupMouseClicked(evt);
            }
        });

        jdsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdscActionPerformed(evt);
            }
        });

        jitem_code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jitem_codeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jitem_codeMouseEntered(evt);
            }
        });
        jitem_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitem_codeActionPerformed(evt);
            }
        });
        jitem_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jitem_codeKeyReleased(evt);
            }
        });

        jqon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jqonActionPerformed(evt);
            }
        });

        jvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel8.setText("SUPPLIER");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel7.setText("DESCRIPTION");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel21.setText("PHASE OUT");

        c_phaseout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_phaseoutjCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_phaseout)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_phaseout, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel18.setText("QUANTITY ON HAND");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel17.setText("DISCOUNT");

        jvita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvitaActionPerformed(evt);
            }
        });

        jitem_cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jitem_catMouseClicked(evt);
            }
        });
        jitem_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitem_catActionPerformed(evt);
            }
        });

        SAVE.setText("SAVE");
        SAVE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel23.setText("MY ASSISTANT");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel24.setText("  MSVITA");

        jdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdesActionPerformed(evt);
            }
        });

        jprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jprodMouseClicked(evt);
            }
        });
        jprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprodActionPerformed(evt);
            }
        });

        junit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "PIECE(S)", "PAIR", "BOX", "DOZEN", "BAG", "BOTTLE", "SET", "REAM", "PACK" }));
        junit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junitActionPerformed(evt);
            }
        });

        jcolors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcolorsMouseClicked(evt);
            }
        });
        jcolors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcolorsActionPerformed(evt);
            }
        });

        jsize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsizeMouseClicked(evt);
            }
        });
        jsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsizeActionPerformed(evt);
            }
        });

        jkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkgActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel10.setText("PRODUCTS");

        CLOSE.setText("CLOSE");
        CLOSE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel11.setText("CATEGORY");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel12.setText("UNIT");

        jgtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgtinActionPerformed(evt);
            }
        });
        jgtin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jgtinKeyPressed(evt);
            }
        });

        CLEAR.setText("CLEAR");
        CLEAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        DisplayName.setEditable(false);
        DisplayName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DisplayName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DisplayName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayNameActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("NEW ITEMS DATA ENTRY");

        jcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcatMouseClicked(evt);
            }
        });
        jcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CLEAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CLOSE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdsc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jqon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jprod, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jcat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(junit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jcolors, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(4, 4, 4)
                                        .addComponent(jsize, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jkg, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(var_type, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdes, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jsup))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jitem_code, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jgtin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel3)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jvt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jitem_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel19))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel23)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jvita, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(item_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(711, Short.MAX_VALUE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(711, Short.MAX_VALUE)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(711, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(Sizes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(703, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(var_type, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jvita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jgtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jitem_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jitem_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(junit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcolors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(5, 5, 5)
                        .addComponent(jqon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CLEAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CLOSE)
                                .addComponent(SAVE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(item_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Sizes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        JTextField[] textFields = {
        jitem_code, jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup,
        jprod, jcat, jcolors, jsize, jkg, jsp, jdsc, jqon
        };
        for (JTextField textField : textFields) {
                  textField.setText("");
          
        }
         c_phaseout.setEnabled(false);
         junit.setSelectedItem(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_CLEARActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CLOSEActionPerformed

    private void jitem_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitem_codeActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        itm_code = jitem_code.getText().trim();
      if(jitem_code.getText().isEmpty()){  
       JOptionPane.showMessageDialog(null, "Add Item Code!");   
       JTextField[] textFields = {
        jitem_code, jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup, jprod, jcat, jcolors, jsize,
        jkg, jsp, jdsc, jqon     
        };
    
        for (JTextField textField : textFields) {
          if (textField != jitem_code) {
           textField.setText("");
            textField.setEditable(false);
             }else {
                textField.setText(""); // Optional, to clear the text in txtBA
                  textField.setEditable(true);
               }
         }
        junit.setEnabled(false);
        c_phaseout.setEnabled(false);        
      }else{
          try{         
            String search_sql = "SELECT * FROM ITEMS WHERE ITMCOD = '"+itm_code+"'";
            PreparedStatement stmt_search = conn_obj.prepareStatement(search_sql);
            ResultSet rs_search = stmt_search.executeQuery();

            int a = 0;
            while(rs_search.next()){
                a++;
            }
         
            String search_sql2 = "SELECT * FROM ITEMS_IOPS WHERE ITMCOD = '"+itm_code+"'";
            PreparedStatement stmt_search2 = conn_obj.prepareStatement(search_sql2);
            ResultSet rs_search2 = stmt_search2.executeQuery();

            int b = 0;
            while(rs_search2.next()){
                b++;
            }
          
            String search_sql3 = "SELECT * FROM ITEMS_DWD WHERE ITMCOD = '"+itm_code+"'";
            PreparedStatement stmt_search3 = conn_obj.prepareStatement(search_sql3);
            ResultSet rs_search3 = stmt_search3.executeQuery();

            int c = 0;
            while(rs_search3.next()){
                c++;
            }
                     
       if (a > 0 || b > 0 || c > 0) {
            if(b > 0 && c > 0){
                JOptionPane.showMessageDialog(null, "This item code already exists in IOPS and DWD.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
           setEditable(false);
           junit.setEnabled(false);
           c_phaseout.setEnabled(false);
           }else if( a > 0 && c > 0){
               JOptionPane.showMessageDialog(null, "This Item Code is already exists Direct Selling and DWD!", "INFORMATION" , JOptionPane.INFORMATION_MESSAGE);
            setEditable(false);
           junit.setEnabled(false);
           c_phaseout.setEnabled(false);   
           }else if (a > 0 && b > 0 ) {
               JOptionPane.showMessageDialog(null, "This Item Code is already exists in Direct Selling and IOPS!", "INFORMATION" , JOptionPane.INFORMATION_MESSAGE);
           setEditable(true);
           junit.setEnabled(false);
           c_phaseout.setEnabled(false);
           }else{
                 JOptionPane.showMessageDialog(null, "Table already exists!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
           setEditable(false);
           junit.setEnabled(false);
           c_phaseout.setEnabled(false);     
           }
       }else{        
            JTextField[] textFields = {
             jitem_code, jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup, jprod, jcat, jcolors, jsize,
             jkg, jsp, jdsc, jqon     
             };
    
            for (JTextField textField : textFields) {
            if (textField != jitem_code) {     
            textField.setEditable(true);
            }
         }
        junit.setEnabled(true);
        c_phaseout.setEnabled(true);
       }
            } catch (SQLException ex) {
               Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
            }      
      }
     
    }//GEN-LAST:event_jitem_codeActionPerformed

    private void jdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdesActionPerformed

    private void jprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprodActionPerformed

    private void jcolorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcolorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcolorsActionPerformed

    private void jsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsizeActionPerformed
     
    }//GEN-LAST:event_jsizeActionPerformed

    private void jkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkgActionPerformed

    private void jgtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgtinActionPerformed

    }//GEN-LAST:event_jgtinActionPerformed

    private void jgtinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jgtinKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jgtin.setEditable(false);
            JOptionPane.showMessageDialog(null, "GTIN Input Numbers Only!");
        }
        else{
            jgtin.setEditable(true);
        }
    }//GEN-LAST:event_jgtinKeyPressed

    private void jspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jspActionPerformed

    private void jdscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdscActionPerformed

    private void jqonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jqonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jqonActionPerformed

    private void c_phaseoutjCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_phaseoutjCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_phaseoutjCheckBox1ActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();

        itm_code=jitem_code.getText().trim();
        date_enc=jdate.getText().trim();
        gtin=jgtin.getText().trim();
        vtype=jvt.getText().trim();
        itm_cat=jitem_cat.getText().trim();
        msvita=jvita.getText().trim();
        des=jdes.getText().trim();
        supp =jsup.getText().trim();
        prods=jprod.getText().trim();
        cat=jcat.getText().trim();
        if (junit != null && junit.getSelectedItem() != null) {
          unit = junit.getSelectedItem().toString().trim();
        }else {
          unit = null;
        }
        colors=jcolors.getText().trim();
        size =jsize.getText().trim();
        kg=jkg.getText().trim();
        sel_prc =jsp.getText().trim();
        dscnt =jdsc.getText().trim();
        qon=jqon.getText().trim();

            if( "DOZEN".equals(unit)){
                unit1 = "DOZEN";
            }else if("PAIR".equals(unit)){
                unit1 = "PAIR";
            }else if( "PACK".equals(unit)){
                unit1 = "PACK";
            }else if("PIECE(S)".equals(unit)){
                unit1 = "PIECE(S)";
            }else if( "BOX".equals(unit)){
                unit1 = "BOX";
            }else if("REAM".equals(unit)){
                unit1 = "REAM";
            }else if( "BOTTLE".equals(unit)){
                unit1 = "BOTTLE";
            }else if("SET".equals(unit)){
                unit1 = "SET";
            }else if( "BAG".equals(unit)){
                unit1 = "BAG";
            }else {
                unit1 = null;
            }
            
            if(c_phaseout.isSelected()){
                phase = "T";                 
            }else{
             phase = "F";
            }
                if (!jqon.getText().isEmpty()) {
                    qty = Integer.parseInt(jqon.getText());
                } else {
                    qty = 0;
                }
                if (!jsp.getText().isEmpty()) {
                     sp = Integer.parseInt(jsp.getText());  
                } else {
                     sp = null;
                }              
                if (!jdsc.getText().isEmpty()) {
                     discount = Integer.parseInt(jdsc.getText());  
                } else {
                    discount = null;
                }                        
                if (!jkg.getText().isEmpty()) {
                     wght = Integer.parseInt(jkg.getText()); 
                } else {
                     wght = null;
                }           
       
           if(!jitem_code.getText().isEmpty()){         
           String checkExistenceSql = "SELECT COUNT(*) FROM ITEMS WHERE ITMCOD = ?";
           try (PreparedStatement stmt_checkExistence = conn_obj.prepareStatement(checkExistenceSql)) {
           stmt_checkExistence.setString(1, itm_code);
           try (ResultSet rs_checkExistence = stmt_checkExistence.executeQuery()) {
           rs_checkExistence.next();
             int rowCount = rs_checkExistence.getInt(1);     
                 if (rowCount == 0) {
                    String insert_sql = "INSERT INTO ITEMS (ITMCOD, DTE_ENCODED, GTIN, VTYPE, ITMCATEGORY, FORSALE, DES, SUPNME, PRDUCTS, CATEG, "
                    + "UNT, CLORS, SZES, WEIGHT, DISCNT, SELPRCE, QTYHND, ISFACEOUT) "
                    + "VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                       try (PreparedStatement stmt_insert = conn_obj.prepareStatement(insert_sql)) {
                         stmt_insert.setString(1, itm_code);
                         stmt_insert.setString(2, date_enc);
                         stmt_insert.setString(3, gtin);
                         stmt_insert.setString(4, vtype);
                         stmt_insert.setString(5, itm_cat);
                         stmt_insert.setString(6, msvita);
                         stmt_insert.setString(7, des);
                         stmt_insert.setString(8, supp);
                         stmt_insert.setString(9, prods);
                         stmt_insert.setString(10, cat);
                         stmt_insert.setString(11, unit1);
                         stmt_insert.setString(12, colors);
                         stmt_insert.setString(13, size);
                         stmt_insert.setObject(14, wght);
                         stmt_insert.setObject(15, discount);
                         stmt_insert.setObject(16, sp);
                         stmt_insert.setObject(17, qty);
                         stmt_insert.setString(18, phase);                          
                         stmt_insert.executeUpdate();                             
                            }   
                        }else{
                       JOptionPane.showMessageDialog(null, "This Item Code is existing in ITEMS!!");
                 } 
                      }      
                 } catch (SQLException ex) {
                 }
              
             String checkExistenceSql2 = "SELECT COUNT(*) FROM ITEMS_IOPS WHERE ITMCOD = ?";
                try (PreparedStatement stmt_checkExistence2 = conn_obj.prepareStatement(checkExistenceSql2)) {
                    stmt_checkExistence2.setString(1, itm_code);
                    try (ResultSet rs_checkExistence2 = stmt_checkExistence2.executeQuery()) {
                        rs_checkExistence2.next();
                        int rowCount2 = rs_checkExistence2.getInt(1);
                        
                        if (rowCount2 == 0) {
                           String insert_sql2 = "INSERT INTO ITEMS_IOPS (ITMCOD, DTE_ENCODED, GTIN, VTYPE, ITMCATEGORY, FORSALE, DES, SUPNME, PRDUCTS, CATEG, "
                                    + "UNT, CLORS, SZES, WEIGHT, DISCNT, SELPRCE, QTYHND, ISFACEOUT) "
                                    + "VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            try (PreparedStatement stmt_insert2 = conn_obj.prepareStatement(insert_sql2)) {
                                stmt_insert2.setString(1, itm_code);
                                stmt_insert2.setString(2, date_enc);
                                stmt_insert2.setString(3, gtin);
                                stmt_insert2.setString(4, vtype);
                                stmt_insert2.setString(5, itm_cat);
                                stmt_insert2.setString(6, msvita);
                                stmt_insert2.setString(7, des);
                                stmt_insert2.setString(8, supp);
                                stmt_insert2.setString(9, prods);
                                stmt_insert2.setString(10, cat);
                                stmt_insert2.setString(11, unit1);
                                stmt_insert2.setString(12, colors);
                                stmt_insert2.setString(13, size);
                                stmt_insert2.setObject(14, wght);
                                stmt_insert2.setObject(15, discount);
                                stmt_insert2.setObject(16, sp);
                                stmt_insert2.setObject(17, qty);
                                stmt_insert2.setString(18, phase);                          
                                stmt_insert2.executeUpdate();                             
                            }   
                        }else{
                       JOptionPane.showMessageDialog(null, "This Item Code is existing in IOPS!!");
                        }  
                    }
                  } catch (SQLException ex) {
                  }
                
                String checkExistenceSql3 = "SELECT COUNT(*) FROM ITEMS_DWD WHERE ITMCOD = ?";
                try (PreparedStatement stmt_checkExistence3 = conn_obj.prepareStatement(checkExistenceSql3)) {
                stmt_checkExistence3.setString(1, itm_code);
                try (ResultSet rs_checkExistence3 = stmt_checkExistence3.executeQuery()) {
                  rs_checkExistence3.next();
                    int rowCount3 = rs_checkExistence3.getInt(1);
                        if (rowCount3 == 0) {
                           String insert_sql3 = "INSERT INTO ITEMS_DWD (ITMCOD, DTE_ENCODED, GTIN, VTYPE, ITMCATEGORY, FORSALE, DES, SUPNME, PRDUCTS, CATEG, "
                                    + "UNT, CLORS, SZES, WEIGHT, DISCNT, SELPRCE, QTYHND, ISFACEOUT) "
                                    + "VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            try (PreparedStatement stmt_insert3 = conn_obj.prepareStatement(insert_sql3)) {
                                stmt_insert3.setString(1, itm_code);
                                stmt_insert3.setString(2, date_enc);
                                stmt_insert3.setString(3, gtin);
                                stmt_insert3.setString(4, vtype);
                                stmt_insert3.setString(5, itm_cat);
                                stmt_insert3.setString(6, msvita);
                                stmt_insert3.setString(7, des);
                                stmt_insert3.setString(8, supp);
                                stmt_insert3.setString(9, prods);
                                stmt_insert3.setString(10, cat);
                                stmt_insert3.setString(11, unit1);
                                stmt_insert3.setString(12, colors);
                                stmt_insert3.setString(13, size);
                                stmt_insert3.setObject(14, wght);
                                stmt_insert3.setObject(15, discount);
                                stmt_insert3.setObject(16, sp);
                                stmt_insert3.setObject(17, qty);
                                stmt_insert3.setString(18, phase);                          
                                stmt_insert3.executeUpdate();                             
                            }   
                        }else{
                       JOptionPane.showMessageDialog(null, "This ItemCode is existing in DWD!!");
                        }   
                    }
                  } catch (SQLException ex) {
                  }
          
                
                String checkExistenceSql4 = "SELECT COUNT(*) FROM ITEMS_WHSE WHERE ITMCOD = ?";
                try (PreparedStatement stmt_checkExistence4 = conn_obj.prepareStatement(checkExistenceSql4)) {
                stmt_checkExistence4.setString(1, itm_code);
                try (ResultSet rs_checkExistence4 = stmt_checkExistence4.executeQuery()) {
                  rs_checkExistence4.next();
                    int rowCount4 = rs_checkExistence4.getInt(1);
                        if (rowCount4 == 0) {
                           String insert_sql4 = "INSERT INTO ITEMS_WHSE (ITMCOD, DTE_ENCODED, GTIN, VTYPE, ITMCATEGORY, FORSALE, DES, SUPNME, PRDUCTS, CATEG, "
                                    + "UNT, CLORS, SZES, WEIGHT, DISCNT, SELPRCE, QTYHND, ISFACEOUT) "
                                    + "VALUES (?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            try (PreparedStatement stmt_insert4 = conn_obj.prepareStatement(insert_sql4)) {
                                stmt_insert4.setString(1, itm_code);
                                stmt_insert4.setString(2, date_enc);
                                stmt_insert4.setString(3, gtin);
                                stmt_insert4.setString(4, vtype);
                                stmt_insert4.setString(5, itm_cat);
                                stmt_insert4.setString(6, msvita);
                                stmt_insert4.setString(7, des);
                                stmt_insert4.setString(8, supp);
                                stmt_insert4.setString(9, prods);
                                stmt_insert4.setString(10, cat);
                                stmt_insert4.setString(11, unit1);
                                stmt_insert4.setString(12, colors);
                                stmt_insert4.setString(13, size);
                                stmt_insert4.setObject(14, wght);
                                stmt_insert4.setObject(15, discount);
                                stmt_insert4.setObject(16, sp);
                                stmt_insert4.setObject(17, qty);
                                stmt_insert4.setString(18, phase);                          
                                stmt_insert4.executeUpdate();                             
                            }   
                        }else{
                       JOptionPane.showMessageDialog(null, "This ItemCode is existing in WAREHOUSE-PARANG!");
                        }   
                    }
                  } catch (SQLException ex) {
                  }
                
             
                
              String supplierValue = jsup.getText().trim();   
              if(supplierValue.equalsIgnoreCase("SCQ") || supplierValue.equalsIgnoreCase("SOC")){
               String checkExistenceSql1 = "SELECT COUNT(*) FROM ITEMS_SCQ WHERE ITMCOD = ? ";
               try (PreparedStatement stmt_checkExistence1 = conn_obj.prepareStatement(checkExistenceSql1)) {
               stmt_checkExistence1.setString(1, itm_code);
               try (ResultSet rs_checkExistence1 = stmt_checkExistence1.executeQuery()) {
               rs_checkExistence1.next();
                  int rowCount1 = rs_checkExistence1.getInt(1);      
                      if (rowCount1 == 0) {
                         String insert_sql1 = "INSERT INTO ITEMS_SCQ (ITMCOD, DES, SUPNME, SELPRCE, DISCNT, ISFACEOUT, ISPROMO, T_CODE) "
                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                           try (PreparedStatement stmt_insert1 = conn_obj.prepareStatement(insert_sql1)) {
                               stmt_insert1.setString(1, itm_code);
                               stmt_insert1.setString(2, des);
                               stmt_insert1.setString(3, supp);  
                               stmt_insert1.setObject(4, sp);
                               stmt_insert1.setObject(5, discount);
                               stmt_insert1.setString(6, phase);                             
                               stmt_insert1.setString(7, promo);
                               stmt_insert1.setString(8, tcode);
                               stmt_insert1.executeUpdate();
                            }     
                           }
                          }
                       
                       } catch (SQLException ex) {
                       }          
                    }  
              
               if(supplierValue.equalsIgnoreCase("SIR KALOYS HEALTH CAFE") || supplierValue.equalsIgnoreCase("FQPI2") 
               || supplierValue.equalsIgnoreCase("HERBAL BLESSING") || supplierValue.equalsIgnoreCase("THE SOAP FACTORY (TSF)")){
               String checkExistenceSql1 = "SELECT COUNT(*) FROM PRODMOVE_21ST WHERE ITMCOD = ? ";
               try (PreparedStatement stmt_checkExistence1 = conn_obj.prepareStatement(checkExistenceSql1)) {
               stmt_checkExistence1.setString(1, itm_code);
               try (ResultSet rs_checkExistence1 = stmt_checkExistence1.executeQuery()) {
               rs_checkExistence1.next();
                  int rowCount1 = rs_checkExistence1.getInt(1);      
                      if (rowCount1 == 0) {
                         String insert_sql1 = "INSERT INTO PRODMOVE_21ST (ITMCOD, DES, SUPNME, QTY) VALUES (?, ?, ?, '0')";
                           try (PreparedStatement stmt_insert1 = conn_obj.prepareStatement(insert_sql1)) {
                               stmt_insert1.setString(1, itm_code);
                               stmt_insert1.setString(2, des);
                               stmt_insert1.setString(3, supp);               
                               stmt_insert1.executeUpdate();
                            }     
                           }
                          }
                       
                       } catch (SQLException ex) {
                       }
                     }
 
               if(supplierValue.equalsIgnoreCase("SIR KALOYS HEALTH CAFE") || supplierValue.equalsIgnoreCase("FQPI2") 
               || supplierValue.equalsIgnoreCase("HERBAL BLESSING") || supplierValue.equalsIgnoreCase("THE SOAP FACTORY (TSF)")){
               String checkExistenceSql1 = "SELECT COUNT(*) FROM PRODMOVE_CONSO WHERE ITMCOD = ? ";
               try (PreparedStatement stmt_checkExistence1 = conn_obj.prepareStatement(checkExistenceSql1)) {
               stmt_checkExistence1.setString(1, itm_code);
               try (ResultSet rs_checkExistence1 = stmt_checkExistence1.executeQuery()) {
               rs_checkExistence1.next();
                  int rowCount1 = rs_checkExistence1.getInt(1);      
                     if (rowCount1 == 0) {
                        String insert_sql1 = "INSERT INTO PRODMOVE_CONSO (ITMCOD, DES, SUPNME, QTY) VALUES (?, ?, ?, '0')";
                           try (PreparedStatement stmt_insert1 = conn_obj.prepareStatement(insert_sql1)) {
                              stmt_insert1.setString(1, itm_code);
                              stmt_insert1.setString(2, des);
                              stmt_insert1.setString(3, supp);               
                              stmt_insert1.executeUpdate();
                            }     
                           }
                          }
                            }catch(SQLException ex) {
                              ex.printStackTrace(); 
                            }
                       }
                     
               if(supplierValue.equalsIgnoreCase("SIR KALOYS HEALTH CAFE") || supplierValue.equalsIgnoreCase("FQPI2") 
               || supplierValue.equalsIgnoreCase("HERBAL BLESSING") || supplierValue.equalsIgnoreCase("THE SOAP FACTORY (TSF)")){
               String checkExistenceSql1 = "SELECT COUNT(*) FROM PRODMOVE_19TH WHERE ITMCOD = ? ";
               try (PreparedStatement stmt_checkExistence1 = conn_obj.prepareStatement(checkExistenceSql1)) {
               stmt_checkExistence1.setString(1, itm_code);
               try (ResultSet rs_checkExistence1 = stmt_checkExistence1.executeQuery()) {
               rs_checkExistence1.next();
                  int rowCount1 = rs_checkExistence1.getInt(1);      
                     if (rowCount1 == 0) {
                        String insert_sql1 = "INSERT INTO PRODMOVE_19TH (ITMCOD, DES, SUPNME, QTY) VALUES (?, ?, ?, '0')";
                           try (PreparedStatement stmt_insert1 = conn_obj.prepareStatement(insert_sql1)) {
                              stmt_insert1.setString(1, itm_code);
                              stmt_insert1.setString(2, des);
                              stmt_insert1.setString(3, supp);               
                              stmt_insert1.executeUpdate();
                            }     
                           }
                          }
                            }catch(SQLException ex) {
                              ex.printStackTrace(); 
                            }
                       }
                
               if(supplierValue.equalsIgnoreCase("SIR KALOYS HEALTH CAFE") || supplierValue.equalsIgnoreCase("FQPI2") 
               || supplierValue.equalsIgnoreCase("HERBAL BLESSING") || supplierValue.equalsIgnoreCase("THE SOAP FACTORY (TSF)")){
               String checkExistenceSql1 = "SELECT COUNT(*) FROM PRODMOVE_IMIN WHERE ITMCOD = ? ";
               try (PreparedStatement stmt_checkExistence1 = conn_obj.prepareStatement(checkExistenceSql1)) {
               stmt_checkExistence1.setString(1, itm_code);
               try (ResultSet rs_checkExistence1 = stmt_checkExistence1.executeQuery()) {
               rs_checkExistence1.next();
                  int rowCount1 = rs_checkExistence1.getInt(1);      
                     if (rowCount1 == 0) {
                        String insert_sql1 = "INSERT INTO PRODMOVE_IMIN (ITMCOD, DES, SUPNME, QTY) VALUES (?, ?, ?, '0')";
                           try (PreparedStatement stmt_insert1 = conn_obj.prepareStatement(insert_sql1)) {
                              stmt_insert1.setString(1, itm_code);
                              stmt_insert1.setString(2, des);
                              stmt_insert1.setString(3, supp);               
                              stmt_insert1.executeUpdate();
                            }     
                           }
                          }
                            }catch(SQLException ex) {
                              ex.printStackTrace(); 
                            }
                       }
                
                
                    try { 
                        conn_obj.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                    }            
          JOptionPane.showMessageDialog(null, "Saved Successfuly!","SUCCESS", JOptionPane.INFORMATION_MESSAGE);
        
        JTextField[] textFields = {
        jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup,
        jprod, jcat, jcolors, jsize, jkg, jsp, jdsc, jqon
        };
        for (JTextField textField : textFields) {
           textField.setEditable(false);
           textField.setText("");  
        }
         c_phaseout.setEnabled(false);
         junit.setSelectedItem(null);
       }else{
          JOptionPane.showMessageDialog(null, "No Record Found!","ERROR", JOptionPane.WARNING_MESSAGE);         
            }
      
    }//GEN-LAST:event_SAVEActionPerformed

    private void jvitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvitaActionPerformed

    private void DisplayNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayNameActionPerformed

    private void jvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvtActionPerformed
 
    }//GEN-LAST:event_jvtActionPerformed

    private void jitem_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitem_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jitem_catActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
   var_type.dispose();
     
    }//GEN-LAST:event_close1ActionPerformed

    private void VarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarSearchActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        String searchText = VarSearch.getText().trim();

        try {       
            DefaultListModel vt_model = new DefaultListModel();      
            String sql_list1 = "SELECT DISTINCT VTYPE FROM ITEMS WHERE VTYPE LIKE ?";
            PreparedStatement stmt_list1 = conn_obj.prepareStatement(sql_list1);
            stmt_list1.setString(1, "%" + searchText + "%");
            ResultSet rs_list1 = stmt_list1.executeQuery();

            while (rs_list1.next()) {
                String vtValue = rs_list1.getString("VTYPE");
                vt_model.addElement(vtValue);
            }
              vt_list.setModel(vt_model);
            {
                conn_obj.close();  
                rs_list1.close();
                stmt_list1.close();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VarSearchActionPerformed

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
    item_cat.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_close2ActionPerformed

    private void ItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSearchActionPerformed
        Connection conn_obj = OracleSqlConnect.ConnectDB();
        String searchText = ItemSearch.getText().trim();
        try {       
            DefaultListModel item_cat_model = new DefaultListModel();
            String sql_list2 = "SELECT DISTINCT ITMCATEGORY FROM ITEMS WHERE ITMCATEGORY LIKE ? ";
            PreparedStatement stmt_list2 = conn_obj.prepareStatement(sql_list2);
            stmt_list2.setString(1, "%" + searchText + "%");
            ResultSet rs_list2 = stmt_list2.executeQuery();
                
            while (rs_list2.next()) {
            String itemValue = rs_list2.getString("ITMCATEGORY");                
            item_cat_model.addElement(itemValue);
                    }
                    item_list.setModel(item_cat_model);                  
                    {
                conn_obj.close();  
                rs_list2.close();
                stmt_list2.close();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }
                // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_ItemSearchActionPerformed

    private void jitem_catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jitem_catMouseClicked

    }//GEN-LAST:event_jitem_catMouseClicked

    private void close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close5ActionPerformed
    supplier.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_close5ActionPerformed

    private void txtSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch4ActionPerformed

    private void jsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsupMouseClicked
  
    }//GEN-LAST:event_jsupMouseClicked

    private void jprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jprodMouseClicked
    
    }//GEN-LAST:event_jprodMouseClicked

    private void close7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close7ActionPerformed
    products.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_close7ActionPerformed

    private void ProdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdSearchActionPerformed
       Connection conn_obj = OracleSqlConnect.ConnectDB();
       String searchText = ProdSearch.getText().trim();
        try {
                    DefaultListModel prod_model = new DefaultListModel();
                    String sql_list3 = "SELECT DISTINCT PRDUCTS FROM ITEMS WHERE FORSALE = 'T' AND PRDUCTS LIKE ? ";
                    PreparedStatement stmt_list3 = conn_obj.prepareStatement(sql_list3);
                    stmt_list3.setString(1, "%" + searchText + "%");
                    ResultSet rs_list3 = stmt_list3.executeQuery();
                  
                    while (rs_list3.next()) {
                    String prodValue = rs_list3.getString("PRDUCTS");                
                    prod_model.addElement(prodValue);
                    }
                   prod_list.setModel(prod_model);
                    {
                rs_list3.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_ProdSearchActionPerformed

    private void close8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close8ActionPerformed
    color.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_close8ActionPerformed

    private void ColorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorSearchActionPerformed
         Connection conn_obj = OracleSqlConnect.ConnectDB();
         String searchText = ColorSearch.getText().trim();
         try {
                    DefaultListModel color_model = new DefaultListModel();
                    String sql_list4 = "SELECT DISTINCT CLORS FROM ITEMS WHERE CLORS LIKE ? ";
                    PreparedStatement stmt_list4 = conn_obj.prepareStatement(sql_list4);
                    stmt_list4.setString(1, "%" + searchText + "%");
                    ResultSet rs_list4 = stmt_list4.executeQuery();
                  
                    while (rs_list4.next()) {
                    String colorValue = rs_list4.getString("CLORS");                
                    color_model.addElement(colorValue);
                    }
                    color_list.setModel(color_model);
                    
                    
                    {
                rs_list4.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_ColorSearchActionPerformed

    private void jcolorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcolorsMouseClicked
       
    }//GEN-LAST:event_jcolorsMouseClicked

    private void close9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close9ActionPerformed
    Sizes.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_close9ActionPerformed

    private void SizeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeSearchActionPerformed
          Connection conn_obj = OracleSqlConnect.ConnectDB();
          String searchText = SizeSearch.getText().trim();
        try {
                    DefaultListModel size_model = new DefaultListModel();
                    String sql_list5 = "SELECT DISTINCT SZES FROM ITEMS WHERE SZES LIKE ? ";
                    PreparedStatement stmt_list5 = conn_obj.prepareStatement(sql_list5);
                    stmt_list5.setString(1, "%" + searchText + "%");
                    ResultSet rs_list5 = stmt_list5.executeQuery();
                  
                    while (rs_list5.next()) {
                    String sizeValue = rs_list5.getString("SZES");                
                    size_model.addElement(sizeValue);
                    }
                    size_list.setModel(size_model);
                   {
                rs_list5.close();
                conn_obj.close();
                    }

                
                } catch (SQLException ex) {
                    Logger.getLogger(ITEMS_DATA_ENTRY_NEW.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_SizeSearchActionPerformed

    private void jsizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsizeMouseClicked
   
    }//GEN-LAST:event_jsizeMouseClicked

    private void VarSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VarSearchKeyPressed
      
         
    }//GEN-LAST:event_VarSearchKeyPressed

    private void junitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_junitActionPerformed

    private void jitem_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jitem_codeKeyReleased

         if (!(Pattern.matches("^[a-zA-Z0-9\\s-]*$", jitem_code.getText()))) {
         jitem_code.setText("");
         JOptionPane.showMessageDialog(null, "Special Character is invalid.","Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jitem_codeKeyReleased

    private void okayVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayVTActionPerformed
                Object selectedValue = vt_list.getSelectedValue();            
                jvt.setText(selectedValue != null ? selectedValue.toString() : "");
                var_type.dispose();
           
    }//GEN-LAST:event_okayVTActionPerformed

    private void vt_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vt_listMouseEntered
        vt_list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
               Object selectedValue = vt_list.getSelectedValue();            
                 jvt.setText(selectedValue != null ? selectedValue.toString() : "");
                 var_type.dispose();
                }          
            }
        });
       // TODO add your handling code here:
    }//GEN-LAST:event_vt_listMouseEntered

    private void item_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_listMouseEntered
          item_list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
               Object selectedValue = item_list.getSelectedValue();            
                 jitem_cat.setText(selectedValue != null ? selectedValue.toString() : "");
                 item_cat.dispose();
                }          
            }
        });

    }//GEN-LAST:event_item_listMouseEntered

    private void okayITEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayITEMActionPerformed
        Object selectedValue = item_list.getSelectedValue();            
        jitem_cat.setText(selectedValue != null ? selectedValue.toString() : "");
        item_cat.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_okayITEMActionPerformed

    private void sup_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_listMouseEntered
        sup_list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
               Object selectedValue = sup_list.getSelectedValue();            
                 jsup.setText(selectedValue != null ? selectedValue.toString() : "");
                 supplier.dispose();
                }          
            }
        });
    }//GEN-LAST:event_sup_listMouseEntered

    private void okaySUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okaySUPActionPerformed
              Object selectedValue = sup_list.getSelectedValue();            
                jsup.setText(selectedValue != null ? selectedValue.toString() : "");
                supplier.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_okaySUPActionPerformed

    private void prod_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_listMouseEntered
      prod_list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                 Object selectedValue = prod_list.getSelectedValue();            
                 jprod.setText(selectedValue != null ? selectedValue.toString() : "");
                 products.dispose();
                }          
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_listMouseEntered

    private void okayPRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayPRODActionPerformed
        Object selectedValue = prod_list.getSelectedValue();
        jprod.setText(selectedValue !=null ? selectedValue.toString() : " ");
        products.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_okayPRODActionPerformed

    private void color_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color_listMouseEntered
     color_list.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e){
             if(e.getClickCount()== 2){
              Object selectedValue = color_list.getSelectedValue();
              jcolors.setText(selectedValue !=null ? selectedValue.toString() : " ");
              color.dispose();
             }
         }
     });
         // TODO add your handling code here:
    }//GEN-LAST:event_color_listMouseEntered

    private void okayCOLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayCOLORActionPerformed
    Object selectedValue = color_list.getSelectedValue();
    jcolors.setText(selectedValue !=null ? selectedValue.toString(): " ");
        color.dispose();
    }//GEN-LAST:event_okayCOLORActionPerformed

    private void size_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_size_listMouseEntered
        size_list.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e){
           if(e.getClickCount()==2){
            Object selectedValue = size_list.getSelectedValue();
            jsize.setText(selectedValue !=null ? selectedValue.toString() : " ");
            Sizes.dispose();
           }  
         }
       });
    }//GEN-LAST:event_size_listMouseEntered

    private void okaySizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okaySizeActionPerformed
        Object selectedValue =  size_list.getSelectedValue();
        jsize.setText(selectedValue !=null ? selectedValue.toString() : " ");
        Sizes.dispose();    
    }//GEN-LAST:event_okaySizeActionPerformed

    private void jcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcatMouseClicked

    private void jcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcatActionPerformed

    private void jitem_codeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jitem_codeMouseEntered
         
    }//GEN-LAST:event_jitem_codeMouseEntered

    private void jitem_codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jitem_codeMouseClicked
   if(evt.getClickCount()==3){  
                   JTextField[] textFields = {
                    jitem_code, jdate, jgtin, jvt, jitem_cat, jvita, jdes, jsup,
                    jprod, jcat, jcolors, jsize, jkg, jsp, jdsc, jqon
                    };
                    for (JTextField textField : textFields) {
                              textField.setText("");

                    }
                     c_phaseout.setEnabled(false);
            }// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jitem_codeMouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITEMS_DATA_ENTRY_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton CLOSE;
    private javax.swing.JTextField ColorSearch;
    public javax.swing.JTextField DisplayName;
    private javax.swing.JTextField ItemSearch;
    private javax.swing.JTextField ProdSearch;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField SizeSearch;
    public javax.swing.JInternalFrame Sizes;
    private javax.swing.JTextField VarSearch;
    private javax.swing.JCheckBox c_phaseout;
    public javax.swing.JButton close1;
    private javax.swing.JButton close2;
    private javax.swing.JButton close5;
    private javax.swing.JButton close7;
    private javax.swing.JButton close8;
    private javax.swing.JButton close9;
    public javax.swing.JInternalFrame color;
    public javax.swing.JList<String> color_list;
    public javax.swing.JInternalFrame item_cat;
    public javax.swing.JList<String> item_list;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextField jcat;
    public javax.swing.JTextField jcolors;
    private javax.swing.JTextField jdate;
    private javax.swing.JTextField jdes;
    private javax.swing.JTextField jdsc;
    private javax.swing.JTextField jgtin;
    public javax.swing.JTextField jitem_cat;
    public javax.swing.JTextField jitem_code;
    private javax.swing.JTextField jkg;
    public javax.swing.JTextField jprod;
    private javax.swing.JTextField jqon;
    public javax.swing.JTextField jsize;
    private javax.swing.JTextField jsp;
    public javax.swing.JTextField jsup;
    private javax.swing.JComboBox<String> junit;
    private javax.swing.JTextField jvita;
    public javax.swing.JTextField jvt;
    private javax.swing.JButton okayCOLOR;
    private javax.swing.JButton okayITEM;
    private javax.swing.JButton okayPROD;
    private javax.swing.JButton okaySUP;
    private javax.swing.JButton okaySize;
    private javax.swing.JButton okayVT;
    public javax.swing.JList<String> prod_list;
    public javax.swing.JInternalFrame products;
    public javax.swing.JList<String> size_list;
    public javax.swing.JList<String> sup_list;
    public javax.swing.JInternalFrame supplier;
    private javax.swing.JTextField txtSearch4;
    public javax.swing.JInternalFrame var_type;
    public javax.swing.JList<String> vt_list;
    // End of variables declaration//GEN-END:variables
}
