package chellenges;

public class ProductOrderServiceMain {
    public static  void main (String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever ();
        OrderRequest orderRequest = orderRequestRetriever.retrieve ();

        ProductOrderService productOrderService = new ProductOrderService (new MailInformationService (), new OrderedItems (), new OrderedWarehouseService ());
        productOrderService.process(orderRequest);
    }
}
