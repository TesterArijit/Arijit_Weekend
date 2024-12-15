package core_java;

import java.util.Arrays;

public class Find_spclChar {

	public static void main(String[] args) {
		
		String s="arijit1990  @@!!";
		char [] c =s.toCharArray();
		String a=Arrays.toString(c);
		int count_alphabet=0;
		int count_numbert=0;
		int count_spaces=0;
				
		for(int i=0;i<s.length();i++)
		{
			boolean ans = Character.isAlphabetic(c[i]);
			boolean ans1= Character.isDigit(c[i]);
			boolean ans2= Character.isSpaceChar(c[i]);
			
			
			if(ans==true)
			{
				count_alphabet++;
			}
			if(ans1==true)
			{
				count_numbert++;
			}
			if(ans2==true)
			{
				count_spaces++;
			}
			
			int val =s.length()-count_alphabet-count_numbert-count_spaces;
			
			if(val>0)
			{
				System.out.println("spcl char present");
			}
			else
			{System.out.println("spcl char not present");
				
			}
			
		}
		System.out.println(count_alphabet);
		System.out.println(count_numbert);
		System.out.println(count_spaces);
		
		
		
		

	}

}
