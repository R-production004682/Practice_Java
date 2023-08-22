import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest07
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("数を入力してください");
		int inputNumber = Integer.parseInt(br.readLine());
		
		System.out.print("Xの倍数を入力してください。");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("Yの倍数を入力してください。");
		int y = Integer.parseInt(br.readLine());
		
		
		int count = 0;
		
		for(var i = 1; i <= inputNumber; i++)
		{
			if(i % x == 0 || i % y == 0)
			{
				count++;
			}
		}
		
		System.out.print("Xの倍数または、Yの倍数は、" + count + " 個あります。");
		
	}
}