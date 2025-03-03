package package1;
public class Calculate
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public void display()
    {
        int a = 15, b = 25;
        System.out.println("Addition from package1.Calculate: "+a+" + "+b+" = "+add(a, b));
    }
}