package chp17.intermediateStramOp.flatmap;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {
    @Test
    void testCanMapNumbersToAccounts(){
        List<List<Integer>> numbers =
                List.of(
                        List.of(10,20,30,40,50),
                        List.of(15,20,35,30,35,40),
                        List.of(100,200,300,400,500),
                        List.of(150,250,350,450,35)
                );
        Set<Location> locations = Mapper.map(numbers);
//        assertEquals(numbers.size(), locations.size());
        numbers.stream()
                .flatMap(x -> x.stream())
                .forEach((x) -> assertEquals(Double.valueOf(x), locations.iterator().next().getLatitude()));
    }


}