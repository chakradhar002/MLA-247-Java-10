package chapter9;

import java.util.Timer;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
    

    
}

public class SynchronizedTimerMethodDemo {
    public static void main(String[] args) {
    	 Counter counter = new Counter();
    	 Timer timer = new Timer();
Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                
            }
            
            System.out.println("task executed at"+System.currentTimeMillis());
        };  


        Thread t1 = new Thread(task); 
        Thread t2 = new Thread(task);
    
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        	System.out.println();
        }

        System.out.println("Final Count: " + counter.getCount());
     
    }
}
