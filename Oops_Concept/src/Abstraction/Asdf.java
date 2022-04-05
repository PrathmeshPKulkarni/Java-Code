package Abstraction;

public class Asdf implements Polygon {
	public void shape() {
		  
	    System.out.println("Shape is pentagon");
	  }
	  public void side() {
	   
	    System.out.println("There are 5 side");
	  }

}
class Main {
	  public static void main(String[] args) {
	    Asdf asd = new Asdf();  
	    asd.shape();
	    asd.side();
	  }
	}