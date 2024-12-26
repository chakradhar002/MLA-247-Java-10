package chapter4;

interface Color {
	void applyColor();
}

abstract class Shape1 {
	Color color; // variable

	abstract void draw();

	public Shape1(Color color) {
		this.color = color;
	}
}

//redefine abstract class
class Circle1 extends Shape1 {

	public Circle1(Color color) {
		super(color);

	}

	@Override
	void draw() {
		System.out.println("circle with");
		color.applyColor();
	}

}

class RedColor implements Color {
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("red in color");
	}
}

class BlueColor implements Color {
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("BlueColor ");
	}
}

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape1 redcolor = new Circle1(new RedColor());
		redcolor.draw();
	}

}
