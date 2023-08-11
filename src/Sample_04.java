import java.io.IOException;

public class Sample_04
{
	public static void main(String[] ages) throws IOException
	{
		//練習問題4-1
//		String ward = "SPAM";
//		for(var i = 1; i <= 10; i++ ) {System.out.print(i + "回目 : " + ward + "\n");}
		
		//練習問題4-2
//		int number = 3;
//		for(var i = 1; i <= 9; i++)
//		{
//			var total = number * i;
//			System.out.print(total + "\n");
//		}
		
		//練習問題4-3
//		int number = 1;
//		for(var i = 1; i <= 8; i++) 
//		{
//			number *= 2;
//			System.out.print(number + "\n");
//		}
		
		//練習問題4-4
//		int number = 1;
//		for(var i = 2; i <= 7; i++)
//		{
//			number *= i;
//		}
//		System.out.print(number + "\n");
		
		//練習問題4-5
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int win = 0;
//		int low = 0;
//		
//		System.out.print("0か1を入力してください。\n");
//		
//		for(var i = 1; i <= 10; i++)
//		{
//			int number = Integer.parseInt(br.readLine());
//			
//			if(number == 1) 
//			{
//				System.out.print("勝ち\n");
//				win++;
//			}
//			else if(number == 0)
//			{
//				System.out.print("負け\n");
//				low++;
//			}
//		}
//		System.out.print("勝った数 : " + win + "\n");
//		System.out.print("負けた数 : " + low);
		
		//練習問題4-7
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int win_A  = 0;
//		int win_B  = 0;
//		
//		for(var i = 1; i <= 9; i++)
//		{
//			System.out.print(i + "回表、" + "TeamAの得点は？");
//			int teamA_Score = Integer.parseInt(br.readLine());
//			
//			System.out.print(i + "回裏、" + "TeamBの得点は？");
//			int teamB_Score = Integer.parseInt(br.readLine());
//			
//			//1が入力された場合加算処理
//			if (teamA_Score == 1) { win_A++;}		
//			if (teamB_Score == 1) { win_B++;}
//			
//		}
//		
//		System.out.print("TeamA : " + win_A + "点\n");
//		System.out.print("TeamB : " + win_B + "点\n");
//		
//		//勝敗判定
//		if		 (win_A == win_B) {System.out.print("引き分け ");}
//		else if(win_A < win_B)    {System.out.print("TeamBの勝ち ");}
//		else							 	 {System.out.print("TeamAの勝ち ");}
		
		
		//練習問題4-8
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int maxNum = 0;//最大値を格納する変数
//		
//		for(var i = 1; i <= 10; i++)
//		{
//			try 
//			{
//				int naturalNumber = Integer.parseInt(br.readLine());
//				if(maxNum < naturalNumber) {maxNum = naturalNumber; } 
//			
//			}
//			catch(NumberFormatException error)
//			{
//				System.out.print("正しい数値で入力してください。");
//				i--;//入力を取り消す。
//			}
//		}
//		
//		System.out.print("最大値は : " + maxNum);
//		
//		br.close();
		
		
//		//練習問題4-9
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for(var i = 1; i <= 10; i++)
//		{
//				try
//				{
//						int inputNumber = Integer.parseInt(br.readLine());
//						
//						//最大値
//						if(max < inputNumber) {max = inputNumber; }
//						
//						//最小値
//						if(inputNumber < min)   {min = inputNumber;}
//				}
//				catch(NumberFormatException e)
//				{
//						System.out.print("適切な数字を入れてください。");
//						i--;
//				}
//		}
//		
//		System.out.print("最大値 : " +  max);
//		System.out.print("最小値 : " +  min);
		
		//練習問題4-10
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(br.readLine());
//		
//		for(var i = 1; i <= count; i++) {System.out.print("*");}
		
		//練習問題4-11
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(br.readLine()); 
//		int out 	  = 0;
//		
//		for(int i = 0; i < count ; i++)
//		{
//			System.out.print(out++ + ",");
//			if(out > 9) {out = 0;}
//		}
		
		
		//練習問題4-12
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int number = 0;
//		
//		while(number <= 100) 
//		{
//			number += Integer.parseInt(br.readLine());
//			System.out.print("合計は、" + number);
//		}
		
		//練習問題4-13
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int strike = 0;
//		int    ball = 0;
//		
//		while(strike < 3 && ball < 4)
//		{
//			System.out.print("ストライク = 1 or ボール = 2 \n");
//			int score = Integer.parseInt(br.readLine());
//			
//			if(score == 1)
//			{
//				strike++;
//			}
//			else if(score == 2)
//			{
//				ball++;
//			}
//		}
//		System.out.print(strike + "ストライク , " + ball + "ボール");
//		
//		br.close();
		
		
		//練習問題4-14
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int strike = 0;
//		int    ball = 0;
//		
//		while(strike < 3 && ball < 4)
//		{
//			System.out.print("ストライク = 1 or ボール = 2 \n");
//			int score = Integer.parseInt(br.readLine());
//			
//			if		(score == 1) 					   {strike++;}
//			else if(score == 2) 					   {ball++;   }
//			else if(score == 3 && strike < 2) {strike++;}
//			
//		}
//		System.out.print(strike + "ストライク , " + ball + "ボール");
//		
//		br.close();
		
		//練習問題4-15 : 明日はここからやる
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	    int number = Integer.parseInt(br.readLine());
//		int n;
//		
//		//素数かどうかの判定
//		for(n = 2; n <= (number / 2); n++ )
//		{
//				if((number % n) == 0) {break;}
//		}
//		
//		if(n > (number / 2)) {System.out.print(number + "は素数です。")      ;}
//		else 						  {System.out.print(number + "は素数じゃない。");}
		
		//練習問題4-16
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int inputNum = Integer.parseInt(br.readLine());
//		
//		//素数の計算過程を表示
//		for(var n = 2; inputNum > 1; n++)
//		{
//			while((inputNum % n) == 0)
//			{
//				System.out.print(n + " , ");
//				inputNum /= n;
//			}
//	    }
		
		//練習問題4-17
		
//		九九
//		for(var i = 1; i <= 9; i++)
//		{
//			for(var j = 1; j <= 9; j++)
//			{
//				System.out.printf("%2d", i * j);
//			}
//			System.out.print("\n");
//		}
		
		//練習問題4-18
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = 0;
//		
//		for( ; ;)
//		{
//			var value = Integer.parseInt(br.readLine());
//			if(value == 0) {break;}
//			
//			num += value;
//		}
//		
//		System.out.print("入力した総和 : " + num);
		
		//練習問題4-19
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = 0;
//		int counter = 0;
//		
//		for( ; ;)
//		{
//			var value = Integer.parseInt(br.readLine());
//			if(value == 0) {break;}
//			
//			num += value;
//			
//			counter++;
//		}
//		
//		System.out.print("経過ターン : " + counter);
//		
//		System.out.print("入力した総和 : " + (num / counter));
		
		
		
		//練習問題4-20
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int size = Integer.parseInt(br.readLine());
//		
//		final String symbol = "$";
//		
//		for(var i = 0; i < size; i++)
//		{
//			for(var j = 0; j <=  i; j++) {System.out.print(symbol);}
//			
//			System.out.print("\n");
//		}
		
		//練習問題4-21
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int size = Integer.parseInt(br.readLine());
//		final String symbol = "X";
//		
//		for(var i = 0; i < size; i++)
//		{
//			for(var j = 0; j <= size;  j++) 
//			{
//				if(i == j || (size - i -1) == j) {System.out.print("X");}
//				else									 {System.out.print(" ");}
//			}
//			
//			System.out.print("\n");
//		}
		
//		//練習問題4-22
//		//フィボナッチ数列
//		var number1 = 0;
//		var number2 = 1;
//		var number3 = number1 + number2;
//		
//		while(number1 <= 1000)
//		{
//			System.out.print(number1 + " , ");
//			
//			number1 = number2;
//			number2 = number3;
//			number3 = number1 + number2;
//		}
		
	}
}