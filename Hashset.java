package List;
import java.util.*;  

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("Rice");  
		set.add("Wheat");  
		set.add("Jawar");  
		set.add("Pulses");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}


