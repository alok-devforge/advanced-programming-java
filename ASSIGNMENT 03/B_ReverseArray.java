import java.util.Scanner;
public class B_ReverseArray
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
        System.out.print("Reversed Array: ");
        for(int x= 0;x<n/2;x++)
        {
            int temp= arr[x];
            arr[x]= arr[n-x-1];
            arr[n-x-1]= temp;
        }
        for(int x= 0;x<n;x++)
            System.out.print(arr[x]+" ");
    }
}