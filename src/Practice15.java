public class Practice15
{
	
	//最小値
	public static void main(String[] arge)
	{
        int x = 88;
        int y = 79;
        int z = 96;
        
        // minメソッドの呼び出し
        System.out.println("整数" + x + "、" + y + "、" + z + "の中で最小の値は");
        System.out.println(min(x, y, z) + "です。");
	}
	
	static int min(int x , int y , int z) 
	{
		var minValue = x;
		
		if(minValue > y) {minValue = y;}
		if(minValue > z) {minValue = z;}
		
		return minValue;
	}
	
	
}