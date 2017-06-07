package collectionInterview.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayListToArray {
	public static void main(String[] args) {
		//creating Arraylist
		
		List<String> fruitList = new ArrayList<>();
		//adding String Objects to fruitsList ArrayList
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");
		System.out.println("Converting fruitList ArrayList to Array item" );
		String[] item = fruitList.toArray(new String[fruitList.size()]);
		for(String s : item){
			System.out.println(s);
		}
		List<String> l2 = new ArrayList<>();
		System.out.println("Converting item Array to ArrayList l2" );
		l2 =  Arrays.asList(item);
		System.out.println(l2);
		
		
	}
}
