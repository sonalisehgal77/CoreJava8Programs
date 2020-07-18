import java.util.ArrayList;
import java.util.List;

public class MethodReferences2 {

    public static void main(String[] args) {

        Student s1=new Student();
        s1.setId(1);
        s1.setName("Xyz");
        s1.setAge(28);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("Abc");
        s2.setAge(25);

        Student s3=new Student();
        s3.setId(3);
        s3.setName("Pqr");
        s3.setAge(30);

        List<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        CompareObj c=new CompareObj();

        list.sort(c::compareByAge);
        list.forEach(li-> System.out.println(li));
    }
}

class CompareObj{

    public int compareByAge(Student s1,Student s2){

        return s1.getAge().compareTo(s2.getAge());
    }
}

class Student{

    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

