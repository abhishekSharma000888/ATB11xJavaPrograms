package arrays;

public class IndexOfArrayElement {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int check = 4;
        boolean found = false;

        int ind = 0;

        for(int i=0; i< arr.length; i++){

            if(arr[i] == check){

                found = true;

                 ind = arr[i];

                break;

            }

        }
        System.out.println("Element found at index:" + ind);



    }
}
