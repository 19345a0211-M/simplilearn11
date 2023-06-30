package Inheritance;

public class A extends D {

	public void day() {
		System.out.println("Today is Tuesday");
	}
	
	public static void main(String[] args) {
		//Always create object of the child class
		A a = new A();
		a.day();
		a.date();
		a.nextYear();

	}

}
