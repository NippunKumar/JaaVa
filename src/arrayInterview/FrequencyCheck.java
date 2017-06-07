package arrayInterview;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCheck {
	static int[] a = { 1,32,33,6,75,33,2,33,65,55, };

	public static void frecount(int a[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a) {
			Integer count = map.get(i);
			map.put(i, count != null ? count + 1 : 0);
		}

		Integer popular = Collections.max(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		}).getKey();
		System.out.println(popular);
	}

	public static void main(String[] args) {
		frecount(a);
	}
}