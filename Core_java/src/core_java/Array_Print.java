package core_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Print {

	public static void main(String[] args) {
int [] a=new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(Arrays.toString(a));
		
		// Taking input from user
		
		int [] b=new int[4];
	Scanner	sc =new Scanner(System.in);
	System.out.println("Enter the number in array");
	
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	System.out.println("The arrays of gievn number is :> "+Arrays.toString(b));
	
	
	
	// Taking input from user----->> String
	
	System.out.println("Enter the number in array1");
	String [] b1=new String[4];
	
	for(int i=0;i<b1.length;i++)
	{
		b1[i]=sc.next();
	}
	System.out.println("The arrays of gievn number is :> "+Arrays.toString(b1));
	sc.close();

	}

}
