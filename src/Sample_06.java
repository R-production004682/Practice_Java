public class Sample_06
{
	//メゾットについて
	//練習問題6-1
//	public static void main(String[] args)
//	{
//		System.out.print("2乗の計算" + A(7));
//	}
//	
//	static int A(int a)
//	{
//		return a * a;
//	}
	
	//練習問題6-2
//	public static void main(String[] args)
//	{
//		System.out.print("アベレージ : " + Avg(5 , 15));
//	}
//	
//	static int Avg(int num1 , int num2)
//	{
//		return((num1 + num2) / 2);
//	}
	
	//練習問題6-3
//	public static void main(String[] args) throws NumberFormatException, IOException
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.printf("値を3つ入力してください");
//		
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		int z = Integer.parseInt(br.readLine());
//
//		System.out.print(Num(x , Num(y , z)));
//	}
//	
//	 static int Num(int num1 , int num2)
//	{	
//		if(num1 <  num2) {return num2;}
//		else 					  {return num1;}		
//	}
	
	
	//練習問題6-4
//	public static void main(String[] ages)
//	{
//		DrawSymbol(3);
//		System.out.println();
//		DrawSymbol(4);
//		System.out.println();
//		DrawSymbol(5);
//		System.out.println();
//	}
//	
//	static void DrawSymbol(int drawCount)
//	{
//		for(var i = 0; i < drawCount; i++) 
//		{
//			for(var j = 0; j <= i ; j++)
//			{
//				System.out.print("$");
//			}
//			System.out.print("\n");
//		}
//	}
	
	//練習問題6-5
//	public static void main(String[] ages) 
//	{
//		 DrawSymbol(3 , "%");
//		 System.out.println();
//		 
//		 DrawSymbol(4 , "&");
//		 System.out.println();
//		 
//		 DrawSymbol(5 , "#");
//		 System.out.println();
//	}
//	
//	static void DrawSymbol(int size , String symbol)
//	{
//		for(var i = 0; i < size; i++)
//		{
//			for(var j = 0; j <= i; j++)
//			{
//				System.out.print(symbol);
//			}
//			System.out.print("\n");
//		}
//	}
	
	//練習問題6-6
//	public static void main(String[] ages)
//	{
//		for(var i = 1; i <= 9; i++)
//			System.out.print(i);
//	}
//	
//	static void Kuku(int num)
//	{
//		for(var i = 1; i <= 9; i++)
//		{
//			System.out.println(num * i);
//		}
//		return num;
//	}
	
	//練習問題6-7
//	public static void main(String[] ages)
//	{
//		for(var i = 10000; i < 10100; i++)
//		{
//			if(PrimeNumber(i)) {System.out.print(i + " ");}
//		}
//	}
//	
//	static boolean PrimeNumber(int num)
//	{
//		if(num <= 3) { return true;}
//		
//		for(var i = 2; i <= (num / 2) ; i++)
//		{
//			if((num % i) == 0) {return false;}
//		}
//		
//		return true;
//	}
	
	//練習問題6-8
	
	public static void main(String[] ages)
	{
		for(var num = 11; num <= 20; num++)
			System.out.print(Fibonacci(num) + " ");
	}
	
	static int Fibonacci(int num)
	{
		if		(num == 0) {return 0;}
		else if(num == 1) {return 1;}
		else {return Fibonacci(num - 2) + Fibonacci(num - 1);}
	}
	
	
	
	
}