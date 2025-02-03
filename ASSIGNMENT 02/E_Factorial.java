import java.util.*;
public class E_Factorial
{
    int factorial(int x)
    {
        if(x==1 || x==0)
            return 1;
        else
            return x*factorial(x-1);
    }    
    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= ob.nextInt();
        E_Factorial f= new E_Factorial();
        System.out.println("Factorial of "+n+" is : "+f.factorial(n));
    }
}