//Lambda Expressions:
// - It is a new feature introduced in java 8
// - It is an anonymous function. Doesn't have name and doesn't belong to any class

// Lambda Operator:  ->

// Syntax :
// E.g (a,b) -> a+b

// Lambda expression consists of:
//  - Parameter list
//  - Body

//@FunctionalInterface
//interface MyDemoInterface{
//    public String getData();
//}

//@FunctionalInterface
//interface MyDemoInterface1{
//    int checkValue(int a);
//}

@FunctionalInterface
interface MyDemoInterface2{
    int add(int a,int b);
}
public class LambdaProgram {

    public static void main(String[] args) {

//        MyDemoInterface m=() ->{
//            return "Hello Java 8";
//        };

//        MyDemoInterface1 m1=(no) -> no;
        MyDemoInterface2 m2=(a,b) -> a+b;
        System.out.println(m2.add(10,20));
    }
}
