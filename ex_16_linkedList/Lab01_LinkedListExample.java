package ex_16_linkedList;

import java.util.LinkedList;

public class Lab01_LinkedListExample {

    public static void main(String[] args){
        LinkedList l1 = new LinkedList();

        l1.add("Boron");
        l1.add(1);
        l1.add(true);
        l1.add(2.34567);

        System.out.println(l1);

        System.out.println(l1.indexOf(true));

        l1.add(3, "addedElement");

        System.out.println(l1);


    }
}
