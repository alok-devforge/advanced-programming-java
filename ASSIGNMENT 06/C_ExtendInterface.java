interface Arithmetic
{
    int add(int a, int b);
}
interface AdvancedArithmetic extends Arithmetic
{
    int multiply(int a, int b);
}

public class C_ExtendInterface implements AdvancedArithmetic
{
    @Override
    public int add(int a, int b)
    {
        return a + b;
    }
    @Override
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public static void main(String[] args)
    {
        C_ExtendInterface arithmeticObj = new C_ExtendInterface();
        int a = 20, b = 10;
        System.out.println("Addition of " + a + " and " + b + ": " + arithmeticObj.add(a, b));
        System.out.println("Multiplication of " + a + " and " + b + ": " + arithmeticObj.multiply(a, b));
    }
}