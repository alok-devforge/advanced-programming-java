class Animal
{
    void eat()
    {
        System.out.println("Animals eat food.");
    }
}
class Mammal extends Animal
{
    void breathe()
    {
        System.out.println("Mammals breathe air.");
    }
}
class Dog extends Mammal
{
    void bark()
    {
        System.out.println("Dogs bark.");
    }
}
public class B_Inheritence
{
    public static void main(String[] args)
    {
        Dog ob= new Dog();
        ob.eat();     
        ob.breathe(); 
        ob.bark();    
    }
}