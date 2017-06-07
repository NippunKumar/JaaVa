package arrayInterview;

import java.util.Arrays;

public class CompareArray {
	 public static void main(String[] args) throws Exception {
	      int[] array1 = {1,2,3};
	      int[] array2 = {1,2,3};
	      int[] array3 = {1,2,3,4};
	      
	      System.out.println("Is array 1 equal to array 2---> "+Arrays.equals(array1, array2));
	      System.out.println("Is array 1 equal to array 3---> "+Arrays.equals(array2, array3));
	   }
}
