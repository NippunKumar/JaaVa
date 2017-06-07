package arrayInterview;

import java.util.Arrays;

public class SubArrayEqualsToNum {
	static void SubArray(int[] Array, int Number) {
		int sum = Array[0];
		int start = 0;
		for (int i = 1; i < Array.length; i++) {
			sum = sum + Array[i];
			while (sum > Number && start <= i - 1) {
				sum = sum - Array[start];
				start++;
			}
			if (sum == Number) {
				System.out.print("Main array " + Arrays.toString(Array) + " having sum "
						+ Number + " is [");
				for (int j = start; j <= i; j++) {
					System.out.print(Array[j] + " ");
				}
				System.out.print("]");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		SubArray(new int[] { 1,2,3,4,5,6,7,8,9 }, 10);
		SubArray(new int[] { 1,23,21,43,9,4,10 },44 );
		SubArray(new int[] { 12,34,10,9,54,14,17 }, 17);
	}
}
