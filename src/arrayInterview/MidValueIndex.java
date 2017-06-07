package arrayInterview;

public class MidValueIndex {
	public static int midElement(int ar[]) {

		int leftIndex = 0, rightIndex = ar.length - 1;
		int leftSum = 0, rightSum = 0;

		while (leftIndex <= rightIndex) {
			if (leftSum > rightSum)
				rightSum = rightSum + ar[rightIndex--];
			else
				leftSum = leftSum + ar[leftIndex++];
		}

		if (leftSum == rightSum)
			return rightIndex;
		else
			return -1; // appropriate index not found
	}

	public static void main(String[] args) {
		int array[] = { 2, 4, 4, 2, 6, 1,5 };
		if (midElement(array) == -1) {
			System.out.println("Mid index is not fond");
		} else
			System.out.println("The Midian of the array is at index -->"+midElement(array));
	}
}
