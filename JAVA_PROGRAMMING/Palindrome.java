class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=415674;
		int temp=num;
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (rev==temp)
		{
		System.out.println("It is palindrome");
	}
	else
		{
		System.out.println("It is not a palindrome");

		}
	}
}

