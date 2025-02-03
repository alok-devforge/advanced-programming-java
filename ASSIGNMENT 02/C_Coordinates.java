public class C_Coordinates
{
    int x,y;
    public void storeValue(int a,int b)
    {
        x= a;
        y= b;
    }
    void display()
    {
        System.out.println("The coordinates are- x: " + x + " y: " + y);
    }
    public boolean checkEquality(C_Coordinates next)
    {
        if(x==next.x&&y==next.y)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        C_Coordinates p1= new C_Coordinates();
        C_Coordinates p2= new C_Coordinates();
        p1.storeValue(3,8);
        p2.storeValue(3, 8);
        p1.display();
        p2.display();
        if(p1.checkEquality(p2))
            System.out.println("The two coordinates are equal");
        else
            System.out.println("The coordinates are not equal");
    }
}