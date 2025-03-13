package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAscending {

    public static void main(String[] args){

       int[] arr = {1,3,2,4,6,5,7,9,0};

       System.out.println("After sorting array into ascending order:");

        Arrays.sort(arr);

        for(int num: arr){

            System.out.println(num);
        }


    }
}
