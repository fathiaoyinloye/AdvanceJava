package chp17.functionalInterfaces;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {

    static void main() {
        BiConsumer<String, String> biConsumer = (String a, String b) ->{
            System.out.println(a + b);
        };
        biConsumer.accept("Hello", "World");

        Map<String, Integer> map = Map.of(
                "ONE", 1,
                "TWO",2,
                "THREE", 3
        );
        map.forEach( (key,  value) -> System.out.println(key + ": " + value) );
    }
}
