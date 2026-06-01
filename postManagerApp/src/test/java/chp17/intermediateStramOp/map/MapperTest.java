package chp17.intermediateStramOp.map;

import chp17.intermediateStramOp.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {
    @Test
    void testCanMapNumbersToAccounts(){
        List<Integer> numbers = List.of(10,20,30,40,50);
        List<Account> accounts = Mapper.map(numbers);
        assertNotNull(accounts);
        assertEquals(numbers.size(), accounts.size());
        for(int index = 0; index < numbers.size(); index++){
            assertEquals(numbers.get(index), accounts.get(index).getBalance().intValue());
        }
    }


}