package collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_required_forSelenium {

	public static void main(String[] args) {
		usingIteratorInterfaceAnditeratorMethod();
		usingArrayList();
		usingHashSet();
	}
	
	public static void usingHashMap() {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(39, "age");
		hashmap.put(190, "height");
		
		for(Integer i : hashmap.keySet()) {
			System.out.println(hashmap.get(i));
			
		}
		
	}
	
	public static void usingIteratorInterfaceAnditeratorMethod() {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		
		Iterator<Integer> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	
	public static void usingArrayList() {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("My");
		arraylist.add("name");
		arraylist.add("is");
		arraylist.add("Sarthak");
		
		for(String a : arraylist) {
			System.out.print(a + " ");
		}
		
		System.out.println();
	}
	
	public static void usingHashSet() {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("My");
		hashset.add("name");
		hashset.add("is");
		hashset.add("Sarthak");
		hashset.add("Sarthak"); //HashSet does not allow duplicates
		
		
		for(String a : hashset) {
			System.out.print(a + " ");
		}
	}
	
	
}
