package edu.selfpractice.programing.string;

import java.util.Scanner;

public class printRangeOddNumberGivenNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the odd number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num; i++)
		{
			if(i%2!=0)
			{
			System.out.println("only count the odd number "+i);
			}
		}
		
	}

}
