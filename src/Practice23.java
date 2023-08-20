import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice23
{
    // 正しいパスワード定数
    private static final String PASSWORD = "XYZ";
    public static void main(String[] args) throws IOException 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
        System.out.println("パスワードを入力してください");
        // 入力パスワード変数の宣言と初期化
        String inputPassword = br.readLine();
        // ここからパスワードの一致を調べてください
        
        //文字列同士の比較には、equalsを使う
        if(PASSWORD.equals(inputPassword)) { System.out.println("パスワード一致したよ"); }
        else 												  { System.out.println("パスワード一致しないよ"); }        
        
    }
}