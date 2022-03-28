package List;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> List = new ArrayList<String>();
		String str = "Apple";
		String a = "Mango";
		List.add("string");
		List.add(str);
		List.add(a);
		List.add(str + str+a);
   System.out.println(List.contains("Good"));
  // System.out.println(List.size())
   for(String index : List)
	   System.out.println(index+"");

	}

}
