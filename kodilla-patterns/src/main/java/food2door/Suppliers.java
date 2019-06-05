package food2door;

import java.util.HashSet;

public interface Suppliers {
    void process();
    String supplierName();
    HashSet<Vegetables>orderList();
    String contact();
}
