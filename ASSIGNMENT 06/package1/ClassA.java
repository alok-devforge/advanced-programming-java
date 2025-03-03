package package1;

public class ClassA
{
    public int pub = 1;
    protected int prot = 2;
    int def = 3;          
    private int priv = 4;
    public void showAll()
    {
        System.out.println("public: "+pub+", protected: "+prot+", def: "+def+", private: "+priv);
    }
}