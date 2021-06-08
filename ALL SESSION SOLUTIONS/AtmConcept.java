// Atm Basic Operation
import java.util.*;
class AtmConcept
    {
        public static void main(String[] args) 
        {
            int oldpin=1234;
            int accountbalance=100000;
            Logic.Atm(oldpin,accountbalance);
        }
    }
class Logic
{
    public static void Atm(int oldpin, int accountbalance)
     {
         Scanner sc= new Scanner(System.in);
         System.out.println(" Enter the pin \n Enter the transcation amount");
         int checkpin=sc.nextInt();
         int transcationbalance=sc.nextInt();
         if (oldpin==checkpin && accountbalance>=transcationbalance)
         {
             System.out.println(" The pin is correct and also you have balance for the money to be withdrawn");
         }
         else 
         {
             System.out.println(" Either the pin is wrong or you dont have sufficient balance or both");
         }
        }
    }