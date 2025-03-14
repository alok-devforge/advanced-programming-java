interface BasicMath
{
    int add(int a, int b);
    int subtract(int a, int b);
}
interface AdvancedMath extends BasicMath
{
    int multiply(int a, int b);
    int divide(int a, int b);
}
public class B_InterafaceInherit implements AdvancedMath
{
    @Override
    public int add(int a, int b)
    {
        return a + b;
    }
    @Override
    public int subtract(int a, int b)
    {
        return a - b;
    } 
    @Override
    public int multiply(int a, int b)
    {
        return a * b;
    }  
    @Override
    public int divide(int a, int b)
    {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    public static void main(String[] args)
    {
        B_InterafaceInherit ob = new B_InterafaceInherit();
        int a = 20, b = 10;
        System.out.println("Addition: " + a + " + " + b + " = " + ob.add(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + ob.subtract(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + ob.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + ob.divide(a, b));
    }
}