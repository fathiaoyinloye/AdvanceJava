package chp17.Lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PredicatePractice {
    public static void main (String... args){
        IntPredicate isOdd = ( number) -> number % 2 != 0;
        IntPredicate isEven =(number) -> number % 2 == 0;
        IntPredicate isNumberGreaterThan10 =(number) -> number > 0;
        IntPredicate isNumberLessThan5 =(number) -> number < 5;

        IntStream.range(1,20)
                .filter(isNumberGreaterThan10)
                .forEach(x -> System.out.println(x));



    }
}
