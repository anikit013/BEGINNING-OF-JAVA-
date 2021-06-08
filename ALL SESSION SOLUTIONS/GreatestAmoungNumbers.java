//Greatest Amoung Numbers
class GreatestAmoungNumbers
{
    public static void main(String[] args) {
        int[] a={2,5,7,3,6,8};
        Greater(a);
    }
    public static void Greater(int[] a)
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
}