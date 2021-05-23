class MethodFactor 
{
	public static void main(String[] args) 
	{
	     int num=6;
		 factor(num);
	}
	public static void factor(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
					System.out.println(i);
			}
		}
	}
}
