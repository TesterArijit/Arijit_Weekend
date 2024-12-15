package core_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Iterator {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		
		Iterator<Entry<String,Integer>> i = m.entrySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//		        Hanman=30
//				Sita=15
//				Laxman=25
//				Dasarath=36
//				Ram=10
//		

	}

}
