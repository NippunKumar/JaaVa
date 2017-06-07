package stringInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfANumber {
	static int x[] = { 1, 2, 2, 44, 4, 5, 6, 2, 8, 9, 7, 8, 12, 43, 65, 8, 32, 8 };

	static void getMostFrequentElement(int x[]) {
		Map<Integer,Integer> map = new HashMap<>(); 
		for(int i : x){
			map.put(i, x[i]);
		}
		Set<Entry<Integer,Integer>> setEntry = map.entrySet();
	    for (int i : x) 
        {
            if (map.containsKey(i))
            {
                //If an element is present, incrementing its count by 1
                 
            	map.put(i, map.get(i)+1);
            }
            else
            {
                //If an element is not present, put that element with 1 as its value
                 
            	map.put(i, 1);
            }
        }
	}
}
