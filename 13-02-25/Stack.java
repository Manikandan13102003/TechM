import java.util.*;

class Main {
    public static void main(String[] args) {
        new StackThread().start();
    }
}

class StackThread extends Thread {
    public void run() {
        // Create a Stack and use different values
        Stack<Integer> stack1 = new Stack<>();

        // Pushing elements onto the stack
        stack1.push(100);
        stack1.push(25);
        stack1.push(77);
        stack1.push(45);
        stack1.push(60);
        stack1.push(90);
        stack1.push(35);
        stack1.push(42);

        // Printing the size of the stack
        System.out.println("Number of elements in the stack: " + stack1.size());

        // Pushing one more element
        stack1.push(18);
        System.out.println("After adding one element:");
        System.out.println("The given stack is: " + stack1);
        System.out.println("The number of elements in the stack: " + stack1.size());

        // Checking if an element exists in the stack
        System.out.println("Is 56 available in the stack: " + stack1.contains(56));

        // Displaying the stack before removing elements
        System.out.println("The given stack before popping elements is: " + stack1);

        // Popping elements from the stack
        stack1.pop();  // Removes the top element (18)
        stack1.pop();  // Removes the next top element (42)
        
        // Printing the stack after popping elements
        System.out.println("After removing elements:");
        System.out.println("The given stack is: " + stack1);
        System.out.println("The number of elements in the stack: " + stack1.size());
    }
}
