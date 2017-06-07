package collectionInterview.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import collectionInterview.list.SmartPhone;

public class HashSetIterate {
	public static void main(String[] args) {
		Set<Object> hSet = new HashSet<>();
		hSet.add("javaTpoint");
		hSet.add("SmartPhone");
		hSet.add(new SmartPhone("Apple", "S3", 10101, 6));
		hSet.add(1);
		Iterator<Object> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
