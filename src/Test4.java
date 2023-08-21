import static java.lang.Math.floor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4
{
	public static void main(String[] arge) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("何人のデータを入力しますか？");
		int inputParson = Integer.parseInt(br.readLine());
		
		double total = 0;
		
		System.out.print("年齢を入力してください。");
		for(var i = 0; i < inputParson; i++)
		{
			int age = Integer.parseInt(br.readLine());
			System.out.print(age + "歳");
			
			 total += age;
		}
		
		System.out.print("平均は : " + floor(total / inputParson) + "　です");
		
	}
}