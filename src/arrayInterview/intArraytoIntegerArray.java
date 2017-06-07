package arrayInterview;

public class intArraytoIntegerArray {
	public static void main(String[] args) {
      	int intArray[] = { 3, 4, 7 };
      	Integer integerArray[] = new Integer[intArray.length];
      	for (int i = 0; i < intArray.length; i++) {
             	integerArray[i] = intArray[i];//Autoboxing will automatically converts int to Integer
      	}
      	System.out.println("Display Integer[]");
      	for (Integer integer : integerArray) {
             	System.out.print(integer+" ");
      	}
	}
}
