package Using_try_catch;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{     
			    try{    
			     System.out.println("going to divide by 0");    
			     int b =9/0;    
			   } 
			    catch(ArithmeticException e)  
			    {  
			      System.out.println(e);  
			    }    
			       
			    try{    
			    int a[]=new int[5];    
			  
			     a[6]=7;    
			     }  
			   
			    catch(ArrayIndexOutOfBoundsException e)  
			    {  
			       System.out.println(e);  
			    }    
			  
			      
			    System.out.println("statement");    
			  }  
			  catch(Exception e)  
			  {  
			    System.out.println("Exception Handle");  
			  }    
			    
			  System.out.println("Statement Exiguted"); 

	}

}





 