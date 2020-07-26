//BiConsumer : It is a functional interface
// It takes two arguments and returns nothing

import java.util.function.BiConsumer;

public class BiConsumerPrg {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addNums=(a,b)-> System.out.println(a+b);
        addNums.accept(10,20);
    }
}
