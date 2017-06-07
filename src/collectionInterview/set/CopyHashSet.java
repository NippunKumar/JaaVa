package collectionInterview.set;

import java.util.HashSet;
import java.util.Set;

public class CopyHashSet {
	public static void main(String[] args) {

		Set<String> hashset = new HashSet<>();
		hashset.add("Java");
		hashset.add("PHP");
		hashset.add(".Net");
		hashset.add("Python");
		
		Set<String> hSet = new HashSet<>();
		hSet.addAll(hashset);
		for(Object s : hSet){
			System.out.println(s);
		}	
	}
}
