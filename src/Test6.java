import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text = "EXIT";
		
		for( ; ; )
		{
			String inputText = br.readLine();
			
			if(text.equals(inputText))
			{
				System.out.print(text);
				return;
			}
		}
		
	}
}