import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<Float> treeSet = new TreeSet<>();

        // Adding elements to HashSet (Initial 8 elements)
        hashSet.add(14);    // Divisible by 7
        hashSet.add(21);    // Divisible by 7
        hashSet.add(35);    // Divisible by 7
        hashSet.add(50);    // Not divisible by 7
        hashSet.add(42);    // Divisible by 7
        hashSet.add(63);    // Divisible by 7
        hashSet.add(77);    // Divisible by 7
        hashSet.add(88);    // Not divisible by 7

        // Adding elements to LinkedHashSet (Initial 8 elements)
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("ABCD");
        linkedHashSet.add("SP");
        linkedHashSet.add("AIA");
        linkedHashSet.add("MDA");
        linkedHashSet.add("B");
        linkedHashSet.add("ZZZZZ");

        // Adding elements to TreeSet (Initial 8 elements)
        treeSet.add(15.5f);
        treeSet.add(10.3f);
        treeSet.add(25.7f);
        treeSet.add(42.9f);
        treeSet.add(37.4f);
        treeSet.add(33.2f);
        treeSet.add(5.8f);
        treeSet.add(99.1f);

        // Print sizes and collections before any removal
        printSize("HashSet", hashSet);
        printSize("LinkedHashSet", linkedHashSet);
        printSize("TreeSet", treeSet);

        // Remove one element from each collection
        hashSet.remove(50);  // Removing an element from HashSet
        linkedHashSet.remove("MDA");  // Removing an element from LinkedHashSet
        treeSet.remove(42.9f);  // Removing an element from TreeSet

        // Print collections after removal
        System.out.println("\nHashSet after removal: " + hashSet);
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
        System.out.println("TreeSet after removal: " + treeSet);

        // After removal, HashSet: print elements divisible by 7
        printDivisibleBy7(hashSet);

        // After removal, LinkedHashSet: print elements with length greater than 5
        printSizeGreaterThan5(linkedHashSet);

        // After removal, TreeSet: print elements greater than 20
        printGreaterThan20(treeSet);

        // Ensuring that there are at least 4 elements after removal
        ensureMinElements(hashSet, 4);
        ensureMinElements(linkedHashSet, 4);
        ensureMinElements(treeSet, 4);
    }

    // Utility methods
    private static void printSize(String name, Set<?> set) {
        System.out.println(name + " size: " + set.size());
        System.out.println(name + " elements: " + set);
    }

    private static void printDivisibleBy7(Set<Integer> set) {
        System.out.print("HashSet elements divisible by 7: ");
        for (Integer element : set) {
            if (element % 7 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void printSizeGreaterThan5(Set<String> set) {
        System.out.print("LinkedHashSet elements with length > 5: ");
        for (String element : set) {
            if (element.length() > 5) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void printGreaterThan20(Set<Float> set) {
        System.out.print("TreeSet elements greater than 20: ");
        for (Float element : set) {
            if (element > 20) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    // Ensure that every collection has a minimum of 4 elements after removal
    private static void ensureMinElements(Set<?> set, int minElements) {
        if (set.size() < minElements) {
            System.out.println("Warning: " + set.getClass().getSimpleName() + " has fewer than " + minElements + " elements!");
        } else {
            System.out.println(set.getClass().getSimpleName() + " has at least " + minElements + " elements.");
        }
    }
}
