import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXTest01
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int apple = 5;
		System.out.println("リンゴは " + apple + "個です。");
		
		System.out.println("みかんは何個買いますか？");
		int mikan = Integer.parseInt(br.readLine());
		
		
		int resultCount = apple + mikan;
		System.out.print("合計個数は、" + resultCount + "個です。");
		
		
	}
}