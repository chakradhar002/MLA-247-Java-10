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
	
	// add on elment to the queue
	
	void enqueue(int element) {
		
		if(isFull()) {
			
			System.out.println("queue is full"+element);
			return;
		}
		rear = (rear+1)% capacity;
		queue[rear] =element;
		size++;
		System.out.println("enqueue"+element);
	}
	
	
int Dqueue() {
		
		if(isEmpty()) {
			
			System.out.println("queue is empty cannot dequeue");
			return -1;
		}
		int element = queue[front];
		front = (front+1)% capacity;
		size--;
		System.out.println("Dqueue"+element);
		return element;
	}
	
	
	
	
	
	
}

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue queue = new ArrayQueue(4);
	
		queue.isFull();
	    queue.isEmpty();
	    queue.enqueue(34);
	    
	    
	}

}
