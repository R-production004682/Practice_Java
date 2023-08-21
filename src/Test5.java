import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("何月？==>");
		int month = Integer.parseInt(br.readLine());
		
		System.out.print("何日？==>");
		int days = Integer.parseInt(br.readLine());
		
		if(month == 8 && days == 21) { System.out.print("正解！！"); }
		else {System.out.print("間違っています");}
		
		
	}
}