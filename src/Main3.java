import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));

        Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
        numbers.sort(comparator);

        System.out.println(numbers);
    }
}
