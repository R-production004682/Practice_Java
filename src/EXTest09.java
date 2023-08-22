import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//約数
public class EXTest09
{
	public static void main(String[] arge) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine());
		
		divisor(inputNum);
	}
	
	static void divisor(int num)
	{
		for(var i = 1; i <= num; i++)
		{
			if((num % i) == 0)
			{
				System.out.println(i);
			}
		}
	}
	
}