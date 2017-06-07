package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WhyImmutableKeyHashMap {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		String a = "aa";
		String b = "bb";
		String c = "cc";
		String d = "dd";
		String e = "ee";
		String f = "ff";
		String z ;
		map.put(a, 1);
		map.put(b, 2);
		map.put(c, 3);
		map.put(d, 4);
		map.put(e, 5);
		map.put(f, 6);
		
		z=a;
		a += "xx";
	System.out.println(map.get(a));	
	System.out.println(map.get(z));	
		
		
		
		
		
		
		
	}
}
