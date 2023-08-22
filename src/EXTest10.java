import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest10
{
	public static void main(String[] arge) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		primeFactorization(num);
	}
	
	static void primeFactorization(int num)
	{
		for(var i = 2; i < num; i++)
		{
			while(num % i == 0)
			{
				System.out.print(i + " ");
				num /= i;
				
				if(num > 1) {System.out.print(" ");}
			}
		}
	}
	
}