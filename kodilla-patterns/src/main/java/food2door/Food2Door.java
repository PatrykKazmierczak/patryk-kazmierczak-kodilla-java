package food2door;

public class Food2Door {
    public void food2Door() {
        System.out.println("Hello in Cisco");
        System.out.println("Please choose Your Favorite Producer");
        UserInput userInput = new UserInput();
        Suppliers selectedSupplier = userInput.OptionScreen();
        System.out.println("Here is the List of available products for " + selectedSupplier.supplierName ());
        System.out.println("Please choose what You want to order and contact with us: " + selectedSupplier.contact());
        System.out.println(selectedSupplier.orderList());
        selectedSupplier.process();
    }
}
