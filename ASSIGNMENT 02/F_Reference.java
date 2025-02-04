class Calculation
{
    int x;
    void multiply(Calculation ob)
    {
        ob.x= ob.x*6;
    }
}

public class F_Reference
{
    public static void main(String args[])
    {
        Calculation ob= new Calculation();
        ob.x= 5;
        System.out.println("Before method call: "+ob.x);
        ob.multiply(ob);
        System.out.println("After method call: "+ob.x);
    }
}