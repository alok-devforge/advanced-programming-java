import java.util.Scanner;
public class D_MaxAndMin
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= ob.nextInt();
        System.out.print("Enter the numbers in the array: ");
        int arr[]= new int[n];
        for(int x= 0;x<n;x++)
            arr[x]= ob.nextInt();
        int max= arr[0],min= arr[0];
        for(int x= 0;x<n;x++)
        {
            if(arr[x]>max)
                max= arr[x];
            if(arr[x]<min)
                min= arr[x];
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
}