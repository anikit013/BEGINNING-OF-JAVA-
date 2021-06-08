    //Greatest Amoung Numbers using user input
    import java.util.*;
    class GreatestAmoungUserInput
    {
        public static void main(String[] args)
         {
            //int[] a={2,5,7,3,6,8};
            inputs(a);
            Greater(a);
        }
        public static void Greater(int[] a);
        {
            int greater=a[0];
            for (int i=1;i<a.length;i++)
            {
                if(a[i]> greater)
                {
                    greater=a[i];
                }
            }
            System.out.println(" The greatest Number is "+ greater);
        }
        public static int[]  inputs()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter the total number of numbers to be inserted ");
            System.out.println(" Enter the numbers ");
            int count=sc.nextInt();
            int[] a= new a[count];
            for (int i=0;i<=count;i++)
            {
                a[i]=sc.nextInt();
            }
            return a;
        }
    }
