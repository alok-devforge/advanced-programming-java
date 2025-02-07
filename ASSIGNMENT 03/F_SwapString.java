import java.util.Scanner;
public class F_SwapString
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        String st1,st2;
        System.out.print("Enter 1st string: ");
        st1= ob.nextLine();
        System.out.print("Enter 2nd string: ");
        st2= ob.nextLine();
        st1= st1+st2;
        st2= st1.substring(0,st1.length()-st2.length());
        st1= st1.substring(st2.length());
        System.out.print("String after swapping:- \n st1: "+st1+"\n st2: "+st2);
    }
}