// Program to print Swap Two inters without Third Variable
import java.util.*;
class SwapTwoNumberWithoutThirdVariable
{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter two numbers that needs to be swapped ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println(" The number before swapped are" +num1+","+num2);
        Logic.SwapTwoNumber(num1,num2);
    }
}
class Logic
{
    public static void SwapTwoNumber(int num1, int num2)
     
    {
      num1=num1+num2;
      num2=num1-num2;
      num1=num1-num2;
      System.out.println(" The swapped nuumber are "+num1 +","+num2);

    }
}