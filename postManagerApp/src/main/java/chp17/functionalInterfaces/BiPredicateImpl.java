package chp17.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main() {
        BiPredicate <String, Integer> biPredicate = (x, y) ->{
            return x.equals(y);
        };
        System.out.println(biPredicate.test("null", 1));
    }

}
