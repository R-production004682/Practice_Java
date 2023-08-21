import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String      input = br.readLine();
		String[] param = input.split(" ");
		
	    int number1 = Integer.parseInt(param[0]);
	    int number2 = Integer.parseInt(param[1]);
		
	   System.out.print(number1 + number2);
	    
	}
}