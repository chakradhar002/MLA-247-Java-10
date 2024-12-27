package chapter7;

interface TrainingRoom{
	
	void study();
	
}
abstract class TrainingRooms{
	
	abstract void CoreJava();
	void AdvJava() {
		
		System.out.println("Coming soon");
	}
	
}

class java8 implements TrainingRoom{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("java 8");
	}
	
	
}

class Python extends TrainingRooms{

	@Override
	void CoreJava() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class MyJavaTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java8 t = new java8();
	
		t.study();
		
		TrainingRoom r = new java8();
		r.study();
		
	}

}
