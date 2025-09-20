package DemoProg;

import java.util.Scanner;

public class StringCon {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string:");

		String s1=sc.nextLine();
		System.out.println("enter second string:");
		String s2=sc.nextLine();
       
		int len1=Math.max(s1.length(),s2.length());
		
		String s3="";
		
		for(int i=0;i<len1;i++)
		{
			if(i<s1.length())
			{
				s3=s3+s1.charAt(i);
					
			}
			if(i<s2.length())
			{
				s3=s3+s2.charAt(i);
			}
		}
		
		System.out.println("conat string:"+s3);
	}
}
	
	
