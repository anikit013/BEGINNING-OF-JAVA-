class Calculator
{ 
	public static void main(String[] args) 
	{
		int num1=12;
		int num2=13;
		int  choice=1;
		switch(choice)
		{
		case 1: System.out.println("Addition of num1 and num2 is"+(num1+num2));
		break;
		case 2: System.out.println("Difference of num1 and num2 is"+(num1-num2));
		break;
		case 3: System.out.println("Multipliction of num1 and num2 is"+(num1*num2));
		break;
		case 4: System.out.println("Division of num1 and num2 is"+(num1/num2));
		break;
		case 5: System.out.println("Modulous of num1 and num2 is"+(num1%num2));
		break;
		default: System.out.println("Invalid Choice");	
	
		
		}	
		
	}
}
