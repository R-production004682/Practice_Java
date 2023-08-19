public class Practice14
{
	//メゾットについて
    public static void main(String[] args)
    {
        int a = 18;
        int b = 6;
        // calcメソッドの呼び出し
        System.out.println("足し算：" + calc(a, b, 0));
        System.out.println("引き算：" + calc(a, b, 1));
        System.out.println("掛け算：" + calc(a, b, 2));
        System.out.println("割り算：" + calc(a, b, 3));
    }
    
    static int calc(int x , int y , int caseCount)
    {
    	switch(caseCount)
    	{
    	case 0:
    		return x +y;
    		
    	case 1:
    		return x - y;
    		
    	case 2:
    		return x * y;
    		
    	case 3:
    		return x / y;
    		
    		default:
    			break;
    	}
    	
    	return caseCount;
    }
    
}