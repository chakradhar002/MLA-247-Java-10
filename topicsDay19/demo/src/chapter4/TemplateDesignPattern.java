package chapter4;


/*_
 * The Template Method Design
 *  Pattern is a behavioral 
 *  design pattern that defines 
 *  the skeleton of an algorithm
 *   in a superclass while 
 *   allowing subclasses to
 *    override specific steps of
 *     the algorithm without 
 *     changing its structure.

This pattern is often used 
to enforce a consistent behavior
 while still allowing flexibility 
 for  customization.
 */
 abstract class Beverages{
	public final void prepareRecipe() {
		boilWater();
		brew();
		
	}	
	//added the default function
	void boilWater() {
			System.out.println("water is boiling");
	}
	
	void brew() {
		
		System.out.println("tea is cold now");
	}
		
	}
 
 //create a concreate subclasses
 
 class Tea extends Beverages{
	 
	 void brew() {
			System.out.println("steeping the tea hot");
	} 
 }
	
	





public class TemplateDesignPattern {

	public static void main(String[] args) {
	//preparing tea
		Beverages tea = new Tea();
		tea.prepareRecipe();
		

	}

}
