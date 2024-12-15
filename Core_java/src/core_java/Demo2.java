package core_java;
//1try 2 catch
public class Demo2 {
	Demo2()
	{
		System.out.println("Java");
	}
	Demo2(int a)
	{
		System.out.println("Python");
	}
	Demo2(int a, int b)
	{
		System.out.println("Ruby");
	}
	Demo2(String a)
	{
		System.out.println("php");
	}

	public static void main(String[] args) {
		new Demo2();
		new Demo2(5);
		new Demo2(12,15);
		new Demo2("Hello");
		

	}

}
