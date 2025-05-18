package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MiddleUsingTwoPointers {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        System.out.println("The middle element is: " + findMiddle(li));
    }

    public static Integer findMiddle(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        Iterator<Integer> slow = list.iterator();
        Iterator<Integer> fast = list.iterator();

        // Move fast pointer twice while slow pointer moves once
        while (fast.hasNext()) {
            fast.next();
            if (fast.hasNext()) {
                fast.next();
                slow.next();
            }
        }

        return slow.next();
    }
}
