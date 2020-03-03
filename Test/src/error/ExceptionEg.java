package error;

//Java program illustrating exception thrown 
//by AritmeticExcpetion class 

public class ExceptionEg { 

	public static void main(String[] args) 
	{ 
		int a = 5, b = 0; 

		// Attempting to divide by zero 
		try { 
			int c = a / b; 
		} 
		catch (ArithmeticException e) { 
			e.printStackTrace(); 
		} 
	} 
} 
