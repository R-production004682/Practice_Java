import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest03
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("足す要素いくつ？");
		int elements = Integer.parseInt(br.readLine());
		
		int total = 0;
		
		for(var i = 0; i < elements; i++)
		{
			int inputNumber = Integer.parseInt(br.readLine());
			total += inputNumber;
		}
		
		System.out.print(total);
		
	}
}