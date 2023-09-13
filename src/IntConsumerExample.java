import java.util.function.IntConsumer;

public class IntConsumerExample {
    public static void main(String[] args) {
        IntConsumer intConsumer = (num) -> System.out.println("Consumed: " + num);
        intConsumer.accept(500);
    }
}
