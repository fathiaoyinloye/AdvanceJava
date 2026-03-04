package chp17.reduce;

import java.util.Arrays;
import java.util.List;

public class ProductFinder {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Integer result = numbers.stream().reduce(1,(a,b) -> a * b);
        System.out.println(result);
    }
}
