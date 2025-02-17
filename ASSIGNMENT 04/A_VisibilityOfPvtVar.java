class Super
{
    private int var= 55;
    public int disp()
    {
        return var;
    }
}
class subclass extends Super
{
    public void show()
    {
        System.out.println("Accessing private variable: "+disp());
    }
}
public class A_VisibilityOfPvtVar
{
    public static void main(String args[])
    {
        subclass ob= new subclass();
        ob.show();
    }
}