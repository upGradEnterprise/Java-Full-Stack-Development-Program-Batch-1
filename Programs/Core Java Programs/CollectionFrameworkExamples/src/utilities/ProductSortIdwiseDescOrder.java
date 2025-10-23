package utilities;

import java.util.Comparator;

public class ProductSortIdwiseDescOrder implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPid()-o1.getPid();
    }
}
