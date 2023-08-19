public class Practice17
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("配列の合計値：" + sum(arr));
    }
   
    static int sum(int[] array)
    {
    	int result = 0;
    	
    	for(var i = 0; i < array.length; i++)
    	{
    		result += array[i];
    	}
    	return result;
    }
}