public class DoWhile
{
    public static void main(String[] args)
    {
        int sum= 0,n= 1;
        do
        {
            sum= sum+n;
            n++;
        }
        while(n<=10);
        System.out.println("Sum from 1 to 10 is: "+sum);
    }
}
