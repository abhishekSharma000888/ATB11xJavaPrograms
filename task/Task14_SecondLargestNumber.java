package task;

import java.util.Scanner;

public class Task14_SecondLargestNumber {

    public static void main(String[] args){

        int max = 0;

        int secondMax = -1;

        int[] arr = {1,2,3,4,2,4,2,4,5,6,3,8,9,56};


        // First identify the maximum
        for(int i=0; i<arr.length; i++){

            if(arr[i]> max){

                max = arr[i];
            }

        }

        // Then identify the secondMax

        for(int j=0; j< arr.length; j++){

            if (arr[j]< max && secondMax<arr[j]){

                secondMax = arr[j];
            }

        }
        System.out.println("The maximum element in the array is: " + max);

        System.out.println("The second maximum element in the array is: "+ secondMax);

    }
}
