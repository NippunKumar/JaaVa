package arrayInterview;

public class smallestAndLargestValueArray {
	public static void SmallAndLargest(int arr[]) {
		int a[] = arr;
		int largest = a[0];
		int smallest = a[0];
		for (int k = 0; k < a.length; k++) {
			if (largest < a[k]) {
				largest = a[k];
			}
			if (smallest > a[k]) {
				smallest = a[k];
			}
		}
		System.out.println("Largest No is " + largest);
		System.out.println("Smallest No is " + smallest);
	}

	public static void main(String[] args) {
		int Array[] = { 1,33,56,22,87,12,78,11,34 };
		SmallAndLargest(Array);
	}
}
