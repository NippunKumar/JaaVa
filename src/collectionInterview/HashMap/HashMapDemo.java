package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDemo {

	public static void main(String[] args) {
		Ball b1 = new Ball("Tennis", 3, 50);
		Ball b2 = new Ball("cricket", 11, 150);
		Ball b3 = new Ball("football", 9, 450);
		Ball b4 = new Ball("basketball", 12, 600);
		Ball b5 = new Ball("volleyball", 10, 250);

		Map<Ball, Integer> map = new HashMap<>();
		
		map.put(null, 5);
		map.put(b1, 1);
		map.put(b2, 2);
		map.put(b3, 3);
		map.put(b4, 4);
		map.put(b5, 5);

		for (Entry<Ball, Integer> es : map.entrySet()) {
			System.out.println(es);
		}
	}
}
