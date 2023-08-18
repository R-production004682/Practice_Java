import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Practice01 {
    public static void main(String[] args) throws Exception 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String 	input	  = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
		
        //足し算
//        int num1 = Integer.parseInt(param[0]);
//        int num2 = Integer.parseInt(param[1]);
//        
//        System.out.println(num1 + num2);
        
        
        //四則演算
//        int    num1 = Integer.parseInt(param[0]);
//        String type = param[1];
//        int    num2 = Integer.parseInt(param[2]);
//        
//        if     (type.equals("+")) {System.out.println(num1 + num2);}
//        else if(type.equals("-")) {System.out.println(num1 - num2);}
//        else if(type.equals("*")) {System.out.println(num1 * num2);}
//        else if(type.equals("/")) {System.out.println("商" + num1  / num2 + "......余り : " + num1 % num2);}
        
        //四則演算-別解-
//        int num1 = Integer.parseInt(param[0]);
//        String type = param[1];
//        int num2 = Integer.parseInt(param[2]);
//        
//        switch(type)
//        {
//	        case "+":
//	        	System.out.println(num1 + num2);
//	        break;
//	        	
//	        case "-":
//	        	System.out.println(num1 - num2);
//	        break;
//	        	
//	        case "*":
//	        	System.out.println(num1 * num2);
//	        break;
//	        	
//	        case "/":
//	        	System.out.println("商" + num1 / num2 + ".......余り : " + num1 % num2);
//	        break;
//        	
//        	default:
//        		return;
//        }
        
        
        //繰り返し
//        String type = null;
//        int      sum = 0;
//        
//        for(int index = 0; index < param.length; index++)
//        {
//        	if(param[index].equals("+") || param[index].equals("-")) 
//        	{
//        		type = param[index]; 
//        	}
//        	else
//        	{
//        		int num = Integer.parseInt(param[index]);
//        		
//        		if(type != null) 
//        		{
//        			if      (type.equals("+")){sum += num;}
//        			else if(type.equals("-")) {sum  -= num;}
//        		}
//        		else{sum   = num;}
//        	}
//        }
//        System.out.println(sum);      
    }
}