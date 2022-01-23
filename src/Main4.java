import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));

        numbers.sort((o1, o2) -> -o1.compareTo(o2));

        System.out.println(numbers);
    }
}
