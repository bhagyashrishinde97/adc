package ExceptionHandling;

public class StackOverFlow {
	void test1()
    { test2();
    }
   	void test2() 
   	{ test1();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackOverFlow s1=new StackOverFlow();
        s1.test1();
     }
     
	}


