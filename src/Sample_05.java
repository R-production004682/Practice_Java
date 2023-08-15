import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//配列について
public class Sample_05
{
	public static void main(String[] ages) throws IOException
	{
		//練習問題5-1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] nums = new int[10] ;
//		
//		for(var i = 0; i < nums.length; i++)
//		{
//			nums[i] = Integer.parseInt(br.readLine());
//			System.out.print("");
//		}
//		for(var i = 0; i < nums.length; i++)
//		{
//			System.out.print(nums[i] * 2);
//			System.out.print("\n");
//		}
		
		//練習問題5-2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] nums = new int[10];
//		
//		for(var i = 0; i < nums.length; i++)
//		{
//			nums[i] = Integer.parseInt(br.readLine());
//		}
//		for(var i = 9; i >= 0; i-- )
//		{
//			System.out.print(nums[i]);
//		}
		
		//練習問題5-3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	int[] nums = new int[10];
//    	
//    	for(var i = 0; i < nums.length; i++)
//    	{
//    		nums[i] = Integer.parseInt(br.readLine());
//    		
//    		System.out.print("\n偶数 : ");
//    		for(var n : nums) 
//    		{
//    			if((n % 2 ) == 0) {System.out.print(n + " "); }
//    		}
//    		
//    		System.out.print("\n奇数 : ");
//    		for(var n : nums)
//    		{
//    			if((n % 2) != 0) {System.out.print(n + " ");}
//    		}
//    	}  	
		
		//練習問題5-4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[] nums = new int[10];
//		int cnt , sum;
//		
//		for(cnt = 0 , sum = 0 ; cnt < 10 && sum <= 100 ; cnt++)
//		{
//			nums[cnt] = Integer.parseInt(br.readLine());
//			sum += nums[cnt];
//		}
//		for(var i = 0; i < cnt; i++) { System.out.print("\n" + nums[i]); }
		
		//練習問題5-5
//		BufferedReader br = new BufferedReader(
//        new InputStreamReader( System.in ) );
//		int value = Integer.parseInt( br.readLine() );
//
//		int binary[] = new int[16];
//
//		//配列 binaryに0か1を代入する
//		for( int i = 15 ; i >= 0 ; i--, value /= 2 )
//		    binary[i] = value % 2;
//
//		for( int i = 0 ; i < 16 ; i++ )
//		System.out.print( binary[i] ); 
		
		
		//練習問題5-6
//		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//		int kuku[][] = new int[9][];

		//配列 kuku に値を代入する
		
//		for(var i = 0; i < 9; i++)
//		{
//			kuku[i] = new int[9];
//			
//			for(var j = 0; j < 9; j++)
//			{
//				kuku[i][j] = (i + 1) * (j + 1);
//			}
//		}
//		
//		for( int i = 0 ; i < 9 ; i++ )
//		{
//			for( int j = 0 ; j < 9 ; j++ ) 
//			{
//				System.out.printf( " %2d", kuku[i][j] );
//			}
//			
//			System.out.println();
//		}
		
		//練習問題5-7
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int kuku[][] = new int[9][9];
//		
//		for(var i = 0; i < 9; i++) 
//			for(var j = 0; j < 9; j++)
//			{
//				kuku[i][j] = (i + 1) * (j + 1);
//			}
//			
//		var num1 = Integer.parseInt(br.readLine());
//		var num2 = Integer.parseInt(br.readLine());
//		
//		System.out.print(kuku[num1 - 1][num2 - 1]);
		
		//練習問題5-8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[10];
		
		for(var i = 0; i < 10; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		for(var i = 0; i < 10; i++)
		{
			for(var j = i + 1; j < 10; j++)
			{
				if(nums[i] > nums[j])
				{
					int returnI = nums[i];
					   nums[i] = nums[j];
					   nums[j] = returnI;
				}
			}
		}
		
		for(int i = 0; i < 10; i++)
			System.out.print(nums[i] + " ");
		
	}  	
}