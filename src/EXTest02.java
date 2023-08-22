import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest02
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int resultNumber = 0;
		int inputCount 	= 1;
		
		boolean isCounter = true;
		
		while(isCounter)
		{
			int inputNumber = Integer.parseInt(br.readLine());
			resultNumber  += inputNumber;
			
			//三回入力されたら処理を抜ける
			if(inputCount == 3)  { isCounter = false; }
			
			inputCount++;
		}
		
		System.out.print(resultNumber);
		
	}
}