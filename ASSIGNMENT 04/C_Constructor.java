class Parent
{
    Parent()
    {
        System.out.println("Parent class constructor is called.");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("Child class constructor is called.");
    }
}
public class C_Constructor
{
    public static void main(String[] args)
    {
        Child ob = new Child();
    }
}