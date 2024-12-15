package core_java;

import java.util.HashSet;

public class Demo4 {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(10);
		s.add(25);
		s.add(2);
		s.add(32);
		s.add(52);
		s.add(1);
		s.add(100);
		s.add(250);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(10));
		System.out.println(s.remove(1));
		
		HashSet s1=new HashSet();
		s1.add(100);
		s1.add(250);
		System.out.println(s1.addAll(s));
		System.out.println(s1);
		
		System.out.println(s.containsAll(s1));
		
		
		

	}

}
