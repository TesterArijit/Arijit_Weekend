package core_java;

import java.util.Arrays;

public class Attay_to_toString {

	public static void main(String[] args) {
		int [] a= new int[3];
		a[0]=45;
		a[1]=75;
		a[2]=55;
		
		//Convert array in to string
		System.out.println(Arrays.toString(a));
		
		// Shorting an array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		String [] b=new String [4];
		b[0]="Hi";
		b[1]="Hello";
		b[2]="Hola";
		b[3]="Namaste";
		//Convert array in to string
		System.out.println(Arrays.toString(b));

	}

}
