//Consumer: It is functional interface
//It takes an argument and returns nothing

import java.util.function.Consumer;

public class ConsumerPrg {

    void accept(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Consumer<String> c=a-> System.out.println(a);
        c.accept("Abhijeet");
    }
}
