package arrayInterview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArrayElement {
	public static void main(String[] args) {
		String[] strArray = { "Mango","Banana","Apple","Mango","Tomato" };

		Set<String> set = new HashSet<>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}
