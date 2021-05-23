import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num= sc.nextInt();
	LogicPositiveOrNegative.check(num);
	}
}
	class LogicPositiveOrNegative
	{
		public static void check(int num)
		{

		if (num>=0)
		{
			System.out.println(num +" is Positive Number");
		}
		else
		{ 
			System.out.println(num +" is negative number");
		}
	}
	}