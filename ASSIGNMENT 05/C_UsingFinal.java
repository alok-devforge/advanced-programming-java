class FinalDemo
{
    final int x= 10;
    final void disp()
    {
        System.out.println("Immutable value is: "+x);
    }
}
final class FinalClass
{
    void msg()
    {
        System.out.println("This is a final class and cannot be extended.");
    }
}
public class C_UsingFinal
{
    public static void main(String[] args)
    {
        FinalDemo ob= new FinalDemo();
        ob.disp();       
        FinalClass obb = new FinalClass();
        obb.msg();
    }
}