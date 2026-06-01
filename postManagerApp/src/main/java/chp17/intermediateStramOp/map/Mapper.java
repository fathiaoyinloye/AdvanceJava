package chp17.intermediateStramOp.map;

import chp17.intermediateStramOp.Account;

import java.math.BigDecimal;
import java.util.List;

public class Mapper {

    public static List<Account> map(List<Integer> numbers) {
        return numbers.stream()
                .map( number -> new Account("John", new BigDecimal(number))).toList();
    }
}
