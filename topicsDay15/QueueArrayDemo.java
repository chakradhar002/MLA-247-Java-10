package chapter7;

import java.util.Queue;

//Queue Using Arrays -

//Is Full, 
//Is Empty,
//and Size

class ArrayQueue {
	int[] queue;
	int front;
	int rear;
	int size;
	int capacity;

	// Constructor

	ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// check if the quue is fill

	boolean isFull() {
		return size == 0;
	}
	// check if the queue is empty;

	boolean isEmpty() {
		return size == capacity;

	}
}

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue queue = new ArrayQueue(4);
	
		queue.isFull();
		
		queue.isEmpty();
	}

}
