package core_java;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Iteration {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Hello");
		s.push(100);
		s.push(20);
		s.push('c');
		s.push(120);
		s.push(520);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.get(1));
	System.out.println(s.getFirst());
		System.out.println(s.remove(3));
		
		Stack<Integer> s1=new Stack <Integer>();
		s1.push(100);
		s1.push(20);
		s1.push(220);
		s1.push(574);
		s1.push(158);
		
		ListIterator<Integer> i = s1.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
		Stack<Integer> s2=new Stack <Integer>();
		
		s2.addElement(10);
		s2.addElement(25);
		s2.addElement(2);
		s2.addElement(145);
		
		Enumeration<Integer> e=s2.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	
	}

}
