package collectionInterview.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetRetainCommonObj {
	public static void main(String[] args) {
		Set<String> hSet = new HashSet<>();
		hSet.add("Java");
		hSet.add("php");
		hSet.add(".Net");
		hSet.add("Python");
		hSet.add("MySql");
		System.out.println(hSet + "\n");

		Set<String> hashSet = new HashSet<>();
		hashSet.add("MySql");
		hashSet.add("php");
		hashSet.add("java");
		System.out.println(hashSet + "\n");

		System.out.println("removing uncommon objects");
		hSet.retainAll(hashSet);

		System.out.println("Printing Set");
		System.out.println(hSet);

	}
}
