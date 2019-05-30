package chellenges;

public class OrderedWarehouseService {
    public void createOrder(User user, Item item){
        System.out.println ("Ordered item: " + item.getItemName() + " for user : " + user.getUserName() + " sent to orderWarehouse");
    }
}
