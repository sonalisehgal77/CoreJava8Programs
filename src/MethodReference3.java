import java.util.ArrayList;
import java.util.List;

class Demo1{

    String s=null;

    public Demo1(String s){
        this.s=s; //this refers to the current object
    }

    void display(){
        System.out.println(s);
    }

}

public class MethodReference3 {

    public static void main(String[] args) {
        Demo1 d1=new Demo1("A");
        Demo1 d2=new Demo1("B");
        Demo1 d3=new Demo1("C");

        List<Demo1> list=new ArrayList();
        list.add(d1);
        list.add(d2);
        list.add(d3);

        list.forEach(Demo1::display);

    }
}
