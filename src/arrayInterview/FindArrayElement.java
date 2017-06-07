package arrayInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class FindArrayElement {
	public static void main(String args[]) throws Exception {
		int array[] = { 2, 4, 1, 9, -5, -10, 3, 8, 15, -3 };
		Arrays.sort(array);
		System.out.println("Sorted array -->"+Arrays.toString(array));
		int index = Arrays.binarySearch(array, 3);
		System.out.println("Got 3 at index-->" + index);
	}
}
