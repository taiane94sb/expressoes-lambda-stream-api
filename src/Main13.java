import java.util.Map;
import java.util.Optional;

public class Main13 {

    private static final Map<String, Integer> PEOPLE =
            Map.of("pedro", 15,
                    "maria", 20,
                    "paulo", 25,
                    "jorge", 10);

    public static void main(String[] args) {
        Optional<Integer> opt = get("marcelo");

//        int idade = opt.orElseThrow(() -> new IllegalArgumentException("nome inexistente"));
        int idade = opt.orElseThrow(IllegalArgumentException::new);

        System.out.println(idade);
    }

    private static Optional<Integer> get(String name) {
        return Optional.ofNullable(PEOPLE.get(name));
    }
}
