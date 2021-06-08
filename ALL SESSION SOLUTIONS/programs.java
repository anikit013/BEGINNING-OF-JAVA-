

import java.util.*;
class programs
{   public static int count;
    public static int sum;
    public static void main(String[] args)
     {
            Scanner sc= new Scanner(System.in);
            System.out.println(" Enter the number ");
            int number= sc.nextInt();
            factors(number);    
            Digit(number);    
    }
     public static void factors(int number)
     { int temp=number;
         for(int i=1; i<=number;i++)
         { 
             if(number%i==0)
             {
                count = count+1;
                sum=sum+i;
                System.out.println(i+ " is a  factor of "+temp); //-------> //FACTOR OF A GIVEN NUMBER
             }
        }
        System.out.println();
        System.out.println(" The total number of factors are "+count);  //-------------> //PRINT THE NUMBER OF FACTORS OF A GIVEN NUMBER

        if(count==2)
        {
            System.out.println(" The given number is Prime number ");//FIND THE GIVEN NUMBER IS PERFECT OR NOT

        }
        else 
        {
            System.out.println(" The given number is not a prime number ");
        }
        if (sum==temp) //----------------->FIND THE GIVEN NUMBER IS PERFECT OR NOT
        {
            System.out.println(" The number is a perfect number ");
        }
        else
        {
            System.out.println(" The number is not a perfect number");
        }
        
        
     }
