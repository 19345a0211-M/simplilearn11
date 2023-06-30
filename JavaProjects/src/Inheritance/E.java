package Inheritance;

import Demo.Calculator;

public class E {
	
	public void nextYear() {
		System.out.println("It will be <2024> next year");
	}
	
	public static void main(String[]args) {
		//class object=new class();
		Calculator calculator = new Calculator();
		//object method()
		calculator.add(10,20); //we are calling the add() method
		calculator.subtract(10,20); //calling subtract() method
		calculator.multiply(10,20); //multiplication method
		calculator.division(100,20);//division() method
	}
}
