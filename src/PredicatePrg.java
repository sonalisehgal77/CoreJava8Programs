//Predicate: It is functional Interface

//It accepts an argument and returns a boolean
//It is used to apply in a filter

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePrg {
    public static void main(String[] args) {

        Predicate<Integer> p=a->a>4;
        List<Integer> list= Arrays.asList(3,2,4,1,5,6,9,8);
        List<Integer> list2=list.stream().filter(p)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
