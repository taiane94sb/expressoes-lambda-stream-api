import java.util.Map;
import java.util.Optional;

public class Main14 {

    private static final Map<String, Integer> PEOPLE =
            Map.of("pedro", 15,
                    "maria", 20,
                    "paulo", 25,
                    "jorge", 10);

    public static void main(String[] args) {
//        Optional<Integer> opt = get("pedro");
        Optional<Integer> opt = get("marcelo");

        opt.ifPresentOrElse(
                i -> System.out.println(" A idade " + i + " foi encontrada"),
                () -> System.out.println("Não encontrado"));
    }

    private static Optional<Integer> get(String name) {
        return Optional.ofNullable(PEOPLE.get(name));
    }
}
