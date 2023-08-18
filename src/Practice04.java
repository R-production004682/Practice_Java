public class Practice04
{
	public static void main(String[] args)
	{
        // short型の変数 s1 を宣言し、65 を代入してください。
        // s1 の値を出力してください。
		
		short s1 = 65;
		System.out.println(s1);
		
        // byte型の変数 b を宣言し、変数 s1 の値を代入してください。
        // b の値を出力してください。
		
		byte b = (byte) s1;
		System.out.println(b);
		
        // char型の変数 c を宣言し、変数 b の値を代入してください。
        // c の値を出力してください。
		
		char c = (char) b;
		System.out.println(c);
		
        // short型の変数 s2 を宣言し、変数 s1 と b を足した値を代入してください。
        // s2 の値を出力してください。
		
		short s2 = (short)(s1 + b);
		System.out.println(s2);
	}
}