package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorkingHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Orange");
		map.put(3, "Apple");
		System.out.println(map.put(4, "Banana"));
		map.put(5, "Strawberry");
		Set<Entry<Integer, String>> eSet = map.entrySet();
		for (Entry e : eSet) {
			System.out.println(e.getValue());
		}
	}
}
