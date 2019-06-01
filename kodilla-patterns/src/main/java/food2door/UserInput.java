package food2door;

import java.util.Scanner;

public class UserInput {
    public Scanner scanner = new Scanner (System.in);

    public Suppliers OptionScreen() {
        ListOfSuppliers listOfSuppliers = new ListOfSuppliers ();

        while (true) {
            System.out.println ("Key [1] - " + listOfSuppliers.suppliersList ().get (0).supplierName ());
            System.out.println ("Key [2] - " + listOfSuppliers.suppliersList ().get (1).supplierName ());
            System.out.println ("Key [3] - " + listOfSuppliers.suppliersList ().get (2).supplierName ());
            String userInput = scanner.nextLine ();
            switch (userInput) {
                case "1":
                    return listOfSuppliers.suppliersList ().get (0);
                case "2":
                    return listOfSuppliers.suppliersList ().get (1);
                case "3":
                    return listOfSuppliers.suppliersList ().get (2);
                default:
                    System.out.println ("Wrong selection, enter Your choice again!");
            }
        }
    }
}




