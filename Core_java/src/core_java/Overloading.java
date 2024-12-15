package core_java;

public class Overloading {
	public static void display()
	{
		System.out.println("1");
	}
	public static void display(int a)
	{
		System.out.println("2");
	}
	public static void display(int a, int b)
	{
		System.out.println("3");
	}


	public static void main(String[] args) {
		display();
		display(10);
		display(10,12);
		
	}

}
