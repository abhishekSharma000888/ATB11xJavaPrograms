package ex_06_switch;

public class Lab02_Switch {

    public static void main(String[] args){

        int a = 11;

        switch(-1){

            case 1:

                System.out.println("hello");
                break;

            case 2:
                System.out.println("Hello 2");
                break;

            case -1:
                System.out.println("Hello -1");
                break;

            default:
                System.out.println("default");
        }
    }
}
