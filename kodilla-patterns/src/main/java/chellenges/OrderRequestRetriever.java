package chellenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Patryk", "Kaźmierczak","Wodna 1 Gdańsk","pat151515@gmail.com",22,558245145 );
        Item item = new Item("Śrubokręt",15,12.20);
        return new OrderRequest (user,item);
    }
}
