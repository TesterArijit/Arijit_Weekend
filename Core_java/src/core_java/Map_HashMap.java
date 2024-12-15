package core_java;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {

	public static void main(String[] args) {
		Map<Integer,Character> m=new HashMap<Integer,Character>();
		
		m.put(10, 'a');
		m.put(15, 'b');
		m.put(25, 'c');
		m.put(32, 'd');
		System.out.println(m.size());//4
		System.out.println(m.isEmpty());//false
		System.out.println(m.containsKey(10));//true
		System.out.println(m.containsValue('d'));//true
		System.out.println(m.keySet());//[32, 25, 10, 15]
		System.out.println(m.values());//[d, c, a, b]
		System.out.println(m.get(15));//b
		System.out.println(m.putIfAbsent(50, 'e'));
		System.out.println(m);
		System.out.println(m.replace(10, 'p'));
		System.out.println(m);
		System.out.println(m.remove(32, 'd'));
		m.clear();
		System.out.println(m);
		

	}

}
