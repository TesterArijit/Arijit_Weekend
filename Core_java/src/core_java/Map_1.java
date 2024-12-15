package core_java;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("Ram", 10);
		m.put("Sita", 15);
		m.put("Laxman", 25);
		m.put("Hanman", 30);
		m.put("Dasarath", 36);
		
		
		System.out.println(m);// {Hanman=30, Sita=15, Laxman=25, Dasarath=36, Ram=10}
		// Clear the total the elements in the Map
		//m.clear();
		
		
	boolean	bool=  m.containsKey("Sita");
	System.out.println(bool);//true
	boolean	bool1=  m.containsValue(30);
	System.out.println(bool1);//true
	
	Map<String,Integer> m1= new HashMap<String,Integer>();
	m1.put("Gopal", 40);
	m1.put("Krishna", 45);
	//put all elements of Map1 into Map2
	m1.putAll(m);
	System.out.println(m1); //{Hanman=30, Krishna=45, Sita=15, Laxman=25, Dasarath=36, Gopal=40, Ram=10}
		
		

	}

}
