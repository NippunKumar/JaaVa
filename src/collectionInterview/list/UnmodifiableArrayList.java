package collectionInterview.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnmodifiableArrayList {
	public static void main(String[] args) {
		List<String> furitList = new ArrayList<String>();

		furitList.add("Mango");
		furitList.add("Banana");
		furitList.add("Apple");
		furitList.add("Strawberry");
		furitList.add("Pineapple");
		
	    List<String> unmodifiableList = Collections.unmodifiableList(furitList);
	/*    unmodifiableList.add("INDIA");*/
	    furitList.add("Pineapple");
		System.out.println(furitList);
		
	}
}
