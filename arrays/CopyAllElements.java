package arrays;

public class CopyAllElements {

    public static void main(String[] args){

        int[] arr1 =  {1,2,3};

        int[] arr2 = arr1.clone();

        for(int i=0; i< arr2.length; i++){

            System.out.println(arr2[i]);
        }

    }
}
