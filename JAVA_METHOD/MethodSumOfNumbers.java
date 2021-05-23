class MethodSumOfNumbers 
{
	public static void main(String[] args) 
	{
		int num=99;
		summ(num);

	}
	public static void summ(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is:" +sum);
	}
}
