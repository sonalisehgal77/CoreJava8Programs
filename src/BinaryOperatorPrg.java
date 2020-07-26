//BinaryOperator : It is a functional interface
// It takes two arguments of same type and returns result of the same type of its arguments

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorPrg {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> f=(i1,i2)->i1+i2;
        Integer result=f.apply(5,10);
        System.out.println(result);

        BinaryOperator<Integer> bi=(i1,i2)->i1+i2;
        Integer result1=bi.apply(10,20);
        System.out.println(result1);

    }
}
