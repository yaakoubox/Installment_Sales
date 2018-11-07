
package Entity;

import faciliti.Tolls;
import javax.swing.JTable;


public class Phones implements MainData{
    public int NumberOperation;
    private String Phones;

    public int getNumberOperation() {
        return NumberOperation;
    }

    public void setNumberOperation(int NumberOperation) {
        this.NumberOperation = NumberOperation;
    }
    
    public String getPhones() {
        return Phones;
    }

    public void setPhones(String Phones) {
        this.Phones = Phones;
    }

    

   

    @Override
    public int add() {
        
        String AddPhone= "insert into clients_phones values ("
                + "'"+NumberOperation+"',"
                + "'"+Phones+"'"
                + ")";
        if(db.go.RunNonQuery(AddPhone)){
            Tolls.MsgBox("تم اضافة رقم الهاتف بنجاح لاضافة رقم هاتف اخر اضغط على ايقونة اضافة الهاتف مرة اخرى ", "إضافة رقم الهاتف  ");
            return 1;
        }else{
        return 0;
        }
    }

    @Override
    public int update(String f) {
        String StrUpdate = "update clients_phones set Phones = "+ Phones +" where NumberOperation = "+NumberOperation+" AND Phones = "+f;
        if(db.go.RunNonQuery(StrUpdate)){
            Tolls.MsgBox("تم تعديل رقم الهاتف بنجاح", "لم");
            return 1;
        }
        else{
        return 0;
        }
    }

    @Override
    public void delete(int NumberOperation) {
        String Strdelet =  "UPDATE clients_phones set Phones = "+" where NumberOperation ="+NumberOperation +" And Phones ="+Phones;
                
        if(db.go.RunNonQuery(Strdelet)){
           Tolls.MsgBox("تم حذف هذا الرقم بنجاح ", Strdelet);
        }
        
    }

    @Override
    public String getAutoNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows(JTable Table) {
        db.go.fillToJTable("select Phones from clients_phones where NumberOperation = " + NumberOperation ,Table);
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
