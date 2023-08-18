import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Practice01 {
    public static void main(String[] args) throws Exception 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String 	input	  = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        
        int sum = calc(param,0 , param.length - 1);
        System.out.print(sum);
        
    }
    
    public static int calc(String[] param , int startIndex , int endIndex)
    {
    	int sum = 0;
    	String type = null;
    	
    	for(var index = 0; index < endIndex + 1; index++)
    	{
    		if(param[index].equals("+") || param[index].equals("-"))
    		{
    			type = param[index];//+か-だった時に、typeに格納しとく
    		}
    		else if(param[index].equals("("))
    		{
    			int endOfSymbol = CheckEndOfSymbol(param , index);
    			
    			if(type != null) 
    			{
    				if(type.equals("+")) {
    					sum += calc(param , index + 1 , endOfSymbol - 1);
    				}
    				else if(type.equals("-"))
    				{
    					sum -= calc(param , index + 1 , endOfSymbol - 1);
    				}
    			}
    			else
    			{
    				sum = calc(param , index + 1 , endOfSymbol - 1);
    			}
    			
    			index = endOfSymbol;
    		}
    		else
    		{
    			int num = Integer.parseInt(param[index]);
    			
    			if(type != null) 
    			{
    				if(type.equals("+"))      {sum += num;}
    				else if(type.equals("-")) {sum -= num;}
    			}
    			else
    			{
    				sum = num;
    			}
    		}
    	}
    	
    	return sum;
    }
    
    //『』の終わりを見つけるとこ
    public static int CheckEndOfSymbol(String[] param , int startIndex)
    {
    	int end = startIndex + 1;
    	int startCount = 0;
    	
    	for(var index= 0; index < param.length; index++)
    	{
    		end = index;
    		
    		if(param[index].equals("(")) { startCount++; }
    		else if(param[index].equals(")")) 
    		{
    			if(startCount == 0) {break;}
    			else 			  {startCount --;}
    		}
    	}
    	return end;
    }
}