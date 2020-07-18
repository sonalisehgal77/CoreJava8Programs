import java.util.function.Function;

public class FunctionChain {

    public static void main(String[] args) {

        Function<String,Integer> f=a->a.length();
        Function<Integer,Integer> f1=a->a*5;

        Integer i=f.andThen(f1).apply("Abhijeet");

        System.out.println(i);


    }
}
