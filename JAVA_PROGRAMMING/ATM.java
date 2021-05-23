class ATM 
{
	public static void main(String[] args) 
	{
		int dbpin=1234;
		int dbamt=1000;
		int pin=1234;

		if (pin==dbpin)

		{
			int amt=100;
			if (amt<=dbamt)

			{
				System.out.println("Transcation Successful");
			}
			else
			{
				System.out.println("insufficient funds");
			}	
	
				}
			else
		{
			System.out.println("Invalid pin!!!");
		}
		}
}
