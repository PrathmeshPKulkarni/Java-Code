package Test;

public class MethodOverloading {
	int a, b;
	float c,d;
	String s1, s2;
	public int Add(int a, int b)
	{
		return a+b;
	}
	public double Add(double c, double d)
	{
		return c+d;
	}
     public String Add(String s1, String s2)
     {
    	 return s1+s2;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading met =new MethodOverloading();
		System.out.println(met.Add(3, 5));
		System.out.println(met.Add(3.5,5.57));
		System.out.println(met.Add("Good", "Morning"));
	}

}
