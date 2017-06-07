package arrayInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyCount {
	static void Mostfrequent(int input[]) {
		Map<Integer, Integer> CountMap = new HashMap<Integer, Integer>();
		for (int i : input) {
			if (CountMap.containsKey(i)) {
				CountMap.put(i, CountMap.get(i) + 1);
			} else {
				CountMap.put(i, 1);
			}
		}
		int element = 0;
		int frequency = 1;

		Set<Entry<Integer, Integer>> entrySet = CountMap.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > frequency) {
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}

		if (frequency > 1) {
			System.out.println("Input Array : " + Arrays.toString(input));
			System.out.println("The most frequent value : " + element);
			System.out.println("Its frequency : " + frequency);
		} else {
			System.out.println("Input Array : " + Arrays.toString(input));
			System.out.println("All values are unique.");
		}
	}

	public static void main(String[] args) {
		Mostfrequent(new int[] { 3, 2, 4, 5, 6, 4, 3, 3, 2, 3 });
		Mostfrequent(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
	}

}
