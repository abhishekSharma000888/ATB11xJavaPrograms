package arrays;

public class CheckForAnElement {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int check = 4;
        boolean found = false;

        for (int num : arr) {
            if (num == check) {
                System.out.println("The result is found: " + check);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The result is not found.");
        }
    }

}
