public class Practice13
{
	//メゾットについて
	
    public static void main(String[] args) {
        // displayメソッドの呼び出し
        display("テスト", 5);
    }
    
    static void display(String text , int count)
    {
    	for(var i = 0; i < count; i++)
    	{
    		System.out.println(text);
    	}
    }
}