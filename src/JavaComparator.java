import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("A");
        e1.setAge(30);

        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("B");
        e2.setAge(25);

        List<Employee> list=new ArrayList();
        list.add(e1);
        list.add(e2);

        System.out.println(list);

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//
//        for (Employee e:list) {
//            System.out.println(e);
//        }

        // Java 8 Lambda Expression

        list.sort((Employee o1,Employee o2)->o1.getAge()-o2.getAge());
        list.forEach((emp)-> System.out.println(emp));

    }
}
