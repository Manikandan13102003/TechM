import java.util.List;
import java.util.OptionalDouble;

public class CalculateAverageUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "No elements"));
    }
}