package task;

public class Task15_OddAndEvenNumbers {

    public static void main(String[] args){

        int[] arr = {1,2,3,5,6,3,2,6,7,9,0,53,54,67,68};

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2 == 0){

                System.out.println("The even element is:" + arr[i]);
            } else{

                System.out.println("The odd element is:" + arr[i]);
            }
        }
    }
}
