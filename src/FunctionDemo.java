import java.util.function.Function;

//Function<T,R>
// T -> Type of input to a function
// R -> Type of result of the function

// Functional Interface
// BiFunction
// BinaryOperator
// UnaryOperator
// Predicate
// BiPredicate
// Consumer
// BiConsumer

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String,Integer> f=a->a.length();
        Integer i=f.apply("Sonali");
        System.out.println(i);
    }
}
