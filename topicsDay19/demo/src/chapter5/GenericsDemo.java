package chapter5;
import java.util.ArrayList;
import java.util.List;
public class GenericsDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("10");
		String s =(String)list.get(0);
		System.out.println(s);
	List<Integer> list1 = 
			new ArrayList<Integer>();
		list1.add(10);
	//	list1.add("10");// compile time error
list1.add(10);
	}
}
