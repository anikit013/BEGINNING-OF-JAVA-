class Factorial 
{
	public static void main(String[] args) 
	{
		int num=3;
		int temp=num;
		int fact=1;
		while (num>=1)
		{
			fact=fact*num;
			num--;

		}
			System.out.println("Factorial of "+ temp +" is =" + fact); 
		}
}
