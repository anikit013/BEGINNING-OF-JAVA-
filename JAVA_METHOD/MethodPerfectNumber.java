class MethodPerfectNumber 
{
	public static void main(String[] args) 
	{
	     int num=6;
		 perfect(num);
	}
    public static void perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
				System.out.println("Perfect Number");
		}
		else
		{
				System.out.println("Not Perfect Number");
		}
	}
}
