package package2;
public class Calculate
{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public void display()
    {
        int a= 15,b= 25;
        System.out.println("Multiplication from package2.Calculate: "+a+" * "+b+" = "+multiply(a, b));
    }
}