package chapter9;


import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Queue is full, producer is waiting...");
            wait(); // Wait until space is available
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // Notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue is empty, consumer is waiting...");
            wait(); // Wait until items are available
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll(); // Notify producer
        return value;
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    sharedQueue.produce(i);
                    Thread.sleep(500); // Simulate time for producing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    sharedQueue.consume();
                    Thread.sleep(1000); // Simulate time for consuming
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
