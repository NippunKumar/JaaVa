package collectionInterview.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WorkingWithHashSet {
	public static void main(String[] args) {

		Set<SmartPhone> phoneSet =Collections.emptySet();

		phoneSet.add(new SmartPhone("Apple", "A1", 111111, 10));
		phoneSet.add(new SmartPhone("Samsung", "s8", 101010, 9));
		phoneSet.add(new SmartPhone("LG", "g5", 22222, 8));
		phoneSet.add(new SmartPhone("HTC", "K28", 33333, 7));

		System.out.println(phoneSet + "\n");
		SmartPhone sp1 = new SmartPhone("Apple", "A1", 111111, 10);

		if (phoneSet.contains(sp1)) {
			System.out.println("Set Contains the given object");

		} else {
			System.out.println("Does not contains");
		}
		 
	}
}
