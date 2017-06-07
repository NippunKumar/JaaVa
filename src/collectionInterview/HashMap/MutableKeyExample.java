package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MutableKeyExample {

	public static void main(String[] args) {

		Map<SmartPhone, Integer> map = new HashMap<>();
		SmartPhone ph1 = new SmartPhone("Apple", "S7", 100000, 9);
		SmartPhone ph2 = new SmartPhone("Lenove", "K4", 12000, 7);
		SmartPhone ph3 = new SmartPhone("Blackberry", "b1", 15000, 6);
		SmartPhone ph4 = new SmartPhone("Lenove", "K4", 12000, 7);
		SmartPhone ph5 = new SmartPhone("Letv", "le 2", 11999, 8);
		SmartPhone ph6 = new SmartPhone("MI", "4", 13990, 9);
		map.put(ph1, 100);
		map.put(ph2, 90);
		map.put(ph3, 80);
		map.put(ph4, 70);
		map.put(ph5, 60);
		map.put(ph6, 50);

		for (Entry<SmartPhone, Integer> es : map.entrySet()) {
			System.out.println(es.getKey());
		}
		System.out.println("Using key(ph1) to retrive value");
		System.out.println("getting the value "+map.get(ph1));
		System.out.println("changing the state of key(ph1)");
		ph1.setPrice(100);
		System.out.println("Attempt to retrive the same value");
		System.out.println("getting the value "+map.get(ph1));
		

	}
}
