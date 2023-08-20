import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice24
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
        // アパートに住む住人2次元配列変数
        String[][] apartment = {
                    {"後藤", "矢口", "石川", "吉澤", "藤本"},
                    {"亀井", "小川", "紺野"},
                    {"石川", "安部", "安田", "後藤"},
                    {"石黒", "福田", "後藤"}
                };
        System.out.println("検索する名前を入力してください");
        // 検索するname変数の宣言とキーボード入力値による初期化
        String name = br.readLine();
        // ここからコーディングしてください
        
        int addParson = 0;
        
        for(var i = 0; i < apartment.length; i++)
        {
        	for(var j = 0; j < apartment[i].length; j++)
        	{
        		if(apartment[i][j].equals(name))
        		{
        			addParson++;
        			System.out.println(addParson + "人目の" + name + "さんは、" + (i + 1) + "階の" + (j + 1) + "号室に住んでいます。");
        		}
        	}
        }
        
        if(addParson == 0)
        {
        	System.out.println(name + "さんはこのアパートにはいません");
        }
        
        
    }
}