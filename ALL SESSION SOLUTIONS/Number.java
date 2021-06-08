//TO PRINT DIGIT BY DIGIT OF A GIVEN NUMBER
// SUM OF DIGITS FOR A GIVEN NUMBER

import java.util.*;
class Number
{
    public static void main(String[] args)
     {
        
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number ");
        int num= sc.nextInt();
        Digitbydigit(num);
    }
    public static void Digitbydigit(int num)
    {   int sum=0;
        int rev=0;
        while (num>0)
        {
            int rem=num%10;
            sum=sum+rem;
			System.out.println(rem);
			num=num/10;
            
        }
        System.out.println(" The number sum of number is "+ sum);
    }
}