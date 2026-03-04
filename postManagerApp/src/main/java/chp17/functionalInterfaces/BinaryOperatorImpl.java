package chp17.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    static void main() {
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };
    }
}
