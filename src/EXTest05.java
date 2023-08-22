import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest05
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("足す要素の数は何個？");
		int element 	   = Integer.parseInt(br.readLine());
		int totalNumber = 0;
		
		for(var i = 0; i < element; i++)
		{
			int inputNumber = Integer.parseInt(br.readLine());
			totalNumber 	 += inputNumber;
		}
		System.out.print(totalNumber % 100);
		
	}
}