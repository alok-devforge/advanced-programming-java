class Test
{
    int x;
    public int y;
    void initialize(int a,int b)
    {
        x= a;
        y= b;
    }
    void display()
    {
        System.out.println("Default Variable: "+x);
        System.out.println("Public Variable: "+y);
    }
}

public class G_AccessSpecifier
{
    public static void main(String args[])
    {
        Test ob= new Test();
        ob.initialize(10,21);
        System.out.println("Initial Values: ");
        ob.display();
        System.out.println("After changing public Values directly: ");
        ob.y= 101;
        ob.display();
    }
}