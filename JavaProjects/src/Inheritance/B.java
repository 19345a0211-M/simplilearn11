package Inheritance;

public class B extends D{
	
	public void month() {
		System.out.println("It is the month of June");
	}

	public static void main(String[] args) {
		B b = new B();
		b.month();
		b.date();
		b.nextYear();

	}

}
