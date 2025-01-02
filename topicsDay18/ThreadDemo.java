package chapter9;
/*This example shows two ways to create and run threads:

Extending the Thread class.
Implementing the Runnable interface. */

class MyThread extends Thread {

	String name;

	public MyThread(String name) {

		this.name = name;
	}

	void Run() {

		for (int i = 0; i <= 5; i = i + 1) {
			System.out.println(" thread is  running" + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread t1 = new MyThread("thread1");	
		
		t1.start();
		
		for (int i = 0; i <= 5; i = i + 1) {
			System.out.println(" Main thread is  running" + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
