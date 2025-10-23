package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raju");
        names.add("Ajay");
        names.add("Vikash");
        names.add("Mahesh");
        System.out.println("Before sort");
        for(String name:names){
            System.out.print(name+" ");
        }
        System.out.println("");
        Collections.sort(names);
        System.out.println("After sort - Asc");
        for(String name:names){
            System.out.print(name+" ");
        }
        Collections.reverse(names);
        System.out.println("");
        System.out.println("After sort - Desc");
        for(String name:names){
            System.out.print(name+" ");
        }
    }
}
