class PerfectNumber
{
	public static void main(String[] args) 
	{
		int num=143;
		int count=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				count=count+i;
			}

		}		
		
		
		
		
		if (count==num)
			{
			System.out.println(num + "is perfect number");
			}
			else
			{
				System.out.println(num +" is not perfect number");
			}
	}
}
