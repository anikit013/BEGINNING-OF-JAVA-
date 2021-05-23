import java.util.Scanner;
class Calcualtor 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Calculator");
		System.out.println("Enter 1st Digit");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Digit");
		int num2 = sc.nextInt();
		System.out.println("Enter your choice \n 1.Addition\n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Remainder\n");
		int choice= sc.nextInt();
		System.out.println("................");
	
		switch(choice)
		{
			case 1:
				System.out.println(num1+num2);
			break;
			case 2:
				System.out.println(num1-num2);
			break;
			case 3: 
				System.out.println(num1*num2);
			break;
			case 4:
				System.out.println(num1/num2);
			break;
			case 5 :
				System.out.println(num1%num2);
			break;
			default : 
				System.out.println("Invalid data");
			}
}
}

