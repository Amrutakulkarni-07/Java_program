package DemoProg;

import java.util.Scanner;

public class day1 {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      //reverse string 
		try(Scanner scanner=new Scanner(System.in))
		{
		System.out.println("Enter a string which you want to reverse:");
		String res=scanner.nextLine();
		
		
		String rev=StrRev(res);
		
		System.out.println("Reversed string is :"+rev);
		
		}
	}
	
	public static String StrRev(String New)
	{
		
		StringBuilder temp=new StringBuilder();
		
		for (int i=New.length()-1;i>=0;i--)
		{
			temp.append(New.charAt(i));
		}
		return temp.toString();
	}
}


