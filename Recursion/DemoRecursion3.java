

//program to print hello n times using recursion
import java.util.*;
import java.io.*;

public class DemoRecursion3
{
	
	static int count =0;
	static void p(int no)
	{
		count++;
		if(count<=no)
		{
			System.out.println("Hello"+count);
			p(no);
		} 
		
	}
	
	public static void main(String arg[])
	{
		int no=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		no=sc.nextInt();
		p(no);
	}
}