import java.util.Scanner;

	class EvenOrOdd
	{
		public static void main(String[] args)
		{ 
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number");
			int num= sc.nextInt();
				LogicEvenOrOdd.check(num);
			}
	}
	class LogicEvenOrOdd
	{
		public static void check(int num)
		{
			if (num%2==0)
			{
				System.out.println(num+"is even");
			}
			else
			{ 
				System.out.println(num +" is odd");
				}
		}
	}
