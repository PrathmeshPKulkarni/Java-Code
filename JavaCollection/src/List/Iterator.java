package List;

import java.util.ArrayList;



public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Company = new ArrayList<String>();
		Company.add("Infosys");
		Company.add("TCS");
		Company.add("Capita");
		Company.add(" Capgemini");
		Company.add("Microsoft");
		Company.add("Google");
		Company.add("Amazon");
	    Company.add("Apple");
	    java.util.Iterator<String> it = Company.iterator();


	    System.out.println(it.next());
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}


	}

}
