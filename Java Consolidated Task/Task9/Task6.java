import java.util.List;
import java.util.stream.Collectors;

public class SortStringsInOrderUsingStreams {
    public static void main(String[] args) {
        List<String> words = List.of("banana", "apple", "cherry", "date", "elderberry");

        List<String> ascendingOrder = words.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descendingOrder = words.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Sorted in Ascending Order: " + ascendingOrder);
        System.out.println("Sorted in Descending Order: " + descendingOrder);
    }
}