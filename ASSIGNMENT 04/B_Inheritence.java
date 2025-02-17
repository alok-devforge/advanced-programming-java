class Grandparent
{
    void dispGrandparent()
    {
        System.out.println("This is the Grandparent class.");
    }
}
class Parent extends Grandparent
{
    void dispParent()
    {
        System.out.println("This is the Parent class.");
    }
}
class Child extends Parent
{
    void dispChild()
    {
        System.out.println("This is the Child class.");
    }
}
public class B_Inheritence
{
    public static void main(String[] args)
    {
        Child ob = new Child();
        ob.dispGrandparent();
        ob.dispParent();     
        ob.dispChild();       
    }
}