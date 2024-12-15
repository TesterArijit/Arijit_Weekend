package core_java;

import java.util.HashMap;
import java.util.Map;

public class Map_check_twoMapSize_EqualOrNot {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		
		Map<String,Integer> m1= new HashMap<String,Integer>();
		m1.put("Gopal", 50);
		m1.put("Madhav", 100);
		m1.put("Kesav", 125);
		
		if(m.size()==m1.size())
		{
			System.out.println("Sizes are equal");
		}
		else
		{
			System.out.println("Sizes are not equal");
		}
		}

}
