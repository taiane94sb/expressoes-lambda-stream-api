import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        Operator op1 = (x, y) -> x * y;
        Operator op2 = (x, y) -> x + y;

        System.out.println(op1.execute(5, 2));
        System.out.println(op2.execute(5, 2));
    }
}
