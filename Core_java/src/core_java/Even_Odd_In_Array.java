package core_java;

public class Even_Odd_In_Array {

	public static void main(String[] args) {
		//To find even number
		int a[]= {10,15,13,14,25,28,31,32};
		int no;
		
		for(int i=0;i<a.length;i++)
		{
			no=a[i];
			
			if(no%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("=========");
		//To find odd number
		for(int i=0;i<a.length;i++)
		{
			no=a[i];
			
			if(no%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
