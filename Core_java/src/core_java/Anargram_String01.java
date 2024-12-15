package core_java;

import java.util.Arrays;
import java.util.Scanner;

public class Anargram_String01 {
	public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter the first string");
	String a=sc.next();
	System.out.println("Enter the second string");
	String b=sc.next();
	
	if(a.length()!=b.length())
	{
		System.out.println("Strings are not anargram");
	}
	else
	{
		char[] c =a.toCharArray();
		char[] c1 =b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		boolean ans=Arrays.equals(c, c1);
		
		if(ans==true)
		{
			System.out.println("Strings are anagram to each other");
		}
		else
		{
			System.out.println("Strings are not anagram to each other");
		}
		
		
	}
	
		
	}
	
	}


