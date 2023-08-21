import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number1 = Integer.parseInt(br.readLine());
		int number2 = Integer.parseInt(br.readLine());
		
		System.out.println(number1 + number2);/* 足し算 */
		System.out.println(number1 - number2); /* 引き算 */
		System.out.println(number1 * number2); /* 掛け算 */
		System.out.println(number1 / number2 + ",,,,余り : " + number1 % number2); /* 割り算 */
	}
}