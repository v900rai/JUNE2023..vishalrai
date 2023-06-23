package edu.selfpractice.programing.string;

import java.util.Scanner;

public class removeAllSpecialCharacter 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the special number character");
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		String Plainstr =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(Plainstr );
		
	}

}
