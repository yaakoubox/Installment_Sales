/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author YOUCEF
 */
public class users implements MainData {

    private String username;
    private String pass;
    private int Num;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    @Override
    public int add() {
        try {
            String StrInsert = "insert into users values ('ip','" + Inet4Address.getLocalHost().getHostAddress() + "',4)";
            boolean IsAdded = db.go.RunNonQuery(StrInsert);
            if (IsAdded) {
                return 1;
            } else {
                return 0;
            }

        } catch (UnknownHostException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    @Override
    public int update(String f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int Num) {
        String strDelet = "delete from users where Num = '" + Num + "'";
        db.go.RunNonQuery(strDelet);
    }

    @Override
    public String getAutoNumber() {
        return db.go.GetAutoNumber("Num", "users");
    }

    @Override
    public void getAllRows(JTable Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getOneRow(JTable Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustemRows(String statment, JTable Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getValueByName(String vlue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNameByValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
