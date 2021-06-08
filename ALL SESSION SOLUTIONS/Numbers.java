//NUMBER IS POSITIVE AND EVEN ZINAG ROCKS, POSITIVE And ODD DINGA ROCKS AND -VE TINGI ROCKS
import java.util.*;
class Numbers 
{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number to be checked ");
        int num=sc.nextInt();
        Logic.Numb(num);
    }
}
class Logic
{
    public static void Numb(int num)
    {
        if (num>=1 && num%2==0)
        {
            System.out.println(" Zinga Rocks");
        }
        else if (num>=1 && (num%2)!=0)
        {
            System.out.println(" Dinga Rocks ");
        }
        else 
        {
            System.out.println(" Tingi Rocks ");
        }
    } 
}