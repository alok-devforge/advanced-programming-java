interface MyInterface
{
    int n= 10;
    String msg= "Hello, Interface!";
}

public class B_Interface implements MyInterface
{
    public static void main(String[] args)
    {
        System.out.println("Value of n from the interface: "+n);
        System.out.println("Message from the interface: "+msg);
    }
}