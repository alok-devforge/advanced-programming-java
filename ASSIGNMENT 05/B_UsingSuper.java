class Base
{
    Base(int x)
    {
        System.out.println("Base class constructor called with value: "+x);
    }
}
class Derived extends Base
{
    Derived(int x,int y)
    {
        super(x);
        System.out.println("Derived class constructor called with value: "+y);
    }
}
public class B_UsingSuper
{
    public static void main(String[] args)
    {
        Derived ob= new Derived(55,23);
    }
}