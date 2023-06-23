package edu.selfpractice.programing.string;

public class methodOverloading 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		int z=vishal(10,33);
		System.out.println("integer"+z);
		double v=DDDD(12.44,23.45);
		System.out.println("double"+v);
		System.out.println("end start");
		
	}
	public static int vishal(int x, int y)
	{
		return x+y;
	}
	public static double DDDD(double x , double y)
	{
		return x+y;
	}

}
