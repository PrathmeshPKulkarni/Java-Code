package Using_try_catch;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		      // code that generate exception
		      int Answer = 9 / 0;
		      System.out.println(Answer);
		    }
		    
		    catch (ArithmeticException a) {
		      System.out.println("ArithmeticException");
		    }
		System.out.println("Final");// this state is exiguted

	}

}
