package DemoProg;

import java.util.Scanner;


public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       //string reverse using stringbuilder
		try(Scanner s=new Scanner(System.in))
				{
			System.out.println("Enter a string which you want to reverse:");
			String res=s.nextLine();
			StrRev(res);
			
				}
		
		}
	
	public static void StrRev(String Str)
	{
		
     String reversed = new StringBuilder(Str).reverse().toString();
        
        System.out.println("Original: " + Str);
        System.out.println("Reversed: " + reversed);
        
        if(Str.equals(reversed))
        {
        	System.out.println("string is palindrome");
        }
        else
        {
        	System.out.println("String is not palindrome");
        }
	}

}
