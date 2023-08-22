import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest04
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("掛ける要素いくつ？");
		int element = Integer.parseInt(br.readLine());
		
		int totalNumber = 1;
		
		for(var i = 0; i < element; i++)
		{
			int inputNumber = Integer.parseInt(br.readLine());
			totalNumber *= inputNumber;
		}
		
		System.out.print(totalNumber);
		
	}
}