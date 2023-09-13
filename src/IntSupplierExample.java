import java.util.function.IntSupplier;

public class IntSupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> 50;
        System.out.println(intSupplier.getAsInt());
    }
}
