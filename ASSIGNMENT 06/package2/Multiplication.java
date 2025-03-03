package package2;
public class Multiplication
{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public void display()
    {
        int a= 15,b= 25;
        System.out.println("Multiplication from package2.SameName: "+a+" * "+b+" = "+multiply(a, b));
    }
}