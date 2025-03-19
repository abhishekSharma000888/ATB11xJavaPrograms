package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseExample {

    public static void main(String[] args){

        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);


        System.out.println("Before reversing the elements of the linkedList:");

        for(Integer i : li){

            System.out.println(i);
        }

        Collections.reverse(li);

        System.out.println("After reversing the elements of the linkedList");

        for(Integer i : li){

            System.out.println(i);
        }

        //length of the LinkedList

        System.out.println("The length of the linkedlist li is:" + li.size());


    }
}
