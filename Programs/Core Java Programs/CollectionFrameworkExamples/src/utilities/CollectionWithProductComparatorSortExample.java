package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionWithProductComparatorSortExample {
    public static void main(String[] args) {
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product(2,"TV",56000));
        listOfProducts.add(new Product(3,"Computer",35000));
        listOfProducts.add(new Product(1,"Laptop",98000));
        System.out.println("Before Sort");
        for(Product p: listOfProducts){
            System.out.println(p);
        }
        Collections.sort(listOfProducts,new ProductSortIdwiseAscOrder());
        System.out.println("");
        System.out.println("After Sort - Asc");
        for(Product p: listOfProducts){
            System.out.println(p);
        }
        Collections.sort(listOfProducts,new ProductSortIdwiseDescOrder());
        System.out.println("");
        System.out.println("After Sort - Desc");
        for(Product p: listOfProducts){
            System.out.println(p);
        }
    }
}
