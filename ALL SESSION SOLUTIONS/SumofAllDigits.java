
// SUM OF ALL DIGITS FROM 1 TO N


import java.util.*;
class SumofAllDigits
{
    public static int sum;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Sum1to5();
        DigitSum();
        System.out.println(" Enter a number ");
        int number= sc.nextInt();
       
        Sum(number);
       
        
    }
    //SUM OF ALL DIGITS FROM 1 TO 5
    public static void Sum1to5()
    {
       for(int i=1; i<=5;i++)
       {
           sum=sum+i;
       }
       System.out.println("The sum of digits from 1 to 5 = "+sum);
   }

    public static void Sum(int number)
    {
        for(int i=0;i<=number;i++)
        {
            sum=sum+i;
        }
        System.out.println(" sum from 1 to "+number+" = "+sum);
    }
    // SUM OF ALL DIGITS FROM 50 TO 70
    public static void DigitSum()
    {
       for(int i=50; i<=100;i++)
       {
           sum=sum+i;
       }
       System.out.println("The sum of digits from 50 to 100 = "+sum);
   }
}