package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOfAnArray {
    public static void main(String[] args) {

        /** converting the array to list
         * then reverse the list
         * convert the list to array
         */

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 0};

        List<Integer> list = Arrays.asList(arr1);

        Collections.reverse(list);

        list.toArray(arr1);

        for(int num: arr1){
            System.out.println(num + "");
        }
    }
}
