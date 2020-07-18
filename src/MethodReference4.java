import java.util.Arrays;
import java.util.List;

class Demo2{
    public Demo2(String s){
        System.out.println("Hiii "+s);
    }
}
public class MethodReference4 {

    public static void main(String[] args) {

        List<String> friends= Arrays
                .asList("Brian","Nate","Neal","Raju","Sara","Scott") ;

        friends.forEach(Demo2::new);

    }
}
