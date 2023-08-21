import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input      = br.readLine();
        String[] param = input.split(" ");
        String type 	  = null;
		
		int number1 = Integer.parseInt(br.readLine());
		
		for(var index = 0; index < param.length; index++)
		{
			if(param[index].equals("+") || param[index].equals("-"))
			{
				type = param[index];
			}
			else
			{
				int num = Integer.parseInt(param[index]);
				
				if(type != null)
				{
					if(type.equals("+"))      {number1 += num;}
					else if(type.equals("-")) {number1 -=  num;}
				}
				else
				{
					number1 = num;
				}
			}
		}
		System.out.println(number1);
	}
}