package chapter7;
/*
 * Explanation of New Methods
pop:

Checks if the stack is empty.
If not, it removes the top node, updates the top reference, and returns the popped data.
peek:

Checks if the stack is empty.
If not, it returns the data of the top node without removing it.
isEmpty:

Returns true if the top is null, indicating the stack is empty.
 * 
 * */
class MyNode {
	int data;
	MyNode next;
	// constructor to initialize a node

	public MyNode(int data) {

		this.data = data;
		this.next = null;
	}

}

class LinkedStack {
	MyNode top;

	LinkedStack() {

		this.top = null;

	}

	void push(int data) {
		MyNode newnnode = new MyNode(data);
		newnnode.next = top; // link the new node th current top
		top = newnnode;
		System.out.println("pushed" + data + " onto the stack");
	}

	// check if stack is empty
	boolean isEmpty() {
		return top == null;

	}

	int pop() {
		if (isEmpty()) {
			System.out.println("canoot pop from empty stack");
			return -1;

		}

		int poppedData = top.data;
		top = top.next;// move top to the next node
		System.out.println("popped " + poppedData);
		return poppedData;

	}

	int peek() {

		if (isEmpty()) {

			System.out.println(" stack is empty");
			return -1;
		}
		return top.data;

	}

	void dispay() {
	}

}

public class SackUsingLinkListDemo {

	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
	stack.push(3);
	stack.push(10);
	stack.push(28);
	
	}

}
