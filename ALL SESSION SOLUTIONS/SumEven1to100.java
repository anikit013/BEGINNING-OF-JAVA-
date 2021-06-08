class SumEven1to100
{
    public static int sum;
    public static void main(String[] args)
         {
      
            for (int i=2 ;i<=100; i+=2)
            { 
                System.out.print(i + ",");
                sum=sum+i;
            }
            System.out.print(" Sum is "+ sum);
        }
    }
