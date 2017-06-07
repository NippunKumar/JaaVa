package arrayInterview;

public class ReturnPairsOfSum {
	private static final int MAX = 100; // Max size of Hashmap

	static void findPairs(int array[], int sum) {
		// Declares and initializes the whole array as false
		boolean[] binayMap = new boolean[MAX];

		for (int i = 0; i < array.length; ++i) {
			int temp = sum - array[i];

			// checking for condition
			if (temp >= 0 && binayMap[temp]) {
				System.out.println("Pairs having sum " + sum + " is [" + array[i] + ", " + temp + "]");
			}
			binayMap[array[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int Array[] = { 1, 4, 45, 6, 10, 8, 2 };
		int sum = 10;
		findPairs(Array, sum);
	}
}
