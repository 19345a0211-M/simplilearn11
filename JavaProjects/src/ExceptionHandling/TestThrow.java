package ExceptionHandling;

public class TestThrow {

	static void validate(int age){  
		if(age<18)  
		throw new ArithmeticException("not valid");  
		else
		System.out.println("welcome to vote");  
		   }  
		public static void main(String args[]){  
		validate(23);  
		System.out.println("bring voter id...");  
		  }	   

}
