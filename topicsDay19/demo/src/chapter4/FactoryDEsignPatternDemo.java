package chapter4;

//define the shape interface

 interface Shape {
	void draw();
}
 
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println(" i am circle");

	}

}
 

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println(" i am Rectangle");

	}

}



class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(" i am Square");

	}

}

class ShapeRequestedFactory{
	// this method is created with the help of interface called shape
	public Shape getShape(String shapeType) {

		if (shapeType == null) {

			return null;

		}
		
if(shapeType.equalsIgnoreCase("circle")) {
	// this is creating an object of Circle class
	return new Circle();
}else if(shapeType.equalsIgnoreCase("rectangle")) {
	// this is creating an object of Rectangle class
	return new Rectangle();
}
return null;

	}
	
}
//client class
public class FactoryDEsignPatternDemo {

	public static void main(String[] args) {
	//create shape ShapeRequestedFactory instance
		ShapeRequestedFactory shapeRequestedFactory =  new ShapeRequestedFactory();
		
   // i want circle object as  request
		
		Shape shape1  = shapeRequestedFactory.getShape("circle");
	    shape1.draw();
		
	
	
	}

}
