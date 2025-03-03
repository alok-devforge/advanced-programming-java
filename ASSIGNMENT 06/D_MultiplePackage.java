import package1.Calculate;
public class D_MultiplePackage
{
    public static void main(String[] args)
    {
        Calculate ob1 = new Calculate();
        ob1.display();
        package2.Calculate ob2 = new package2.Calculate();
        ob2.display();
    }
}  