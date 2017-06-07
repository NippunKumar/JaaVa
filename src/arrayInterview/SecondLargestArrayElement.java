package arrayInterview;

public class SecondLargestArrayElement {
	public static void main(String[] args) {
		int array[] = { 8, 3, 6, 1, 0, 3, 9, 5, 10 };
		int largest = array[0];
		int secondLargest = array[0];
		System.out.println("Array is:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println("\nSecond largest value is:" + secondLargest);
	}
}
