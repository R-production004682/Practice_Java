import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class EXTest12
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] prices = new int[501];//0~500
		
		for(var i = 1; i <= N; i++)
		{
			int price = Integer.parseInt(br.readLine());
			prices[price]++;
		}
		
		int count = 0;
		
		for(int price = 0; price <= 250; price++)
		{
			if(prices[price] > 0 && prices[500 - price] > 0)
			{
				if(price == 500 - price)
				{
					count += prices[price] * (prices[price] - 1) / 2;
				}
				else
				{
					count += prices[price] * (prices[500 - price]);
				}
			}
		}
		System.out.print(count);
	}
}