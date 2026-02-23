package ToDO;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main (String... args){
        Comparator<Integer> descendingOrder = (x, y) ->{
            if(y > x)  return  1;
            else if (y < x) return -1;
            else return 0;
        };

        Set<Integer> numbers = new TreeSet<>(descendingOrder);
        numbers.add(39);
        numbers.add (1);
        numbers.add(52);
        System.out.println(numbers);

        Comparator<String> ascendingOrderComparator = (String x, String y) -> {
            if(y.length() > x.length() ) return x.length() - y.length();
            else if (x.length() > y.length()) return y.length() - x.length();
            return 0;
        };

        Set<String> letters = new TreeSet<>();
        letters.add("Fatt");
        letters.add ("Fathia");
        letters.add("Fathai");
        System.out.println(letters);
    }
}
