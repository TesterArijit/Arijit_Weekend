package core_java;

public class Demo3 {

 public static void main(String[] args) {
	 
	 String s=null;
	 try {
		 System.out.println(s.length());
	 }
	 catch(ArithmeticException e1) {
		 System.out.println("Hi");
	 }
	 catch(NullPointerException e2)
	 {
		 System.out.println("NPE");
	 }
	 
		

	}

}
