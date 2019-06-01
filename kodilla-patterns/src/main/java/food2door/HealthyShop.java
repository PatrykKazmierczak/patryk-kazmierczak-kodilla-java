package food2door;

import java.util.HashSet;

public class HealthyShop implements Suppliers{
    private String supplierName;
    private String supplierPhone;

    public HashSet<Vegetables> getAvailableItems(){

        Vegetables onions = new Vegetables (2,"onions");
        Vegetables garlic = new Vegetables (15,"garlic");
        Vegetables spinach = new Vegetables (25,"spinach");
        Vegetables celery = new Vegetables (28,"celery");
        Vegetables mushrooms = new Vegetables (29,"mushrooms");

        HashSet<Vegetables> availableVegetables = new HashSet<Vegetables> ();
        availableVegetables.add (onions);
        availableVegetables.add (garlic);
        availableVegetables.add (spinach);
        availableVegetables.add (celery);
        availableVegetables.add (mushrooms);

        return availableVegetables;
    }
    @Override
    public void process(){
        System.out.println ("Your order is in process");
    }
    @Override
    public String supplierName() {
        return this.supplierName = "Healthy Shop";
    }
    @Override
    public HashSet<Vegetables> orderList() {
        return getAvailableItems ();
    }
    @Override
    public String contact() {
        return this.supplierPhone ="600600100";
    }
}
