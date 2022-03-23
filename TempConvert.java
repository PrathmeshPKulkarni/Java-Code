//Write a java program which convert a temparature farenheit to celcious
import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the temparature value");
Scanner sc= new Scanner(System.in);
float faran = sc.nextFloat();
float celcious;
celcious = ((faran-32)*5/9);
System.out.println(celcious);


	}

}
