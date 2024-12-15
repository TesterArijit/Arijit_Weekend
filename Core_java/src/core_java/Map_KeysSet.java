package core_java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_KeysSet {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		// to replace any values 
		m.replace("Ram", 100); // String key, int value
		System.out.println(m); //{Hanman=30, Sita=15, Laxman=25, Dasarath=36, Ram=100}
		// to replace any values 
		m.replace("Ram", 100, 120);
		System.out.println(m); //{Hanman=30, Sita=15, Laxman=25, Dasarath=36, Ram=120}
		
		
		Set<String> s=m.keySet(); //return type Set
		System.out.println(s); //get keys
		
	Collection<Integer> c=m.values();
	System.out.println(c); //get all values
	
	}

}
