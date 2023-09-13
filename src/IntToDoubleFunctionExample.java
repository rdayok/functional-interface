import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {
    public static void main(String[] args) {
        IntToDoubleFunction intToDoubleFunction = num -> num * 1.5;
        System.out.println(intToDoubleFunction.applyAsDouble(10));
    }
}
