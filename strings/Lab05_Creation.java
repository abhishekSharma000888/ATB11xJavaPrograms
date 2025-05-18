package strings;

public class Lab05_Creation {

    public static void main(String[] args){

        String s0 = "new"; // stored in string constant pool

        String s1 = new String("new");


        StringBuilder sb1 = new StringBuilder("new"); // stored in object area
        StringBuilder sb2 = new StringBuilder("new");

        System.out.println(sb1 == sb2);

        System.out.println(s0 == s1);

        StringBuffer sa1 = new StringBuffer("new");
        StringBuffer sa2 = new StringBuffer("new");
        System.out.println(sa1 == sa2);

    }
}
