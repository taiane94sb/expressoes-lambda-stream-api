import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main15 {

    public static void main(String[] args) {

        int mult = 3;
        AtomicInteger count = new AtomicInteger();

        IntStream.range(1, 21)
                .map(i -> {
                    count.incrementAndGet();
                    return i * mult;
                })
                .forEach(System.out::println);

        System.out.println(count);
    }

}
