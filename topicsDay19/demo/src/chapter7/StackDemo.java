package chapter7;

class Stack {
	int[] stack;
	int top;
	int capacity;

	// constructor
	Stack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
		this.top = -1;

	}

	// check if stack is full
	boolean isFull() {
		return top == capacity - 1;

	}

	// check if stack is empty
	boolean isEmpty() {
		return top == -1;

	}

	// get the current size of he stack
	int size() {
		return top + 1;

	}

	// push an element onto the stack
	void push(int element) {

		if (isFull()) {
			System.out.println("it is full" + element);
			return;
		}

		stack[++top] = element;

		System.out.println("pushed" + element);
	}
	
	// Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // Return a sentinel value
        }
        return stack[top--];
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1; // Return a sentinel value
        }
        return stack[top];
    }
}



public class StackDemo {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(20);
		
		// Check size, isEmpty, and isFull
        System.out.println("Current size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        stack.pop();

// Check size, isEmpty, and isFull
System.out.println("Current size: " + stack.size());
System.out.println("Is stack empty? " + stack.isEmpty());

	}

}
