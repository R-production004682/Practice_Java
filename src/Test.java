import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{
	public static void main(String[] ages) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNumber_User = Integer.parseInt(br.readLine());
		PrimeNumber(inputNumber_User);
		
		int mulNumber = Integer.parseInt(br.readLine());
		System.out.println(Mul(mulNumber));
	}
	
	//素数を出す問題を解いてたのでとりあえずなんか作ってみる
	static void PrimeNumber(int targetCount)
	{
		for(var count = 2; targetCount > 1; count++ )
		{
			while((targetCount % count) == 0)
			{
				System.out.print(count + " , ");
				targetCount /= count;
			}
		}
	}
	
	static int Mul(int mulCount)
	{
		return mulCount * mulCount;
	}
	
	
	
}