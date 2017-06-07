package collectionInterview.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WaysToCreateHashMap {
	public static void main(String[] args) 
    {
        //1. HashMap with default initial capacity and load factor
         
        Map<String, Integer> map1 = new HashMap<String, Integer>();
         
        //2. HashMap with 30 as initial capacity 
         
        Map<String, Integer> map2 = new HashMap<String, Integer>(30);
         
        //3. HashMap with 30 as initial capacity and 0.5 as load factor
         
        Map<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);
         
        //4. HashMap by copying another HashMap
         
        Map<String, Integer> map4 = new HashMap<String, Integer>(map1);
    } 
}
