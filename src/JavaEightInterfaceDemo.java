interface MyInterface{
    public abstract void check();

    default void check1(){
        System.out.println("In default interface");
    }
}

public class JavaEightInterfaceDemo implements MyInterface {

    public static void main(String[] args) {
        JavaEightInterfaceDemo j=new JavaEightInterfaceDemo();
        j.check();
        j.check1();
    }

    @Override
    public void check() {
        System.out.println("In check method");
    }
}
