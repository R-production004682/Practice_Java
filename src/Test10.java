import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10
{
	public static void main(String[] arge) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String text	  = "KSU_AP";
		String inputText 	  = br.readLine();
		
		if(text.equals(inputText)) { System.out.println("渡された文字列は　" + inputText + "です。"); }
		else {System.out.print("渡された文字列は　" + text + "ではなく" + inputText + "です。");}
	}
}