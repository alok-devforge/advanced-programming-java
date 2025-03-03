import package1.ClassA;

public class A_AccessSpecifierInPackage
{
    public static void main(String[] args)
    {
        ClassA obj = new ClassA();
        System.out.println("Accessing public member: " + obj.pub);
        System.out.println("Using public method to view all members:");
        obj.showAll();
    }
}