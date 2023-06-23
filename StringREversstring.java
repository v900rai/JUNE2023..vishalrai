package edu.selfpractice.programing.string;

public class StringREversstring 
{
	public static void main(String[] args)
	{
		String s1 = "Hello";
		String rev= " ";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch=s1.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
	}

}
