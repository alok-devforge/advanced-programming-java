public class B_Student
{
    String name;
    int roll;
    float marks;
    void display()
    {
        System.out.println("Name: "+name+"\nRoll: "+roll+"\nMarks: "+marks);
    }
    public static void main(String[] args)
    {
        B_Student s1= new B_Student();
        B_Student s2= new B_Student();
        s1.name= "Alok Kumar";
        s1.roll= 55;
        s1.marks= 88.6f;
        s1.display();
        s2.name= "Sarthak";
        s2.roll= 3;
        s2.marks= 92f;
        s2.display();
    }   
}