class VowelOrConsonant 
{
	public static void main(String[] args) 
	{
		char ch='A';
		check(ch);
	}
		public static void check (char ch)
	{
			if (ch=='A' || ch=='E'|| ch=='I'|| ch=='O' || ch=='U'|| ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u' )
			{
				System.out.println("It is vowel");
			}
			else
		{
				System.out.println("It is consonant");
				}
	}
}

