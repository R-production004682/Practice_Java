import java.util.ArrayList;
import java.util.List;

public class EXTest11
{
	public static void main(String[] arge)
	{
				List<String> format = new ArrayList<String>();
				
				format.add("ABCDEFG");
				format.add("1234567890");
				format.add("あいうえお");
				format.add("ＡＢＣＤＥＦＧ");
				format.add("１２３４５６７８９０");
				
				
				for(var i = format.size() - 1; i >= 0; i--)
				{
					String line = format.get(i);
					System.out.println(line);
				}
				
				 int index = format.indexOf("あいうえお");
		 if(index != 0){
		     System.out.println((index + 1) + "行目");
		 }
	}
}