import java.util.function.Function;
import java.util.function.UnaryOperator;

//UnaryOperator : It is a functional Interface
// It takes on argument and returns result of the same type
public class UnaryOperatorPrg {
    public static void main(String[] args) {
        Function<Integer,Integer> f=a->a*5;
        Integer i=f.apply(5);
        System.out.println(i);

        UnaryOperator<Integer> f1=a->a*5;
        Integer i1=f1.apply(6);
        System.out.println(i1);
    }

}
