package utilities;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int num[]={4,1,7,9,3,2,6};
        System.out.println("Before Sort");
        for(int n:num){
            System.out.print(n+" ");
        }
        System.out.println("");
            Arrays.sort(num);
        System.out.println("After Sort");
        for(int n:num){
            System.out.print(n+" ");
        }
        System.out.println("");
        System.out.println("Binary search "+Arrays.binarySearch(num,3));
        System.out.println("Binary search "+Arrays.binarySearch(num,30));
        int searchElement =90;
        if(Arrays.binarySearch(num,searchElement)<0){
            System.out.println("Element not present");
        }else {
            System.out.println("Element present");
        }
        // creating immutable list of data.
        List<Integer> nums= Arrays.asList(10,20,30,40,50);
        System.out.println(nums);
        //nums.add(60);
        System.out.println(nums);
        
    }
}
