package DemoProg;

public class ReverseNum {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int num=1234;
		int result =0;
		int digit=0;
		
		while (num!=0)
		{
			digit=num%10;  //----4--get last digit 
			//System.out.println("last digit:"+digit);
			
			result=result*10 +digit;  // 4
			//System.out.println("result:"+result);
			num=num/10;   //123    //remove last digit
			//System.out.println("remove last digit:"+num);
			
		}
		
		System.out.println("reverse num:"+result);

	}

}
