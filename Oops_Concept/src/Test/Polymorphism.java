package Test;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape Shape;
		Rectangle rect = new Rectangle();
		Shape= rect;
		Shape.height = 3;
		Shape.width =7;
		System.out.println("the area of rectanglr is" +rect.getArea());
		
		

	}

}
