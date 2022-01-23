import java.util.List;
import java.util.stream.Collectors;

public class Main9 {

    public static void main(String[] args) {
        List<String> words = List
                .of("CARLOS", "JOSÉ", "JOÃO","JOANA", "MARIA", "CELSO");

        words.stream()
                .filter(w ->w.startsWith("J"))
                .map(w -> w.toLowerCase())
                .forEach(w -> System.out.println(w));
    }
}
