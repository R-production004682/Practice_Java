public class Practice09
{
	public static void main(String[] arge)
	{
		for(var number = 21; number <= 29; number++ )
		{
			for(var i = 3; i < 9; i++)
			{
				if((number % i) == 0)
				{
					System.out.print(number + "は" + i + "の倍数です。\n");
				}
			}
		}
	}
}