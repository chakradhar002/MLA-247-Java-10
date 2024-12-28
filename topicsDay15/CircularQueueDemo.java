package chapter7;

class CircularQueue {
    private int[] queue;   // Array to store queue elements
    private int front;     // Points to the front of the queue
    private int rear;      // Points to the rear of the queue
    private int size;      // Current size of the queue
    private int capacity;  // Maximum capacity of the queue

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue: " + element);
            return;
        }
        // Circular increment for rear pointer
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    // Print the queue elements
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5); // Circular queue with capacity 5

        // Enqueue elements
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        // Try to enqueue when full
        cq.enqueue(60);

        // Print the queue
        cq.printQueue();

        // Check if the queue is full or empty
        System.out.println("Is the queue full? " + cq.isFull());
        System.out.println("Is the queue empty? " + cq.isEmpty());
    }
}
