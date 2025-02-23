interface Operation
{
    int calculate(int a,int b);
}

class Addition implements Operation
{
    @Override
    public int calculate(int a,int b)
    {
        return a+b;
    }
}
class Multiplication extends Addition
{
    @Override
    public int calculate(int a,int b)
    {
        return a*b;
    }
}
public class D_InterfaceOverride
{
    public static void main(String[] args)
    {
        Operation add= new Addition();
        Operation multiply= new Multiplication();      
        int a= 55,b= 23;
        System.out.println("Addition of "+a+" and "+b+": "+add.calculate(a,b));
        System.out.println("Multiplication of "+a+" and "+b+": "+multiply.calculate(a,b));
    }
}