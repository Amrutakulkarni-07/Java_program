package DemoProg;

public class DemoString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   ///program to reverse the string given 
   
		String str="Automation";
		String reversed="";
		
		for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
		
		
	}

}

