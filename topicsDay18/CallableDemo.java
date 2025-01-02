package chapter9;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class JavaCallable implements Callable {

	@Override
	public Object call() throws Exception {
// creating a object of the Randowm class
		Random r = new Random();

		Integer i = r.nextInt(10);
//the thread is delayed for some random ti,m
		Thread.sleep(i * 1000);
		return i;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// future task is the concrete class
		// creating an array of 5 ojets of future class
		FutureTask[] rtask = new FutureTask[10];

		for (int j = 0; j < 10; j++) {

			Callable c = new JavaCallable();

			rtask[j] = new FutureTask(c);
			Thread th = new Thread(rtask[j]);
			th.start();
			}//end  of loop
		
		for (int i = 0; i < 10; i++)  
	    {  
	  
	      // invoking the get() method  
	      Object o = rtask[i].get();  
	        
	      // The get method holds the control until the result is received  
	      // The get method may throw the checked exceptions  
	      // like when the method is interrupted. Because of this reason  
	      // we have to add the throws clause to the main method  
	        
	       // printing the generated random number  
	      System.out.println("The random number is: " + o);  
	  
	    }  


	}

}
