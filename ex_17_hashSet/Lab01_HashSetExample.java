package ex_17_hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Lab01_HashSetExample {

    public static void main(String[] args){

        HashSet set = new HashSet();

        set.add("Abhishek");
        set.add(null);

        System.out.println(set);

        LinkedHashSet set2 = new LinkedHashSet();

        set2.add("Golden Mirado");
        set2.add(4);

        set2.add(null);

        System.out.println(set2.isEmpty());

        System.out.println(set2.contains(4));

        System.out.println(set2.size());
    }
}
