package collectionInterview.set;

import java.util.HashSet;

import collectionInterview.HashMap.SmartPhone;

public class WorkingHashSet {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add("JavaTpoint");
		set.add(1);
		set.add(new Double(50));
		set.add(new Integer(4));
		set.add(new SmartPhone("Karbon", "a6", 10000, 5));

		System.out.println(set);
		
		  System.out.println("Now we add some duplecate elements");
		  set.add(1);
		  set.add("JavaTpoint");
		  set.add(new SmartPhone("Karbon", "A7", 10000,6));  
		 System.out.println(set);
		 

	}
}
