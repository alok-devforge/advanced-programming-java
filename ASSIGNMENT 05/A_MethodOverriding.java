class Bank
{
    float getRate()
    {
        return 0f;
    }
}
class SBI extends Bank
{
    @Override
    float getRate()
    {
        return 9f;
    }
}
class PNB extends Bank
{
    @Override
    float getRate()
    {
        return 10f;
    }
}
class BankOfBaroda extends Bank
{
    @Override
    float getRate()
    {
        return 11f;
    }
}
public class A_MethodOverriding
{
    public static void main(String[] args)
    {
        Bank ob= new SBI();
        System.out.println("SBI Rate of Interest: "+ob.getRate()+"%");
        ob= new PNB();
        System.out.println("PNB Rate of Interest: "+ob.getRate()+"%");
        ob= new BankOfBaroda();
        System.out.println("Bank of Baroda Rate of Interest: "+ob.getRate()+"%");
    }
}