package ExceptionHandling;

public class ArithmeticException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
			 int a=10;
			 int b= 0;
	            int result = a / b;
	            System.out.println("The result of " + a + " divided by " + b + " is " + result);
	        } catch (ArithmeticException e) 
	        {
	        	
	            System.out.println("Error: Division by zero is not allowed.");
	        } 
		    }
		
	}


