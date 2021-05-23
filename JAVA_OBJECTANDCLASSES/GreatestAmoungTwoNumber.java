import java.util.Scanner;

	class GreatestAmoungTwoNumber
	{
		public static void main(String[] args)
		{ 
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a first number");
			int num1= sc.nextInt();
			System.out.println("Enter second number");
			int num2= sc.nextInt();
			LogicGreatestAmoungTwoNumber.check(num1,num2);
			}
	}
	class LogicGreatestAmoungTwoNumber
	{
		public static void check(int num1, int num2)
		{
			if (num1>num2)
			{
				System.out.println(num1+" is greater then"+ num2);
			}
			else
			{ 
				System.out.println(num2+" is greater then"+ num1);
				}
		}
	}
