//  Program to swap 2 numbers 

import java.util.*;
class SwapTwoNumbers
{
      public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number to be swapped (Only 2) ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        Logic.LogicSwapTwoNumber(num1,num2);
     }
    
}
class Logic
{
    public static void  LogicSwapTwoNumber(int num1, int num2)
     {
         int temp=0;
         temp=num1;
         num1=num2;
         num2=temp;
         System.out.println(" The swapped number are "+num1+" ,"+num2);
        

        
    }
}

