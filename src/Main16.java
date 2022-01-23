import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main16 {

    public static void main(String[] args) {
        int[] array = List.of(3, 2, 5, 2).stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(multiply(array));
        System.out.println(max(array));

    }

    private static int multiply(int[] array) {
        return Arrays.stream(array)
                .reduce((x, y) -> x * y)
                .orElse(0);
    }

    private static int max(int[] array) {
        return Arrays.stream(array)
                .reduce((x, y) -> x > y ? x : y)
                .orElse(0);
    }

}
