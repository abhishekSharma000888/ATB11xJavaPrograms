package arrays;

public class Lab01_ArrayMax {

    public static void main(String[] args){

        int[] arr = {1,3,4,5,2,7,8,9,45};

        int max = arr[0];


        for(int i=0; i<arr.length; i++){

            if(max < arr[i]){

                max = arr[i];
            }

        }

        System.out.println(max);
    }
}
