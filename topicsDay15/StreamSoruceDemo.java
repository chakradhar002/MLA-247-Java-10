package chapter7;

import java.util.stream.Stream;

public class StreamSoruceDemo {

	public static void main(String[] args) {
	Stream<Integer>	 result = Stream.of(1,2,3,4,5,6,7,8);
result.forEach(System.out::println);
	}

}
