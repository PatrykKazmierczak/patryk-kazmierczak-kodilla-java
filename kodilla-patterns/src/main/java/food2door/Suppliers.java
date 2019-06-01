package food2door;

import java.util.HashSet;

public interface Suppliers {
    public void process();
    public String supplierName();
    public HashSet<Vegetables>orderList();
    public String contact();
}
