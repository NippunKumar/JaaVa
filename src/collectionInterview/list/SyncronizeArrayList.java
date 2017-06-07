package collectionInterview.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SyncronizeArrayList {

	public static void main(String args[]) {

		// Non Synchronized ArrayList 
		List<String> furitList = new ArrayList<String>();

		furitList.add("Mango");
		furitList.add("Banana");
		furitList.add("Apple");
		furitList.add("Strawberry");
		furitList.add("Pineapple");
		
		System.out.println(furitList.get(2));
		
		

		// Synchronizing ArrayList in Java
		furitList = Collections.synchronizedList(furitList);

		// While Iterating over synchronized list, we must synchronize
		// on it to avoid non-deterministic behavior

		synchronized (furitList) {
			java.util.Iterator<String> itr = furitList.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
}
