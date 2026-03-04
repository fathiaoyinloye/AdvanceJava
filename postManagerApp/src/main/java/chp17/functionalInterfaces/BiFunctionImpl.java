package chp17.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    static void main() {
        BiFunction<String, String, Integer> biFunction = (a, b) ->
                a.length() + b.length();
        System.out.println(biFunction.apply("Fathia", "Martin"));
    }
}
