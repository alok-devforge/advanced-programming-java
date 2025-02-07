import java.util.*;
public class A_Armstrong
{
    static boolean checkArm(int num)
    {
        int sum= 0,n= num;
        while(n!=0)
        {
            int d= n%10;
            sum= sum+(int)Math.pow(d,3);
            n= n/10;
        }
        return sum==num;
    }
    public static void main(String args[])
    {
        System.out.print("Armstrong number b/w 200 and 400 are: ");
        for(int x= 200;x<=400;x++)
        {
            if(checkArm(x))
                System.out.print(x+" ");
        }
    }
}