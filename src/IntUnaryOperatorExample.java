import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = num -> num * 2;
        System.out.println(intUnaryOperator.applyAsInt(6));
    }
}
