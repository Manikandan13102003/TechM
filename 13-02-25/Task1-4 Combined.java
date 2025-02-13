import java.util.*;

class Main {
    public static void main(String[] args) {
        new CollectionThread().start();
    }
}

class CollectionThread extends Thread {
    public void run() {
        // Creating objects for ArrayList, LinkedList, Vector, and Stack
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vectorList = new Vector<>();
        Stack<Integer> stack = new Stack<>();
        
        // Adding elements to all collections
        addElements(arrayList);
        addElements(linkedList);
        addElements(vectorList);
        addElements(stack);

        // Printing size of all collections
        printSize("ArrayList", arrayList);
        printSize("LinkedList", linkedList);
        printSize("VectorList", vectorList);
        printSize("Stack", stack);

        // Adding one more element to all collections
        addElement(arrayList, 25);
        addElement(linkedList, 25);
        addElement(vectorList, 25);
        stack.push(25);
        
        // Printing the collections after adding one element
        printAfterAdding("ArrayList", arrayList);
        printAfterAdding("LinkedList", linkedList);
        printAfterAdding("VectorList", vectorList);
        printAfterAddingStack("Stack", stack);

        // Checking if 50 exists in the collections
        checkIfExists("ArrayList", arrayList, 50);
        checkIfExists("LinkedList", linkedList, 50);
        checkIfExists("VectorList", vectorList, 50);
        checkIfExistsStack("Stack", stack, 50);

        // Removing elements from all collections
        removeElement(arrayList, 1);  // Removes element at index 1
        removeElement(linkedList, 1);  // Removes element at index 1
        removeElement(vectorList, 1);  // Removes element at index 1
        stack.pop();  // Removes the top element
        
        // Printing the collections after removal
        printAfterRemoval("ArrayList", arrayList);
        printAfterRemoval("LinkedList", linkedList);
        printAfterRemoval("VectorList", vectorList);
        printAfterRemovalStack("Stack", stack);
    }

    // Method to add elements to collections
    private void addElements(List<Integer> list) {
        list.add(150);
        list.add(40);
        list.add(89);
        list.add(10);
        list.add(75);
        list.add(60);
        list.add(12);
        list.add(18);
    }

    private void addElement(List<Integer> list, Integer element) {
        list.add(element);
    }

    private void printSize(String name, List<Integer> list) {
        System.out.println(name + " size: " + list.size());
    }

    private void printSize(String name, Stack<Integer> stack) {
        System.out.println(name + " size: " + stack.size());
    }

    private void printAfterAdding(String name, List<Integer> list) {
        System.out.println(name + " after adding one element: " + list);
    }

    private void printAfterAddingStack(String name, Stack<Integer> stack) {
        System.out.println(name + " after adding one element: " + stack);
    }

    private void checkIfExists(String name, List<Integer> list, int element) {
        System.out.println("Does " + name + " contain " + element + ": " + list.contains(element));
    }

    private void checkIfExistsStack(String name, Stack<Integer> stack, int element) {
        System.out.println("Does " + name + " contain " + element + ": " + stack.contains(element));
    }

    private void removeElement(List<Integer> list, int index) {
        list.remove(index);
    }

    private void printAfterRemoval(String name, List<Integer> list) {
        System.out.println(name + " after removing element: " + list);
    }

    private void printAfterRemovalStack(String name, Stack<Integer> stack) {
        System.out.println(name + " after popping an element: " + stack);
    }
}
