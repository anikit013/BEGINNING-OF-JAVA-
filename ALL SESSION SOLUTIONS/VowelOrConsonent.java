// A program to Check whether a given number is vowel or consonent
import java.util.*;
class VowelOrConsonent
{ 
    public static void main(String[] args)
     {
        
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter an alphabet");
    char character = sc.next().charAt(0);
    Logic.VowelOrConsonent(character);
     }
}
class Logic
{
    public static void VowelOrConsonent(char character)
     {
         if (character<=64 && character<=124)
         {
             System.out.println(" The number are neither Vowel nor Consonent, entered alphabet is invalid");
         }

         else if  (character=='A' || character=='E' || character=='I'|| character=='O'|| character=='U'|| character =='a' || character=='e' || character =='i' || character=='o' || character=='u')
         {
             System.out.println(" The entered alphabet "+character+ " is vowel");

         }
         else 
         {
             System.out.println(" The entered aplhabet  "+character+" is consonent");
         }
        
    }
}