package arrayInterview;

import java.util.ArrayList;

public class RemoveElementArray {
	 public static void main(String[] args) {
	      ArrayList<String> StringArray = new ArrayList<>();
	      StringArray.clear();
	      StringArray.add(0,"mango");
	      StringArray.add(1,"banana");
	      StringArray.add(2,"apple");
	      StringArray.add("rose");
	      System.out.println("Array before removing an element"+StringArray);
	      StringArray.remove(1);
	      StringArray.remove("0th element");
	      System.out.println("Array after removing an element"+StringArray);
	   }
}
