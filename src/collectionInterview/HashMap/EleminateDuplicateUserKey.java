package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EleminateDuplicateUserKey {

	public static void main(String[] args) {

		Map<SmartPhone, Integer> map = new HashMap<>();
		SmartPhone ph1 = new SmartPhone("Apple", "S7", 555, 9);
		SmartPhone ph2 = new SmartPhone("Lenove", "K4", 444, 7);
		SmartPhone ph3 = new SmartPhone("Blackberry", "b1", 333, 6);
		SmartPhone ph4 = new SmartPhone("Letv", "le 2", 222, 8);
		SmartPhone ph5 = new SmartPhone("MI", "4", 111, 9);
		map.put(ph1, 100);
		map.put(ph2, 90);
		map.put(ph3, 80);
		map.put(ph4, 70);
		map.put(ph5, 60);

		for (Entry<SmartPhone, Integer> es : map.entrySet()) {
			System.out.println(es);
		}

		if (map.containsKey(new SmartPhone("Apple", "S8", 555, 10))) { // This will generate the same hash code as ph1
																	   //  hashcode does not depend on  model or rating and will 
																	// generate the hashcode as ph1
			System.out.println("Duplicate key provided");
			System.out.println("It will replace the corresponding value");
			map.put(new SmartPhone("Apple", "S8", 555, 10), 15);	// notice that the model and rating remain unchanged in the key of map
			System.out.println();
		} else {
			System.out.println("Different Key");
		}
		for (Entry<SmartPhone, Integer> es : map.entrySet()) {
			System.out.println(es);
		}

	}
}
