package chellenges;

public class ProductOrderService {

    private MailInformationService mailInformationService;
    private OrderedItems orderedItems;
    private OrderedWarehouseService orderedWarehouseService;

    public ProductOrderService(final MailInformationService mailInformationService,
                               final OrderedItems orderedItems,
                               final OrderedWarehouseService orderedWarehouseService) {
        this.mailInformationService = mailInformationService;
        this.orderedItems = orderedItems;
        this.orderedWarehouseService = orderedWarehouseService;
    }
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderedItems.buyNow(orderRequest.getUser(), orderRequest.getItem());

        if(isOrdered) {
            mailInformationService.inform(orderRequest.getUser());
            orderedWarehouseService.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
