package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTryCatch {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter Another number: ");
			int num2 = scanner.nextInt();
			
			System.out.println("Result of Devision ="+(num1/num2));
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter a zero in the denominator");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Only integer values are allowed");
		}
		
		catch(Exception e) {
			//Action to be taken in case an exception occurs,is defined in this block
			System.out.println("Please enter Valid input");
		}
		finally {
			System.out.println("Hello Meesala");
		}

	}

}
