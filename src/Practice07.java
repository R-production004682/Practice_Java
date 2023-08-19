public class Practice07
{
	//BMI測定
	public static void main(String[] arge)
	{
		double height = 160.;
		double weight =  55.;
		
		var bmi = weight / (height / 100 * height /100);
		
		System.out.print("身長 : " + height  + "cm\n");
		System.out.print("体重 : " + weight + "Kg\n");
		System.out.print("あなたのBMI値は" + Math.floor(bmi) + "です。\n");
		
		if		(26.5 <= bmi) 				     { System.out.print("肥満"); }
		else if(24 <= bmi && bmi < 25.5 ) { System.out.print("太り気味"); }
		else if(20 <= bmi && bmi < 24)    { System.out.print("普通"); }
		else if(0   <= bmi && bmi < 20)    { System.out.print("痩せ気味"); }
		else 											 { System.out.print("error"); }
		
		
				
	}
}