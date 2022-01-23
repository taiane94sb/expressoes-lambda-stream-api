import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        };

        numbers.sort(comparator);

        System.out.println(numbers);
    }
}
