import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest08
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNumber    = Integer.parseInt(br.readLine());
		
		if(isCheckPrimality(inputNumber)) {System.out.println(inputNumber + " : Yes");}
		else {System.out.println(inputNumber + " : NO");}
		
	}
	
	static boolean isCheckPrimality(int num)
	{
		if(num <= 1)
		{
			return false; 
		}
		
		// 2 から num - 1 までの数で割り切れるかどうかのチェック
		for(var i = 2; i * i <= num; i++)
		{
			if(num % i == 0) {return false;}
		}
		
		return true;
	}
	
	
}