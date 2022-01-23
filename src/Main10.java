import java.util.List;

public class Main10 {

    public static void main(String[] args) {
        List<String> words = List
                .of("CARLOS", "JOSÉ", "JOÃO","JOANA", "MARIA", "CELSO");

        words.stream()
                .filter(w ->w.startsWith("J"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
