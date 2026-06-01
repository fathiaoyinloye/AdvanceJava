package chp17.intermediateStramOp.flatmap;

import java.util.*;
import java.util.stream.Collectors;

public class Mapper {
    public static Set<Location> map(List<List<Integer>> numbers){
        Comparator<Location> locationComparator = Comparator.comparing(Location::getLatitude);
     return numbers.stream()
             .flatMap((list)-> list.stream())
             .map((number)
                     -> new Location(number, new Random().nextInt()))
             .collect(Collectors.toCollection(()-> new TreeSet<>(locationComparator)));
    }
//    public static TreeSet<Integer> sortNumbers (List<List<Integer>> numbers){
//        return numbers.stream()
//                .flatMap((list)-> list.stream())
//                .map((number)
//                        -> new Location(number, new Random().nextInt()))
//                .collect(Collectors.toCollection(TreeSet:: new));
//    }
}
