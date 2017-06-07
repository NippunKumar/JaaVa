package arrayInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {
	public static void ReverseArrayList(List mylist) {
		Collections.reverse(mylist);
	}
	public static void main(String[] args) {
		List<Object> mylist = new ArrayList<>();
		mylist.add("1");
		mylist.add(2);
		mylist.add(new Integer(4));
		mylist.add("erg");
		System.out.println("Before Reversing");
		System.out.println(mylist);
		ReverseArrayList(mylist);
		System.out.println("After Reversing");
		System.out.println(mylist);
	}
}
