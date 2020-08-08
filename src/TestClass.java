/**
 * 
 */
package app.rsys.com;
import java.util.function.BiConsumer;

/**
 * @author sonal
 *
 */
public class TestClass {

	/**
	 * 
	 */
	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BiConsumer<Integer,Integer> addNums=(a,b)-> System.out.println(a+b);
	        addNums.accept(10,20);
	}

}
