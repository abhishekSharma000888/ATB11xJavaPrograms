package arrays;

import java.util.Arrays;

public class MaxAndLowest {

    public static void main(String[] args) {

        int[] arr = {1, 0, 9, 4, 6, 3, 67};

        System.out.println("The max element is: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("The minimum element is: " + Arrays.stream(arr).min().getAsInt());
    }
}
