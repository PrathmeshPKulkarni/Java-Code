//Encapsulation
package data_hiding;

public class Add {
	private static int a;
	private static int b;
	private static int c;
	public static int getadd(int c)
	{
		c=a+b;
		return c;
	}
	public void setadd(int a, int b)
	{
		this.a =a;
		this.b =b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Add as =new Add();
    as.setadd(5,6);
    System.out.println(getadd(c));
 
	}

}
