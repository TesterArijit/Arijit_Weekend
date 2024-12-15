package core_java;

import java.util.HashMap;
import java.util.Map;

public class Map_putIfAbsent {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		System.out.println(m.size());
		
		m.putIfAbsent("Hari", 100);
		// put the key value pair if it is absent in the defined map
		System.out.println(m);
		System.out.println(m.size());
		m.putIfAbsent("Ram", 12);
		System.out.println(m);

	}

}
