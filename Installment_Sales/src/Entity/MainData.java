package Entity;

import javax.swing.JTable;

public interface MainData {

    public int add();
    
    public int update(String f);
    
    public void delete(int NumberOperation);
    
    public String getAutoNumber();
    
    public void getAllRows(JTable Table );
    
    public void getOneRow(JTable Table);
    
    public void getCustemRows(String statment , JTable Table);
    
    public void getValueByName(String vlue);
    
    public void getNameByValue();
    
    
}
