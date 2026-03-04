package chp17.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerImpl {
    static void main() {
        Consumer<String> consumer = (x) -> {
            System.out.println(x);
        };
        consumer.accept("Go Placidly...");
    }
}
