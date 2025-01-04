package chapter3;

public class StringBufferDemo {

	public static void main(String[] args) {
StringBuffer s = new StringBuffer();
 s.append("hello");
 s.append("how");
 s.append("r u");
 
 String result = s.toString();
 System.out.println(result);

	}

}
