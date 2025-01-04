package chapter7;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> myqueue = new PriorityQueue<>();
		myqueue.add(1);
		myqueue.add(3);
		myqueue.add(4);
		myqueue.add(3);
		
		while(!myqueue.isEmpty()) {
			
			System.out.println(myqueue.poll());
			
		}
		
		
		
	}

}
