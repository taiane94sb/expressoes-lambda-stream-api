import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main17 {

    public static void main(String[] args) {
        String str = "ACBA";

        String result = str.chars()
            .map(i -> i - 64)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining("-", "=>>", "<<="));

        System.out.println(result);
    }

}
