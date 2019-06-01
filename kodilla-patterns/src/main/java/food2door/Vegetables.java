package food2door;

public class Vegetables {
    private Integer quantity;
    private String orderedItem;

    public Vegetables(Integer quantity, String orderedItem) {
        this.quantity = quantity;
        this.orderedItem = orderedItem;
    }
    @Override
    public String toString() {
        return "Vegetables{" + "quantity=" + quantity + ", orderedItem='" + orderedItem + '\'' + '}';
    }
}
