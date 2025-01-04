package chapter7;

import java.util.function.Consumer;

/*Definition: Represents an operation that accepts a single input argument and returns no result.
Method: void accept(T t)
Use Case: Used for operations like printing or modifying.*/




public class ConsumerDemo {
public static void main(String ar[]) {
	
	Consumer<String> myresponse = message->System.out.println(message);

	myresponse.accept("hi");
}
}
