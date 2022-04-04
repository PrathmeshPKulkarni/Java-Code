package List;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> L = new ArrayList<String>();
		String str = "Apple";
		String a = "Mango";
		L.add("Orange");
		L.add(str);
		L.add(a);
		L.add(str + str+a);
   System.out.println(L.contains("Mango"));
  // System.out.println(List.size())
   for(String index : L)
	   System.out.println(index+ "");

	}

}
