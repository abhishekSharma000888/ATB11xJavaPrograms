package ex_15_arrayList;

import java.util.ArrayList;

public class Lab01_ArrayListExample {

    public static void main(String[] args){

        ArrayList l1 = new ArrayList();

        l1.add(1);
        l1.add("Picaso");
        l1.add(true);
        l1.add(null);


        System.out.println(l1.isEmpty());

        System.out.println(l1.indexOf("Picaso"));

        System.out.println(l1.listIterator());

        System.out.println(l1.contains(true));

        System.out.println(l1);

        l1.clear();
    }
}
