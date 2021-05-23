import java.util.Scanner;
class VowelOrConsonent
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		LogicVowelOrConsonent.check(ch);
	}
}
	 class LogicVowelOrConsonent
	 {
		 public static void check(char ch)
		 {
			 if (ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
			 {
				 System.out.println(ch +" is vowel");
			 }
			 else 
			 {
				 System.out.println( ch + " is consonent");
			 }
	 }
	 }

