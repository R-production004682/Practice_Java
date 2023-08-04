public class Sample_01
{
	/*Java_Practice01*/
	//display, variable, operation
	
	public static void main(String[] ages)
	{
		//Show Display
		
		//1_1================================
		System.out.print("Hello World\n");
		
		//1_2================================
		int x_1_2 = 11;
		System.out.print("X = " + x_1_2 + "\n");
		
		//1_3================================
		int x_1_3 = 13;
		int y_1_3 = 17;
		System.out.print(x_1_3 + "," + y_1_3 + "\n");
		
		//1_4================================
		int x_1_4 = 13 + 17;
		System.out.print(x_1_4 + "\n");
		
		//1_5================================
		System.out.print(13 + 17 + "\n");
		
		//1_6================================
		int x_1_6 = 7;
		
		x_1_6 *= 3;
		System.out.print(x_1_6 + "\n");
		
		x_1_6 /= 2;
		System.out.print(x_1_6 + "\n");
		
		//1_7================================
		int  x_1_7 = 3;
		int  y_1_7 = 7;
		
		int changeValue = x_1_7;
						x_1_7 = y_1_7;
						y_1_7 = changeValue;
		
		System.out.print("x = " + x_1_7 + ", y = " + y_1_7 + "\n") ;
		
		//1_8================================
		int x_1_8 = 19;
		int y_1_8 = 23;
		
		int z_1_8 = x_1_8 * y_1_8;
		System.out.print(z_1_8 + "\n");
		
		
		//1_9================================
		int x_1_9 = 5;
		int twice  = x_1_9 * 2;
		int three  = x_1_9 * 3;
		int  four  = x_1_9 * 4;
			
		System.out.print("Twice =" + twice  + 
								   ",Three =" + three  + 
								   ", Quadruple =" +four + "\n");
		
		//1_10================================
		int x_1_10 = 5;
		int xSecond = x_1_10 * x_1_10;
		int xCubed  = x_1_10 * x_1_10 * x_1_10; 
		
		System.out.print("x = "     + x_1_10   +" ,  ");
		System.out.print("x^2 = " + xSecond +" ,  ");
		System.out.print("x^3 = " + xCubed  +" ,\n");
		
		//1_11=================================
		int x_1_11 = 10;
		int x_1_11_lowValue = 5;
		
		int quotientValue = x_1_11 / x_1_11_lowValue; 
		System.out.print("Quotient = " + quotientValue + "\n");//商
		
		int remainderValue = x_1_11 % x_1_11_lowValue;
		System.out.print("Remainder =" + remainderValue + "\n");//あまり
		
		//1_12==================================
		int x_1_12 = 5;
		
		System.out.print("Increment  = " + x_1_12++ + "\n");
		System.out.print("Decrement = " + x_1_12--);
		
		
	}
}