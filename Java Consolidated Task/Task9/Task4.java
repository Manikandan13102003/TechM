
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
