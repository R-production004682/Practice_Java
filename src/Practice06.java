public class Practice06
{
	public static void main(String[] args)
	{
		int age = 14;
		System.out.print("年齢 : " + age + "\n");
		
		if		(20 <= age)
		{
			System.out.println("成人です\n");
		}
		
		else if(age < 20 && 0 <= age)
		{
			System.out.println("未成人です\n");
			
			if(age < 6 || 14 < age) {System.out.println("今は義務教育を受けてません");}
			else 							  {System.out.println("義務教育を受けてます");}
		}
		else 
		{
			System.out.println("error\n");
		}
		
		//義務教育してるかしてないか
		
		
		
		
	}
}