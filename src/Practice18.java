public class Practice18
{
	public static void main(String[] args)
	{
        int[] arr = {43 , 2, 765, 234, 908, 115, 32,
		                476, 938, 65, 93, 47, 102 , 735,
		                529, 1010, 639, 660, 182, 908};
    // maxメソッドの呼び出し
    System.out.println("配列の最大値：" + max(arr));

	}
	
	static int max(int[] array)
	{
		int maxNumber = 0;
		
		for(var i = 0; i < array.length; i++)
		{
			if(maxNumber < array[i]) { maxNumber = array[i]; }
		}
		
		return maxNumber;
	}
	
}