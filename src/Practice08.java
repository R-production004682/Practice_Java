public class Practice08
{
	public static void main(String[] arge)
	{
		int month = 20;
		
		switch(month)
		{
			case 1,3,5,7,8,10,12:
				System.out.print(month + "月は31日まであります。");
			break;
			
			case 4,6,9,11:
				System.out.print(month + "月は30日まであります。");
			break;
			
			case 2:
				System.out.print(month + "月は28、または、29日まであります。");
			break;
				
			default:
				System.out.print("error");
			break;
		}
		
	}
}