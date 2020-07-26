import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrg {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","US","China","France","Australia");
        List<String> filterList=list.stream()
                .filter(country->!"China".equals(country))
                .collect(Collectors.toList());

        filterList.forEach(System.out::println);

    }
}
