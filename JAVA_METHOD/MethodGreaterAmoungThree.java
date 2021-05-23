class  MethodGreaterAmoungThree
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=60;
		int num3=30;
		check(num1,num2,num3);
	}
	public static void check(int num1, int num2, int num3)
	{
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1 +" is greater");
		}
		if (num2>num1 && num2>num3)
		{
			System.out.println(num2 +" is greater");
		}
		else
		{
			System.out.println(num3 + " is greater");
		}
}
}
