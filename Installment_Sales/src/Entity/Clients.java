package Entity;

import faciliti.Tolls;
import java.security.Key;
import javax.swing.JTable;

public class Clients implements MainData  {

    private int NumberOperation;
    private String Name;
    private String Adress;
    private String IdCard;
    private String ProdSell;
    private String Date;
    private double PriceProdSell;
    private double PricePay;
    private double PriceStill;
    private int NumberParts;
    private int NumberPartsStill;

    public int getNumberOperation() {
        return NumberOperation;
    }

    public void setNumberOperation(int NumberOperation) {
        this.NumberOperation = NumberOperation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    public String getProdSell() {
        return ProdSell;
    }

    public void setProdSell(String ProdSell) {
        this.ProdSell = ProdSell;
    }

    public double getPriceProdSell() {
        return PriceProdSell;
    }

    public void setPriceProdSell(double PriceProdSell) {
        this.PriceProdSell = PriceProdSell;
    }

    public double getPricePay() {
        return PricePay;
    }

    public void setPricePay(double PricePay) {
        this.PricePay = PricePay;
    }

    public double getPriceStill() {
        return PriceStill;
    }

    public void setPriceStill(double PriceStill) {
        this.PriceStill = PriceStill;
    }

    public int getNumberParts() {
        return NumberParts;
    }

    public void setNumberParts(int NumberParts) {
        this.NumberParts = NumberParts;
    }

    public int getNumberPartsStill() {
        return NumberPartsStill;
    }

    public void setNumberPartsStill(int NumberPartsStill) {
        this.NumberPartsStill = NumberPartsStill;
    }

    @Override
    public int add() {
        String stradd = "insert into clients values("
                + "'" + NumberOperation + "',"
                + "'" + Name + "',"
                + "'" + Adress + "',"
                + "'" + IdCard + "',"
                + "'" + ProdSell + "',"
                + "'"+Date+"',"
                + "'" + PriceProdSell + "',"
                + "'" + PricePay + "',"
                + "'" + PriceStill + "',"
                + "'" + NumberParts + "',"
                + "'" + NumberPartsStill + "'"
                + ")";
        if(db.go.RunNonQuery(stradd)){
            Tolls.MsgBox("تمت اضافة الزبون " +Name+ " بنجاح ", "تم");
            System.out.println("تم الاضافة");    
            return 1 ;
        }else{
            System.out.println("خطا في الاضافة");
            return  0 ;
        }
        

    }

    @Override
    public int update(String f) {
        String StrUpdate ="UPDATE clients set "
                + " Name = '"+Name+"',"
                + " Adress = '"+Adress+"',"
                + " IdCard = '"+IdCard+"',"
                + " ProdSell = '"+ProdSell+"',"
                + " Date = '"+Date+"',"
                + " PriceProdSell = "+PriceProdSell+","
                + " PricePay = "+PricePay+","
                + " PriceStill = "+PriceStill+","
                + " NumberParts = "+NumberParts+","
                + " NumberPartsStill = "+NumberPartsStill
                + " where NumberOperation = "+NumberOperation;
        
        if(db.go.RunNonQuery(StrUpdate)){
           Tolls.MsgBox("تمت تعديل معلومات  الزبون " +Name+ " بنجاح ", "تم");
           System.out.println("تم التعديل"); 
           return 1 ;
        }else{
            System.out.println("خطأ في الاضافة ");
            return  0 ;
        }
    }

    @Override
    public void delete(int NumberOperation) {
       String StrDelet = "delete from clients where NumberOperation = "+NumberOperation ;
       String StrDelet1=  "delete from clients_phones where NumberOperation = " +NumberOperation;
        System.out.println(StrDelet);
       if(db.go.RunNonQuery(StrDelet)){
           
       db.go.RunNonQuery(StrDelet1);
       
       }
               
    }

    @Override
    public String getAutoNumber() {
        String strauto = db.go.GetAutoNumber("NumberOperation","clients");
        return strauto;
    }

    @Override
    public void getAllRows(JTable Table ) {
       db.go.fillToJTable("select * from clients", Table);
    }

    @Override
    public void getOneRow(JTable Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustemRows(String statment, JTable Table) {
        db.go.fillToJTable(statment, Table);
    }

    @Override
    public void getValueByName(String vlue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNameByValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}
