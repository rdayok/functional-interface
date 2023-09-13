import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.getAsDouble());
    }
}
