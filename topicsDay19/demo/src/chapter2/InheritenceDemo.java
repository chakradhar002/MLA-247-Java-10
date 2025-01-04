package chapter2;

class Student {
	void StudetStudyDetails() {
		System.out.println("StudentDetails");
	
	}
}

class Satyam extends Student{

	void StudetStudyDetails() {
		System.out.println("Reading Java ");

	}
}

class MahaLakshmi extends Student{

	void StudetStudyDetails() {
		System.out.println("Reading React ");

	}
}

public class InheritenceDemo {
	
	public static void  main(String args[]) {
		
		Student study = new Student();
		study.StudetStudyDetails();
		Student studyjava = new Satyam();
		studyjava.StudetStudyDetails();
		Satyam readjava = new  Satyam();
		readjava.StudetStudyDetails();
		MahaLakshmi readreact = new MahaLakshmi();
		readreact.StudetStudyDetails();
		
	}

}
