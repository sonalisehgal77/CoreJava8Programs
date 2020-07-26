//BiFunction : It is a functional Interface
// It takes two arguments and returns an object

//@FunctionalInterface
//interface BiFunction<T,U,R>{
//    R apply(T t,U u);
//}

// T - Type of the first argument to the function
// U - Type of the second argument to the function
// R - Type of the result of the function

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunctionPrg {

    public static void main(String[] args) {

//        BiFunction<Integer,Integer,Integer> bf=(i1,i2)->i1+i2;
//
//        Integer total=bf.apply(5,10);
//        System.out.println(total);

        final List<String> friends= Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott") ;
        friends.forEach((final String name)->System.out.println(name));

//        friends.stream().map(name->name.toUpperCase())
//                .forEach(name->System.out.print(name+ " "));
//        System.out.println("Names Length");
//        friends.stream().map(name->name.length()).forEach(count->System.out.print(count+" "));
//        friends.stream().map(String::toUpperCase).forEach(name->System.out.println(name+" "));

        final List<String> startsWithN= (List<String>) friends.stream()
                .filter(name->name.startsWith("N"))
                .collect(Collectors.toList());
        startsWithN.forEach(s-> System.out.println(s));


    }
    }

