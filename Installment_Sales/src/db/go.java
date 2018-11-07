package db;

import Entity.Clients;
import com.mysql.jdbc.Driver;
//import com.sun.security.ntlm.Client;
//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import faciliti.Tolls;
import forms.frmAdd;
import forms.frmAddPhone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.DefaultMenuLayout;
import javax.swing.table.DefaultTableModel;

public class go {

    private static String url = "";
    private static Connection con;

    public static void setURL() {
        url = "jdbc:mysql://localhost:3306/facilit"
                + "?useUnicode=true&characterEncoding=UTF-8";
    }

    public static void setConnection() {

        setURL();
        try {
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Tolls.MsgBox(ex.getMessage(), "Error");
        }
    }

    public static boolean CheckUserAndPass(String UserName, String PassWord) {
        setConnection();
        try {
            Statement stmt = con.createStatement();
            String strCheck = "select * from users where username='" + UserName + "'and pass='" + PassWord + "'";
            stmt.executeQuery(strCheck);
            while (stmt.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();
            return false;
        } catch (SQLException ex) {
            Tolls.MsgBox(ex.getMessage(), "SQLخطأ ");
        }

        return false;
    }

    public static boolean RunNonQuery(String SQLStatment) {

        try {
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(SQLStatment);
            System.out.println("تمتمتمتمتمتم");
            con.close();
            return true;

        } catch (SQLException ex) {
            if (ex.getMessage().toString().equals("Cannot add or update a child row: a foreign key constraint fails (`facilit`.`clients`, CONSTRAINT `clients_ibfk_1` FOREIGN KEY (`NumberOperation`) REFERENCES `clients_phones` (`NumberOperation`))")) {
                Tolls.MsgBox("يجب إضافة رقم الهاتف", "تنبيه");

            } else if (ex.getMessage().substring(0, 9).equals("Duplicate")) {
                System.out.println(ex.getMessage());
                Tolls.MsgBox("تأكد من المعلومة المدخلة لأنها مسجلة من قبل", "sql...5555.. خطا");

            } else {
                System.out.println(ex.getMessage());
                Tolls.MsgBox(ex.getMessage(), "sql...5555.. خطا");

            }

        }

        return false;

    }

    public static void fillToJTable(String tableNameOrSlectStatement, JTable table) {

        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String StrSelect;
            String SPart = tableNameOrSlectStatement.substring(0, 7).toLowerCase();
            if ("select ".equals(SPart)) {
                StrSelect = tableNameOrSlectStatement;
            } else {
                StrSelect = "select * from " + tableNameOrSlectStatement;
            }

            rs = stmt.executeQuery(StrSelect);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {
                row = new Vector(c);
                for (int i = c; i >= 1; i--) {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if (table.getColumnCount() != c) {
                Tolls.MsgBox("JTable Columns Count Not Equal TO Query Columns Count\n JTable Columns Count Is :" + table.getColumnCount() + "\n Query Columns Count is :" + c, "×طأ في عدم تطابق");
            }
            con.close();

        } catch (SQLException ex) {
            Tolls.MsgBox(ex.getMessage(), "SQLخطأ ");
        }

    }

    public static String GetAutoNumber(String CoulumName, String TableName) {

        try {
            setConnection();
            Statement stmt = con.createStatement();
            String StrAutoN = "select max(" + CoulumName + ")+1 as autonum from " + TableName;
            String Num = "";
            stmt.execute(StrAutoN);
            while (stmt.getResultSet().next()) {
                Num = stmt.getResultSet().getString("autonum");
            }
            con.close();
            if (Num == null || "".equals(Num)) {
                return "1";
            } else {
                return Num;
            }
        } catch (SQLException ex) {
            Tolls.MsgBox(ex.getMessage(), "خطأ get auto number ");
            return "0";
        }

        /* try {
            setConnection();
            Statement stmt=con.createStatement();
            String StrAutoN = "select max ("+CoulumName+")+1 as autonum from "+TableName;
            String Num = "";
            stmt.executeQuery(StrAutoN);
            while(stmt.getResultSet().next()){
            Num = stmt.getResultSet().getString("autonum");
            }
            con.close();
            if(Num == null || "".equals(Num)){
            return "1";
            }
            else{
            return Num;
            }
            } catch (SQLException ex) {
            Tolls.MsgBox(ex.getMessage(), "خطا من eror get auto number ");
            }
            return "0";*/
    }

    public static String getSerial(int Num) {
        String Halfserial = "";
        setConnection();
        try {
            Statement stmt = con.createStatement();
            String Strselect = "select pass as serial from users where Num = "+Num;
            stmt.execute(Strselect);
            while (stmt.getResultSet().next()) {
                Halfserial = stmt.getResultSet().getString("serial");
            }
            con.close();
            return Halfserial;
        } catch (SQLException ex) {
            Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "nothing";
    }

    public static String getIP() {
      /* String Halfserial = "";
        setConnection();
        try {
            Statement stmt = con.createStatement();
            String Strselect = "select pass as serial from users where Num = 3";
            stmt.execute(Strselect);
            while (stmt.getResultSet().next()) {
                Halfserial = stmt.getResultSet().getString("serial");
            }
            con.close();
            return Halfserial;
        } catch (SQLException ex) {
            Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "nothing";*/
          String ip = "";
        String StrIp = "select pass as ip from users where Num = 4";
        setConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.execute(StrIp);
            while (stmt.getResultSet().next()) {
                ip = stmt.getResultSet().getString("ip");
            }
            con.close();
            return ip;
        } catch (SQLException ex) {
            Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "any ip";
    }

}
