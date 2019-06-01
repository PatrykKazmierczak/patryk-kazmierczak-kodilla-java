package food2door;

import java.util.HashSet;

public class GlutenFreeShop implements Suppliers {
    private String supplierName;
    private String supplierPhone;

    public HashSet<Vegetables> getAvailableItems(){

        Vegetables ginger = new Vegetables (2,"ginger");
        Vegetables lettuce = new Vegetables (15,"lettuce");
        Vegetables beans = new Vegetables (25,"beans");

        HashSet<Vegetables> availableVegetables = new HashSet<Vegetables> ();
        availableVegetables.add (ginger);
        availableVegetables.add (lettuce);
        availableVegetables.add (beans);

        return availableVegetables;
    }
    @Override
    public void process(){
        System.out.println ("Your order is in process");
    }
    @Override
    public String supplierName() {
        return this.supplierName = "Gluten Free Shop";
    }
    @Override
    public HashSet<Vegetables> orderList() {
        return getAvailableItems ();
    }
    @Override
    public String contact() {
        return this.supplierPhone ="600600300";
    }
}
