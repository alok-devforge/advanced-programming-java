class Person
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person
{
    double salary;
    Employee(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }
    void display()
    {
        super.display(); 
        System.out.println("Salary: " + salary);
    }
}
public class D_PersonEmployee
{
    public static void main(String[] args) 
    {
        Person p1 = new Person("Alok",20);
        System.out.println("Person Details:");
        p1.display();
        System.out.println();
        Employee emp1 = new Employee("Sarthak", 21, 50000.0);
        System.out.println("Employee Details:");
        emp1.display();
    }
}