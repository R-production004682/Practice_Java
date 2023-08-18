import java.math.BigInteger;

public class Test
{
//	public static void main(String[] ages) throws NumberFormatException, IOException
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int inputNumber_User = Integer.parseInt(br.readLine());
//		PrimeNumber(inputNumber_User);
//		
//		int mulNumber = Integer.parseInt(br.readLine());
//		System.out.println(Mul(mulNumber));
//	}
//	
//	//素数を出す問題を解いてたのでとりあえずなんか作ってみる
//	static void PrimeNumber(int targetCount)
//	{
//		for(var count = 2; targetCount > 1; count++ )
//		{
//			while((targetCount % count) == 0)
//			{
//				System.out.print(count + " , ");
//				targetCount /= count;
//			}
//		}
//	}
//	
//	static int Mul(int mulCount)
//	{
//		return mulCount * mulCount;
//	}
	
	//確率の問題が何回も出てきてうっとうしかったので、書いた奴。
	//さいころの問題キラーEX
	public static void main(String[] ages)
	{
		int totalPossibilities = 0;
        int validPossibilities = 0;

        for (int dice1 = 1; dice1 <= 6; dice1++) {
            for (int dice2 = 1; dice2 <= 6; dice2++) {
                totalPossibilities++;
                int sum = dice1 * dice2;
                if (sum % 3 == 0) {
                    validPossibilities++;
                }
            }
        }

        int gcd = gcd(validPossibilities, totalPossibilities);
        int simplifiedValidPossibilities = validPossibilities / gcd;
        int simplifiedTotalPossibilities = totalPossibilities / gcd;

        System.out.println("Probability: " + simplifiedValidPossibilities + "/" + simplifiedTotalPossibilities);
    }

    // 最大公約数を求めるメソッド
    private static int gcd(int a, int b) {
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        return bigA.gcd(bigB).intValue();
    }
}