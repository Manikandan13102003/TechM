import java.util.*;

class Main {
    public static void main(String[] args) {
        new LinkedListThread().start();
    }
}

class LinkedListThread extends Thread {
    public void run() {
        // Change ArrayList to LinkedList
        List<Integer> list1 = new LinkedList<>();

        // Adding elements to the linked list
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        
        // Printing the size of the list
        System.out.println("Number of elements in the list: " + list1.size());

        // Adding one more element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is: " + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        // Checking if an element exists in the list
        System.out.println("Is 566 available in the list: " + list1.contains(566));

        // Displaying the list before removal
        System.out.println("The given list before removing elements is: " + list1);

        // Removing elements by index
        list1.remove(2);  // Removes the element at index 2
        list1.remove(3);  // Removes the element at index 3
        
        // Printing the list after removal
        System.out.println("After removing elements:");
        System.out.println("The given list is: " + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
