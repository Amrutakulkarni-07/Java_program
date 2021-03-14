
//infinite times prints hello 
public class DemoRecursion
{
	static void p()
	{
		System.out.println("Hello");
		p();
	}
	
	
	public static void main(String arg[])
	{
		p();
	}
}