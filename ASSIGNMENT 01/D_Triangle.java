public class D_Triangle
{
    public static void main(String[] args)
    {
        int n= 5;
        System.out.println("Triangle Pattern with numbers: ");
        for(int x= 1;x<=n;x++)
        {
            for(int s= 4-x;s>=0;s--)
            {
                System.out.print(" ");
            }
            for(int y= 1;y<=x;y++)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}