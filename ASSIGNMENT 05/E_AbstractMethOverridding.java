abstract class AbstractOverride
{
    public abstract void disp(int arr[]);
}
class ConcreteOverride extends AbstractOverride
{
    @Override
    public void disp(int... arr)
    {
        System.out.print("Nums: ");
        for (int i= 0;i<arr.length;i++)
        { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class E_AbstractMethOverridding
{
    public static void main(String[] args)
    {
        ConcreteOverride ob= new ConcreteOverride();
        System.out.println("Displaying numbers passed individually:");
        ob.disp(10, 20, 30, 40);
        System.out.println("Displaying numbers passed as an array:");
        int extra[]= {50, 60, 70};
        ob.disp(extra);
    }
}