package utilities;

import java.util.Comparator;

public class ProductSortIdwiseAscOrder implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPid()-o2.getPid();
    }
}
