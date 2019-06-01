package food2door;

import java.util.HashSet;

public class ExtraFoodShop implements Suppliers{
    private String supplierName;
    private String supplierPhone;

    public HashSet<Vegetables> getAvailableItems(){

        Vegetables carrots = new Vegetables (2,"carrots");
        Vegetables cabbages = new Vegetables (15,"cabbages");
        Vegetables cauliflower = new Vegetables (25,"cauliflower");
        Vegetables asparagus = new Vegetables (28,"asparagus");

        HashSet<Vegetables> availableVegetables = new HashSet<Vegetables> ();
        availableVegetables.add(carrots);
        availableVegetables.add(cabbages);
        availableVegetables.add(cauliflower);
        availableVegetables.add(asparagus);

        return availableVegetables;
    }
    @Override
    public void process(){
        System.out.println ("Your order is in process");
    }

    @Override
    public String supplierName() {
        return this.supplierName = "Extra FoodS Shop";
    }

    @Override
    public HashSet<Vegetables> orderList() {
        return getAvailableItems ();
    }

    @Override
    public String contact() {
        return this.supplierPhone ="600600200";
    }
}
