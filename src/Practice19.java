public class Practice19
{
//    public static void main(String[] args) 
//    {
//        int[] arr   = {13,  90, 10, 79, 101, 25, 123, 38, 5, 16, 64, 55, 17};
//        int[] arr2 = {38, 118, 26, 17, 41, 53, 10, 88, 92, 102, 67, 22, 55};
//        
//        System.out.println("共通する数値の個数：" + common(arr, arr2));
//    }
//    
//    static int common(int[] x , int[] y)
//    {
//    	int commonNumber = 0;
//    	
//    	for(var i = 0; i < x.length; i++)
//    	{
//    		for(var j = 0; j < y.length; j++)
//    		{
//    			if(x[i] == y[j]) { commonNumber++; }
//    		}
//    	}
//    	
//    	return commonNumber;
//    }
	
	
	public static void main(String[] args) 
	{
	    int[] arr   = {13,  90, 10, 79, 101, 25, 123, 38, 5, 16, 64, 55, 17};
	    int[] arr2 = {38, 118, 26, 17, 41, 53, 10, 88, 92, 102, 67, 22, 55};
	    
	    int[] commonElements = common(arr, arr2);
	    System.out.println("共通する数値の要素：");
	    for (int element : commonElements) {
	        System.out.println(element);
	    }
	}

	static int[] common(int[] x , int[] y)
	{
	    int[] commonElements;
	    int commonCount = 0;
	    
	    for (var i = 0; i < x.length; i++)
	    {
	        for (var j = 0; j < y.length; j++)
	        {
	            if (x[i] == y[j]) { commonCount++; }
	        }
	    }
	    
	    commonElements = new int[commonCount];
	    commonCount = 0;
	    
	    for (var i = 0; i < x.length; i++)
	    {
	        for (var j = 0; j < y.length; j++)
	        {
	            if (x[i] == y[j]) {
	                commonElements[commonCount] = x[i];
	                commonCount++;
	            }
	        }
	    }
	    return commonElements;
	}
    
}