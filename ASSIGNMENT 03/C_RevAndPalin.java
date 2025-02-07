import java.util.Scanner;
public class C_RevAndPalin
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str= ob.nextLine();
        StringBuilder obb= new StringBuilder(str);
        String rev= obb.reverse().toString();
        System.out.println("Reversed String: "+rev);
        if(str.equalsIgnoreCase(rev))
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not palindrome");
    }
}