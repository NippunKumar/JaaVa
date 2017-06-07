package arrayInterview;

public class CommonElementsInArray {
	public static void main(String a[]) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		int[] arr3 = { 1, 2, 4, 7, 9, 1, 23, 7, 5 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
}