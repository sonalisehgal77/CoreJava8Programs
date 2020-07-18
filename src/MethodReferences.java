// Method References: 4 kinds of method references
// a) Reference to a static method
// b) Reference to an instance method of a particular object
// c) Reference to an instance method of an arbitrary object of particular type
// d) Reference to constructor

// :: operator ->method references

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Apple","Orange","Banana");

     //   list.forEach(a->Demo.display(a));  //lambda expression

        list.forEach(Demo::display);
    }
}

class Demo{

    public static void display(String str){
        System.out.println(str);
    }
}