public class Practice02
{
	public static void main(String[] args)
	{
        // みかんの価格を表現するint型の変数を宣言してください。
        // （変数名はおまかせします）
        // みかんの価格変数に130を代入してください。
		int mikanPrice = 130;
	
        // みかんの個数を表現するint型の変数を宣言し、
        // 初期値として6を代入してください。（変数名はおまかせします）
		int mikanCount = 6;
		
        // みかんの総価格を表現するint型の変数を宣言し、
        // 初期値に「みかん価格変数の値×みかん個数変数の値」の演算結果
        // を代入してください。（変数名はおまかせします）
		
		int totalMikanPrice = mikanPrice * mikanCount;
		
        // みかん価格変数の値を出力してください。
        // みかん個数変数の値を出力してください。
        // みかん総価格変数の値を出力してください。

		System.out.println("みかんの価格 : " + mikanPrice);
		System.out.println("みかんの個数 : " + mikanCount);
		System.out.println("未完の総価格 : " + totalMikanPrice);
	}
}