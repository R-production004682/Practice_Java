public class Practice11
{
	public static void main(String[] arge)
	{
		//これか、
		int level = 5;		
		
		for(var i = 0; i < level; i++)
		{
			for(var j = 0; j < level + i; j++)
			{
				if  (j < level - i - 1)     {System.out.print("□");}
				else 					        {System.out.print("■");}
			}
			System.out.println();
		}
		
		//これ。俺は上派
//		int level = 5;
//		
//		for(var i = 0; i < level; i++)
//		{
//			for(var j = 0; j < level - i - 1; j++) {System.out.print("□");}
//			for(var j = 0; j < (i * 2) + 1; j++) {System.out.print("■");}
//			
//			System.out.println();
//		}
		
	}
}