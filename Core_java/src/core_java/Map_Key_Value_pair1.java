package core_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Key_Value_pair1 {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		
		for(Entry<String, Integer> ele : m.entrySet())
		{
			System.out.println(ele.getKey()+":"+ele.getValue());
		}

	}

}
