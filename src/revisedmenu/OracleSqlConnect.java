package revisedmenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class OracleSqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.70:1521/QUADRNT", "dev", "neoquadro");//@192.168.0.108
            return conn;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
    }
    }
}
