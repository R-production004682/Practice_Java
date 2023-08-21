public class Test
{
	//ソートアルゴリズムの復習(バブルソート、セレクトソート、インサートソート)
	public static void main(String[] args)
	{
		int[] array = {9,8,5,6,5,4,7,4,1,2,3,4};
		
		//BubleSort(array);
		//SelectSort(array);
		//InsertSort(array);
		
		for(var i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}	
	}
	
	//バブルソート
	/*	static void BubleSort(int[] array)
		{
			for(var i = 0; i < array.length - 1; i++)
			{	
				for(var j = 0; j < array.length - 1; j++)
			{
					//値の入れ替え
					if(array[j] > array[j + 1])
					{
						var changeNumber = array[j + 1];
						array[j + 1] 		   = array[j];
						array[j] 				   = changeNumber;
					}
				}
			}
		}*/
	
/*static void SelectSort(int[] array)
{
	int minIndex;
	
	for(var i = 0; i < array.length - 1; i++)
	{
		minIndex = i;
		
		var minValue = array[minIndex];
		
		for(var j = i ;  j  < array.length - 1; j++)
		{
			//要素の最小を探す
			if(array[j + 1] < minValue)
			{
				minValue = array[j + 1];
				minIndex = j + 1;
			}
		}
		
		if(i != minIndex)
		{
			var changeNumber = array[i];
			array[i] 				   = array[minIndex];
			array[minIndex]    = changeNumber;
		}
	}
}*/
	
	
	//インサートソート
//	static void InsertSort(int[] array)
/*	{
		for(var i = 0; i < array.length; i++)
		{
			var insertNumber = array[i];
			var insertPosition = i;
			
			//右にシフトさせるところ
		for(var j = insertPosition - 1; j >= 0; j--) 
			{				
				if(insertNumber < array[j] )
			{
					array[j + 1] = array[j];
					insertPosition--;
				}
			}
			array[insertPosition] = insertNumber;
		}
	}	*/
}