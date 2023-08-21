import java.text.DecimalFormat;

public class Test3
{
	public static void main(String[] arge)
	{
		int[][] mul = new int[9][9];
		
		for(var i = 0; i < mul.length; i++)
		{
			for(int j = 0; j <mul[i].length; j++ )
			{
				mul[i][j] = (i + 1) * (j + 1);
			}
		}
		
		DecimalFormat df = new DecimalFormat("00");
		
		for(var i = 0; i < mul.length; i++)
		{
			System.out.print("| " + (i + 1) + "|");
			
			for(var j = 0; j < mul[i].length; j++)
			{
				System.out.print("  " + df.format(mul[i][j]));
			}
			
			System.out.println("|");
		}
	}
}