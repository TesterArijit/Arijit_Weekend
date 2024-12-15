package core_java;

import java.util.Stack;

public class asr1 {
 	
 public static void main(String[] args) {
	 Stack<Integer> s=new Stack<Integer>();
	 s.push(25);
	 s.push(2);
	 s.push(45);
	 s.push(1);
	 s.push(125);
	 s.push(26);
	 s.push(8);
	 System.out.println(s);
	 s.peek();
	 s.pop();
	 System.out.println(s);
	 Stack<Integer> s1=new Stack<Integer>();
	 s1.push(25);
	 s1.push(2);
	 s1.push(20);
	 s1.push(30);
	 System.out.println(s.retainAll(s1));
	 System.out.println(s);
	 
	 
	 
	 
		
	}

}
