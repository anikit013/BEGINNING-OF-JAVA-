//Program to check the given number is odd or even
import java.util.*;
    class PositiveOrNegative
    {
        public static void main(String[] args) 
        {
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to be checked ");
            int number=sc.nextInt();
            System.out.println(" The entered number is "+number);
            Logic.PositiveOrNegative(number);
        }

    }
    class Logic
    {
        public static void PositiveOrNegative (int number)
         {
             if(number<0)
             {
                 System.out.println(number + " is Negative ");
             }
             else if (number>0)
             {
                 System.out.println(number +" is Positive ");
             }
             else
             {
                 System.out.println(" The Number is zero which is neither negative nor positive");
             }
            
        }
    }