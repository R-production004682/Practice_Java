public class Algorithm_01
{
	//挿入ソート
	public static void main(String[] args)
	{
		int[] array = {2,3,5,4,1};
		InsertSort(array);
		
		for(var i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
	
	static void InsertSort(int[] array)
	{
		for(var i = 0; i < array.length; i++)
		{
			var insertNumber = array[i];
			var insetPosition = i;
			
			for(var j = insetPosition - 1; j >= 0; j--)
			{
				//右にシフトさせる
				if(insertNumber < array[j])
				{
					array[j + 1] = array[j];
					insetPosition--;
				}
			}
			
			array[insetPosition] = insertNumber;
		}
	}
}