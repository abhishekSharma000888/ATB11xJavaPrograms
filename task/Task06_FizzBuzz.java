package task;

public class Task06_FizzBuzz {

    public static void main(String[] args){

        int num = 100;

        for(int i=1; i<=num; i++){

            if(i%3 == 0){

                System.out.println("FizzBuzz");
            } else{

                System.out.println(i);
            }
        }
    }
}
