package collectionInterview.set;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {
	public static void main(String[] args) {
		Set<String> hSet = new HashSet<>();
		hSet.add("Java");
		hSet.add("PHP");
		hSet.add(".Net");
		hSet.add("Python");
		System.out.println(hSet+"\n");
		System.out.println("Converting to array");
		String arr[] = new String [hSet.size()];
		hSet.toArray(arr);
		for(String a : arr){
			System.out.println(a);
		}
	}
}
