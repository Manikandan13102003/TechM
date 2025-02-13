import java.util.*;

class Main {
    public static void main(String[] args) {
        new VectorThread().start();
    }
}

class VectorThread extends Thread {
    public void run() {
        // Create a Vector and use different values
        List<Integer> list1 = new Vector<>();

        // Adding elements to the vector with new values
        list1.add(150);
        list1.add(40);
        list1.add(89);
        list1.add(10);
        list1.add(75);
        list1.add(60);
        list1.add(12);
        list1.add(18);
        
        // Printing the size of the list
        System.out.println("Number of elements in the list: " + list1.size());

        // Adding one more element
        list1.add(25);
        System.out.println("After adding one element:");
        System.out.println("The given list is: " + list1);
        System.out.println("The number of elements in the list: " + list1.size());

        // Checking if an element exists in the list
        System.out.println("Is 50 available in the list: " + list1.contains(50));

        // Displaying the list before removal
        System.out.println("The given list before removing elements is: " + list1);

        // Removing elements by index
        list1.remove(1);  // Removes the element at index 1 (40)
        list1.remove(4);  // Removes the element at index 4 (75)
        
        // Printing the list after removal
        System.out.println("After removing elements:");
        System.out.println("The given list is: " + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
