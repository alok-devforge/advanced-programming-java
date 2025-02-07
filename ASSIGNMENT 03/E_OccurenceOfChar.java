import java.util.Scanner;
public class E_OccurenceOfChar
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter any String of 50 words: ");
        String str= ob.nextLine();
        System.out.print("Enter a character whose occurence is to be counted: ");
        char ch= ob.next().charAt(0);
        char arr[]= str.toCharArray();
        int c= 0;
        for(int x= 0;x<arr.length;x++)
        {
            if(arr[x]==ch)
                c++;
        }
        if(c==0)
             System.out.print("Character "+ch+"is not present in the string");
        else
             System.out.print("Character "+ch+" occured "+c+" times");
    }
}