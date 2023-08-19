public class Practice20
{
    public static void main(String[] args) {
        // int2次元配列型変数arrの宣言と初期化
        int[][] arr = {{11, 22, 33}, {44}, {55, 66}, {77, 88, 99}};
        
        // 配列のすべての要素を順に表示してください
       for(var i = 0; i < arr.length; i++)
       {
    	   for(var j = 0; j <arr[i].length; j++)
    	   {
    		   System.out.print(arr[i][j]);
    	   }
       }
        
        System.out.println();
        
        // 配列のすべての要素を逆から表示してください
        for(var i = (arr.length - 1); i >= 0; i--)
        {
        	for(var j = (arr[i].length - 1); j >= 0; j--)
        	{
        		System.out.print(arr[i][j]);
        	}
        }
       
        
    }
}