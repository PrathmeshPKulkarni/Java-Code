package test;
import java.util.Scanner;

public class Square {
	static int length;
	void Area()
    {
        double area;
        area = length * length;
        System.out.println("Area of square is : "
                           + area);
    }
  
    void Perimeter()
    {
        double perimeter;
        perimeter = 4 * (length);
        System.out.println("Perimeter of square is : "
                           + perimeter);
    }

	public static void main(String[] args) {
		Square asd = new Square();
		System.out.println("Enter value of length ");
		Scanner sc = new Scanner(System.in);
		 length = sc.nextInt();
		asd.Area();
		asd.Perimeter();
		
		
		// TODO Auto-generated method stub

	}

}
