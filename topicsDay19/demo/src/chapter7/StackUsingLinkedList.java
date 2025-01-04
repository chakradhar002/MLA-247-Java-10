package chapter7;

import java.util.LinkedList;

class Node {
    int data;          // Data of the node
    Node next;         // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    private Node top;  // Top of the stack

    // Constructor to initialize the stack
    public MyStack() {
        this.top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Link the new node to the current top
        top = newNode;      // Update top to the new node
        System.out.println("Pushed: " + data);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // Sentinel value for empty stack
        }
        int poppedValue = top.data;
        top = top.next; // Update top to the next node
        return poppedValue;
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1; // Sentinel value for empty stack
        }
        return top.data;
    }

    // Get the current size of the stack
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check size and peek at the top element
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Final state of the stack
        System.out.println("Stack size after popping: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
