package List;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Company = new LinkedList<String>();
		Company.add("Capita");
		Company.add(" Capgemini");
		Company.add("Microsoft");
		Company.add("Google");
		Company.add("Amazon");
	    Company.add("Apple");
	    System.out.println(Company);
	    Company.remove("Google");
	    System.out.println(Company);
        Company.addFirst("KPMG");
	    System.out.println(Company);
	    System.out.println(Company.getFirst());
	   Company.removeFirst();
	    System.out.println(Company);


         
	}

}
