package linkedList;

import java.util.LinkedList;

public class MiddleElementExample {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        Integer middleElement;

        // Check if list is empty
        if (!li.isEmpty()) {
            int midIndex = li.size() / 2; // Correct index calculation
            middleElement = li.get(midIndex);
            System.out.println("The middle element is: " + middleElement);
        } else {
            System.out.println("The list is empty");
        }
    }
}
