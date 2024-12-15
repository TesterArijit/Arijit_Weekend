package core_java;

import java.util.HashMap;
import java.util.Map;

public class Map_foreach_Key_Value {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		
		for(String ele:m.keySet())
		{
			System.out.println("Student name"+ele); // Get only keys
		}
		for(Integer ele: m.values())
		{
			System.out.println("Roll_no"+ele); //// Get only values
		}
		
		

	}

}
