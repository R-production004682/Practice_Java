import java.util.Random;

public class Test11
{
	public static void main(String[] arge)
	{
		final int baseSelectionNumber  = 1000;
		final int baseMinimumNumber  = 0;
		final int randomSelectNumbers = 100;
		
		
		int[] randomNumbers = new int[randomSelectNumbers];
		int			 maxNumber = Integer.MIN_VALUE;
		int 		 minNumber  = Integer.MAX_VALUE;
		int 	       summation = 0;
		
		Random rand = new Random();

		for(var i = 0; i < randomSelectNumbers; i++)
		{
			/* 0 以上 1000未満の乱数の取得設定 */
			randomNumbers[i] = rand.nextInt(baseSelectionNumber) + baseMinimumNumber;
			
			/*合計値、最大値、最小値の取得*/
			summation += randomNumbers[i];
			maxNumber =  randomNumbers[0];
			minNumber  =  randomNumbers[0];
			
			//なんか求まらない
//			maxNumber = Math.max(maxNumber, randomNumbers[i]);
//			minNumber = Math.min(minNumber, randomNumbers[i]);
//			
//			//最大値
//			if(maxNumber < randomNumbers[i]) { 	maxNumber = randomNumbers[i]; }
//			
//			//最小値
//			if(randomNumbers[i] < minNumber) { minNumber = randomNumbers[i]; }
			
		}
		
		double average = (double) (summation / randomSelectNumbers);
		
		System.out.println("合計: " + summation + " 最大値: " + maxNumber + " 最小値: " + minNumber + " 平均: " + average);
		
		System.out.print("\n取得した乱数一覧。\n");
		for(var i = 0; i < randomSelectNumbers; i++)
		{
			System.out.print(randomNumbers[i] + " ");
			
			if( (i + 1)  % 10 == 0 ) { System.out.println(); }//10回表示されたら改行する。
		}
		
	}
}