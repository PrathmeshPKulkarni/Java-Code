package test;

import java.util.Scanner;

public class Triangle {
	static int base, height, length;
	void Area()
    {
        double area;
        area = (base * height)/2;
        System.out.println("Area of square is : "
                           + area);
    }
  
    void Perimeter()
    {
        double perimeter;
        perimeter = base+height+length;
        System.out.println("Perimeter of square is : "
                           + perimeter);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle asd = new Triangle();
		System.out.println("Enter value of length ");
		Scanner sc = new Scanner(System.in);
		 length = sc.nextInt();
		 System.out.println("Enter value of base ");
			//Scanner sc = new Scanner(System.in);
			 base = sc.nextInt();
			 System.out.println("Enter value of height ");
				//Scanner sc = new Scanner(System.in);
				 height = sc.nextInt();
		asd.Area();
		asd.Perimeter();

	}

}
