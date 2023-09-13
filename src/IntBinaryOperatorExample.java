import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println(intBinaryOperator.applyAsInt(4, 7));
    }
}
