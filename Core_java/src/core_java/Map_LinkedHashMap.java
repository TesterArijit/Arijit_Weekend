package core_java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_LinkedHashMap {

	public static void main(String[] args) {
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(10, "Radha");
		m.put(15, "Shyam");
		m.put(25, "Hari");
		m.put(35, "Krishna");
		m.put(45, "Govinda");
		m.put(45, "Govinda");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey(10));
		System.out.println(m.containsValue("Radha"));
		System.out.println(m.putIfAbsent(100, "Murari"));
		System.out.println(m.remove(45, "Govinda"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(Integer ele:m.keySet())
		{
			System.out.println(ele);
		}
		for(String ele:m.values())
		{
			System.out.println(ele);
		}
		for(Entry<Integer,String> ele : m.entrySet())
		{
			System.out.println(ele.getKey()+": "+ele.getValue());
		}
		
		Iterator <Entry<Integer,String>> i = m.entrySet().iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				
				
			Set<Integer> s =m.keySet();
			System.out.println(s);
			Collection<String> c = m.values();
			System.out.println(c);
			
	}

}
