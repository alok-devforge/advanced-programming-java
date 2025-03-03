package package1;
public class Addition
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public void display()
    {
        int a = 15, b = 25;
        System.out.println("Addition from package1.Addition: "+a+" + "+b+" = "+add(a, b));
    }
}