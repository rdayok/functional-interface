import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = str -> str.length();
        System.out.println(toIntFunction.applyAsInt("Retnaa"));
    }
}
