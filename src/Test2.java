public class Test2
{
	public static void main(String[] args)
	{
		for(var i = 1; i <= 10; i++)
		{
			boolean isFizz  = i % 3 == 0;  /*3の倍数*/
			boolean isBuzz = i % 5 == 0; /*5の倍数*/
			
			if(isFizz && isBuzz) {System.out.print("FizzBuzz");}
			else if(isFizz) 		   {System.out.print("Fizz");}
			else if(isBuzz)		   {System.out.print("Buzz");}
			else 					   {System.out.print(i);}
			
			//コンマを置く
			if(i < 10) {System.out.print(" , ");}
		}
	}
}