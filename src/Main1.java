import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));

        NumberComparator comparator = new NumberComparator();
        numbers.sort(comparator);

        System.out.println(numbers);
    }
}
