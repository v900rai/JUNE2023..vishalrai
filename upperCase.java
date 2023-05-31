package javaInterviewProgram;

public class upperCase 
{
	public static void main(String []args)
	{
		String str="qwtyuiRDFLBGITYfbBiug";
		int count =0;
		//int count =0;
		for(int i=0; i<str.length(); i++ )
		{
			char ch=str.charAt(i);
		
			if(Character.isUpperCase(ch))
					
				count++;
			/*
			if(Character.isLowerCase(ch))
				
				count++;*/
					
					
		}
		System.out.println(count+" upperCase");
		System.out.println(count+"lowercase");
	}

}
