package ExceptionHandling;

public class SimpleJavaException {
	void show()
	{
		System.out.println("print void show method");
	}

	public static void main(String[] args, SimpleJavaException SimpleJavaException) {
		// TODO Auto-generated method stub
    System.out.println("inside  main method");
    SimpleJavaException =new SimpleJavaException();
    System.out.println("create object of a class");
    Object obj = null;
    try
    {
    	//notes: we must use try block with either catch or finally block
    	obj.show();
    }
   
   
    	catch(Exception e)
    	{
    		
    	}
    	System.out.println("Execution of main mehtod is done");
    	
    }
    void division(int a,int b)
    {
    	System.out.println("use for method to division");
    	int c=a/b;
    	System.out.println("excution of div method is done");
    }
	}


