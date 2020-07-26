//BiPredicate: It is a functional interface
// It accepts two arguments and returns boolean

import java.util.function.BiPredicate;

public class BiPredicatePrg {

    public static void main(String[] args) {

        BiPredicate<String,Integer> filter=(a,b)->{
            return a.length()==b;
        };

        boolean check=filter.test("Abhijeet",8);
        System.out.println(check);

    }
}
