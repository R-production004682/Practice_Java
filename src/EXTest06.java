import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest06
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = Integer.parseInt(br.readLine());
		
		System.out.print( 2 * inputNumber + 3);
		
	}
}