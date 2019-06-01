package food2door;

import java.util.ArrayList;

public class ListOfSuppliers {
    public ArrayList<Suppliers> suppliersList(){
        ArrayList<Suppliers> theList = new ArrayList<> ();
        theList.add(0,new ExtraFoodShop ());
        theList.add(1,new GlutenFreeShop());
        theList.add(2,new HealthyShop ());
        return theList;
    }
    public String toString(){
        return "Available suppliers" + suppliersList ().get(0).supplierName ()
                + " " + suppliersList ().get (1).supplierName () + " " + suppliersList ().get (2).supplierName ();
    }

}
