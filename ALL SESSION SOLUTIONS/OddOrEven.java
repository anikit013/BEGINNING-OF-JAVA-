//Program to check the given number is odd or even
import java.util.*;
    class OddOrEven
    {
        public static void main(String[] args) 
        {
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to find out Odd or Even ");
            int number=sc.nextInt();
            System.out.println(" The entered number is "+number);
            Logic.OddOrEven(number);
        }

    }
    class Logic
    {
        public static void OddOrEven (int number)
         {
             if (number ==0)
             {
            
                    System.out.println(" The Number is zero which is neither negative nor positive");
            
             }
             else if(number%2==0)
             {
                 System.out.println(number + " is Even ");
             }
             else
             {
                 System.out.println(number +" is Odd");
             }

             
            
        }
    }