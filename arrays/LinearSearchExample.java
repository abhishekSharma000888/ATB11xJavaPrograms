package arrays;

public class LinearSearchExample {

    public static int search(int[] arr, int N, int check ){

        for(int i=0; i<N ; i++){

            if(arr[i] == check){

                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,6};

        int check = 4;

        int N = arr.length;

        int result = search(arr, arr.length, check);

        if(check == -1){

            System.out.println("The element is not found");
        }
        else{
            System.out.println("The element is found at index:" + result);
        }

    }
}
